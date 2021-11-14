package com.xworkz.JunctionBox;

import com.xworkz.JunctionBox.JunctionDao;

import com.xworkz.JunctionBox.JunctionDto;


public class Junction_Tester {

	public static void main(String[] args) {
		JunctionDao junctionDao=new JunctionDao();
		
		JunctionDto cona=new JunctionDto("Wall wount","CONA",3,2000);
		junctionDao.saveDTO(cona);
		
		JunctionDto neoware=new JunctionDto("Single Adaptert","NeoCare",5,3000);
		junctionDao.saveDTO(neoware);
		
		JunctionDto ambert=new JunctionDto("Strip","Ambert",4,4000);
		junctionDao.saveDTO(ambert);
		
		JunctionDto qsd=new JunctionDto("Power conditioner","QSD",6,5000);
		junctionDao.saveDTO(qsd);
		
		junctionDao.saveDTO(qsd);
		
		System.out.println("Before update");
		junctionDao.displayByBrandName("Ambert");
		
		junctionDao.updateByBrand("Ambert", 4500);
		
		System.out.println("After update");
		junctionDao.displayByBrandName("Ambert");
		
		junctionDao.deleteByBrandName("Ambert");
		junctionDao.displayInfo();
		

	}

}
