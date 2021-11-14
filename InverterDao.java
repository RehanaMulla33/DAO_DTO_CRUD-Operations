package com.xworkz.Inverter;

import com.xworkz.Inverter.InverterDto;

public class InverterDao {
	InverterDto inverter[] = new InverterDto[5];
	int index = 0;

	public InverterDao() {
		System.out.println("Iron Box Dao created");
	}
	
	public InverterDto createObject(String capacity, String brand, int battery_weight, int price) {
		InverterDto inverter=new InverterDto( capacity,  brand, battery_weight, price);
		return inverter;
	}

	public void saveDTO(InverterDto dto) {
	//	System.out.println("Inside save method");
		inverter[index] = dto;
		index++;
	}

	public void displayInfo() {
		for (int i = 0; i < inverter.length; i++) {
			System.out.println(inverter[i].getBrand());
			System.out.println(inverter[i].getBattery_weight());
			System.out.println(inverter[i].getPrice());
			System.out.println(inverter[i].getCapacity());
			System.out.println("________________");
		}
	}

	public void displayByBrandName(String brandname) {
		for (int i = 0; i < inverter.length; i++) {
			if (inverter[i].getBrand().equals(brandname)) {
				System.out.println(inverter[i].getBrand());
				System.out.println(inverter[i].getBattery_weight());
				System.out.println(inverter[i].getPrice());
				System.out.println(inverter[i].getCapacity());
			}
		}
	}
	public void updateByBrand(String brand, int newPrice) {
		for (int i = 0; i < inverter.length; i++) {
			if(inverter[i].getBrand().equals(brand)) {
				inverter[i].setPrice(newPrice);
					
			}
		
	}
}
	public void deleteByBrandName(String brandname) {
		for (int i = 0; i < inverter.length; i++) {
			if (inverter[i].getBrand().equals(brandname)) {
				
				inverter[i]=null;
			}
			}
		}
		
	

	}





