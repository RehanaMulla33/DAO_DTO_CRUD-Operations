package com.xworkz.Inverter;

public class InverterDto {
	private String capacity;
	private String brand;
	private int battery_weight;
	private int price;
	
	
	public InverterDto(String capacity, String brand, int battery_weight, int price) {
		System.out.println("Inside constructor method");
		this.capacity = capacity;
		this.brand = brand;
		this.battery_weight = battery_weight;
		this.price = price;
	}


	public String getCapacity() {
		return capacity;
	}


	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getBattery_weight() {
		return battery_weight;
	}


	public void setBattery_weight(int battery_weight) {
		this.battery_weight = battery_weight;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
}
