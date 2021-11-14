package com.xworkz.clock;

public class ClockDto {
	private String type;
	private String brand;
	private int price;
	private String power_consumption;

	public ClockDto(String type, String brand, int price, String power_consumption) {
		System.out.println("inside constructor method");
		this.type = type;
		this.brand = brand;
		this.price = price;
		this.power_consumption = power_consumption;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPower_consumption() {
		return power_consumption;
	}

	public void setPower_consumption(String power_consumption) {
		this.power_consumption = power_consumption;
	}
}
