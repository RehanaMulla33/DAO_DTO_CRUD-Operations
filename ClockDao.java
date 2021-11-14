package com.xworkz.clock;

import com.xworkz.Inverter.InverterDto;
import com.xworkz.IronBox.IronBoxDto;

public class ClockDao {
	ClockDto clock[] = new ClockDto[4];
	int index = 0;

	public ClockDao() {
		System.out.println("Iron Box Dao created");
	}
	

	public ClockDto createObject(String type, String brand, int price, String power_consumption) {
		ClockDto clock=new ClockDto(type,brand,price, power_consumption);
		return clock;
	}

	public void saveDTO(ClockDto dto) {
		System.out.println("Inside save method");
        clock[index] = dto;
		index++;
	}

	public void displayInfo() {
		for (int i = 0; i < clock.length; i++) {
			System.out.println(clock[i].getBrand());
			System.out.println(clock[i].getPower_consumption());
			System.out.println(clock[i].getPrice());
			System.out.println(clock[i].getType());
			System.out.println("________________");
		}
	}

	public void displayByBrandName(String brandname) {
		for (int i = 0; i < clock.length; i++) {
			if (clock[i].getBrand().equals(brandname)) {
				System.out.println(clock[i].getBrand());
				System.out.println(clock[i].getPower_consumption());
				System.out.println(clock[i].getPrice());
				System.out.println(clock[i].getType());
			}
		}
	}
	public void updateByBrand(String brand, int newPrice) {
		for (int i = 0; i < clock.length; i++) {
			if(clock[i].getBrand().equals(brand)) {
				clock[i].setPrice(newPrice);
					
			}
		
	}
}
	public void deleteByBrandName(String brandname) {
		for (int i = 0; i < clock.length; i++) {
			if (clock[i].getBrand().equals(brandname)) {
				
				clock[i]=null;
			}
			}
		}
}



