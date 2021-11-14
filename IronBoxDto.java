package com.xworkz.IronBox;

public class IronBoxDto {
	private int price;
	private String brand;
	private String power_consumption;
	private String type;

	public IronBoxDto(int price, String brand, String power_consumption, String type) {
		System.out.println("Inside Constructor method");
		this.price = price;
		this.brand = brand;
		this.power_consumption = power_consumption;
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPower_consumption() {
		return power_consumption;
	}

	public void setPower_consumption(String power_consumption) {
		this.power_consumption = power_consumption;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
