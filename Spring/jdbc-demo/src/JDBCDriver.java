//STEP 1. Import required packages
import java.sql.*;
import java.util.Scanner;

class JDBCDRIVER {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/university";

   //  Database credentials
   static final String USER = "avinash";
   static final String PASS = "admin";
   
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName(JDBC_DRIVER);

      
      
      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      
//      String sql;
//      sql = "create table student (sid varchar(10) primary key, name varchar(50), age int)";
//      ResultSet rs = stmt.executeQuery(sql);

      int id = sc.nextInt();
      sc.nextLine();
      String branch = sc.nextLine();
      String name = sc.nextLine();
      int age = sc.nextInt();
      
      String sql1;
      sql1 = "insert into branch values (" + id +",\""+branch+"\" ,\"" + name +"\" ," + age +")";
      int rs1 = stmt.executeUpdate(sql1);
    
      System.out.println("row successfully inserted");
      System.out.println("The value is "+rs1);
      
      
      
      //STEP 5: Extract data from result set
//       while(rs1.next()){
//          //Retrieve by column name
//          String id  = rs1.getString("sid");
//          int age = rs1.getInt("age");
//          String name = rs1.getString("name");
//          
//
//          //Display values
//          System.out.print("ID: " + id);
//          System.out.print(", Age: " + age);
//          System.out.print(", Name: " + name);
//          
//       }



      //STEP 6: Clean-up environment
      
      stmt.close();
      conn.close();
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end FirstExample
