package com.xworkz.Inverter;

import com.xworkz.Inverter.InverterDao;
import com.xworkz.Inverter.InverterDto;

public class Inverter_Tester {

	public static void main(String[] args) {
		InverterDao inverterDao=new InverterDao();
		InverterDto altima=new InverterDto("150 AH","Altima",55,2000);
		inverterDao.saveDTO(altima);
		
		InverterDto exide=new InverterDto("190 AH","Exide",55,3500);
		inverterDao.saveDTO(exide);

		InverterDto luminous=new InverterDto("200 AH","Luminous",55,5000);
		inverterDao.saveDTO(luminous);

		InverterDto livguard=new InverterDto("165 AH","Livguard",55,6000);
		inverterDao.saveDTO(livguard);

		inverterDao.saveDTO(exide);
		inverterDao.displayInfo();
		
		System.out.println("Before update");
		inverterDao.displayByBrandName("Exide");
		inverterDao.updateByBrand("Exide", 3000);
		System.out.println("After update");
		inverterDao.displayByBrandName("Exide");
		inverterDao.deleteByBrandName("Livguard");
		inverterDao.displayInfo();
		
		
		
		
	}

}
