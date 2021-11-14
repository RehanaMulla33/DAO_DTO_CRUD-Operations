package com.xworkz.IronBox;
import com.xworkz.IronBox.IronBoxDto;
import com.xworkz.IronBox.IronBoxDao;


public class IronBox_Tester {

	public static void main(String[] args) {
		IronBoxDao ironboxDao=new IronBoxDao();
		IronBoxDto philips=new IronBoxDto(2000,"Philips","2000 W","Dry");
		ironboxDao.saveDTO(philips);
		
		IronBoxDto bajaj=new IronBoxDto(1500,"Bajaj","1500 W","Steam");
		ironboxDao.saveDTO(bajaj);
		
		IronBoxDto usha=new IronBoxDto(1000,"Usha","1000 W","Garment steamer");
		ironboxDao.saveDTO(usha);
		
		IronBoxDto panasonic=new IronBoxDto(3000,"Panasonic","2500 W","LP gas");
		ironboxDao.saveDTO(panasonic);
		
		ironboxDao.saveDTO(panasonic);
		
		System.out.println("Before update");
		ironboxDao.displayByBrandName("Usha");
		
		ironboxDao.updateByBrand("Usha", 1200);
		
		System.out.println("After update");
		ironboxDao.displayByBrandName("Usha");
		

		ironboxDao.deleteByBrandName("Panasonic");
		ironboxDao.displayInfo();
		
		
		

	}

}
