package com.mail;
// Java program to send email

//import java.util.*;
//import javax.mail.*;
//import javax.mail.internet.*;
//import javax.activation.*;
//import javax.mail.Session;
//import javax.mail.Transport;
//
//
//public class SendEmail
//{
//
//    public static void main(String [] args)
//    {
//        // email ID of Recipient.
//        String sender = "avinashkolaparthi@gmail.com";
//
//        // email ID of Sender.
//        String recipient = "16pa1a0576@vishnu.edu.in";
//
//        // using host as localhost
//        String host = "127.0.0.1";
//        String gmailPassword = "Alluarjun123$";
//        // Getting system properties
//        Properties properties =new Properties();
//
//        // Setting up mail server
//        properties.put("mail.smtp.host", "smtp.gmail.com");
//        properties.put("mail.smtp.auth", "true");
//        properties.put("mail.smtp.starttls.enable", "true");
////        properties.setProperty("mail.smtp.host", "smtp.gmail.com");
//        properties.setProperty("mail.smtp.port", "587");
////        properties.setProperty("mail.smtp.user", sender);
////        properties.setProperty("mail.smtp.password", gmailPassword);
//        // creating session object to get properties
//        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator(){
//            protected PasswordAuthentication getPasswordAuthenticatio() {
//                return new PasswordAuthentication(sender, gmailPassword);
//            }
//        });
//
//
//        try
//        {
//            // MimeMessage object.
//            MimeMessage message = new MimeMessage(session);
//
//            // Set From Field: adding senders email to from field.
//            message.setFrom(new InternetAddress(sender));
//
//            // Set To Field: adding recipient's email to from field.
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
//
//            // Set Subject: subject of the email
//            message.setSubject("This is Suject");
//
//            // set body of the email.
//            message.setText("This is a test mail");
//
//            // Send email.
//            System.out.println(message);
//            Transport.send(message);
//            System.out.println("Mail successfully sent");
//        }
//        catch (MessagingException mex)
//        {
//            mex.printStackTrace();
//        }
//    }
//}


import com.sun.mail.smtp.SMTPTransport;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class SendEmail {

    // for example, smtp.mailgun.org
    private static final String SMTP_SERVER = "smtp.gmail.com";
    private static final String USERNAME = "avinashkolaparthi@gmail.com";
    private static final String PASSWORD = "Alluarjun123$";

    private static final String EMAIL_FROM = "avinashkolaparthi@gmail.com";
    private static String EMAIL_TO = "";
    
    private static String EMAIL_TO_CC = "";

    private static final String EMAIL_SUBJECT = "Test Send Email via SMTP";
    private static final String EMAIL_TEXT = "172.16.18.125:8080/SpringMVCDemoProject/login/";
    private static String localhost = "127.0.0.1";
    
    public void setToAddress(String to) {
    	EMAIL_TO = to;
    }
    
   public void sendMail() {

        Properties prop = System.getProperties();
        prop.put("mail.smtp.starttls.enable","true");
        prop.put("mail.smtp.host",SMTP_SERVER); //optional, defined in SMTPTransport
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.port", "587"); // default port 25

        Session session = Session.getInstance(prop, null);
        Message msg = new MimeMessage(session);

        try {

            // from
            System.out.println("Hi hello");
            msg.setFrom(new InternetAddress(EMAIL_FROM));

            // to
            msg.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(EMAIL_TO, false));

            // cc
//            msg.setRecipients(Message.RecipientType.CC,
//                    InternetAddress.parse(EMAIL_TO_CC, false));

            // subject
            msg.setSubject(EMAIL_SUBJECT);

            // content
            msg.setText(EMAIL_TEXT);

            msg.setSentDate(new Date());

            // Get SMTPTransport
            SMTPTransport t = (SMTPTransport) session.getTransport("smtp");

            // connect
            t.connect(SMTP_SERVER, USERNAME, PASSWORD);

            // send
            System.out.println("Hi hello");
            t.sendMessage(msg, msg.getAllRecipients());


            System.out.println("Response: " + t.getLastServerResponse());

            t.close();

        } catch (MessagingException e) {
            e.printStackTrace();
        }


    }
}

