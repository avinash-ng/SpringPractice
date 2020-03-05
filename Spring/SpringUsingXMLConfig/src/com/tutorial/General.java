package com.tutorial;

public class General {
	private int nume;
	private int nama;
	
	
	General(String a) {
		System.out.println("Hi hello " + a);
	}
	
	public int getNume() {
		return nume;
	}
	public void setNume(int nume) {
		this.nume = nume;
	}
	public int getNama() {
		return nama;
	}
	public void setNama(int nama) {
		this.nama = nama;
	}
	
	
	int add() {
		return nume+nama;
	}


}
