package com.xworkz.JunctionBox;

public class JunctionDto {
	private String junctionBox_type;
	private String brand;
	private int no_Socket;
	private int price;
	
	public JunctionDto(String junctionBox_type, String brand, int no_Socket, int price) {
		System.out.println("Inside Constructor method");
		this.junctionBox_type = junctionBox_type;
		this.brand = brand;
		this.no_Socket = no_Socket;
		this.price = price;
	}

	public String getJunctionBox() {
		return junctionBox_type;
	}

	public void setJunctionBox(String junctionBox_type) {
		this.junctionBox_type = junctionBox_type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNo_Socket() {
		return no_Socket;
	}

	public void setNo_Socket(int no_Socket) {
		this.no_Socket = no_Socket;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

}
