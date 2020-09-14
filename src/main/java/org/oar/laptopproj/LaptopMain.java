package org.oar.laptopproj;

import java.util.List;

public class LaptopMain {

	public static void main(String[] args) {
		
		//LaptopDto laptopDto=new LaptopDto();
		
		/*laptopDto.setLaptopbrand("Asus");
		laptopDto.setLmodelname("X541UA");
		laptopDto.setLspecification("4gb ram,14.6inch diplay");
		laptopDto.setLprice(28000.50D);
		laptopDto.setLratings(4.1D);*/
	
		
	//	LaptopDao dao = new LaptopDao();
		/*dao.saveLaptopDetails(laptopDto);
		System.out.println("operation successful");*/
		
	/*	LaptopDao laptopDao=new LaptopDao();
      LaptopDto laptopDto1=laptopDao.getLaptopDetailsById("Lenovo00S1454955");
		LaptopDto laptopDto2=laptopDao.getLaptopDetailsById("Apple00S1452616");
		System.out.println("laptopDto1"+laptopDto1);
		System.out.println("laptopDto2"+laptopDto2);

		*/
		//dao.updateLaptopDetailsById("Lenovo00S1454955", 40000.89D);
		
		//dao.deleteLaptopDetails(laptopDto);
		
	/*	HqlOperLaptop hqlOperLaptop = new HqlOperLaptop();
		List<LaptopDto> laptopDetails1 = hqlOperLaptop.getLaptopDetails();
		List<LaptopDto> laptopDetails2 = hqlOperLaptop.getLaptopDetails();
		System.out.println("size of laptopDtails1 is "+laptopDetails1.size());
		System.out.println("size of laptopDetails2 is "+laptopDetails2.size());*/
		
		HqlOperLaptop hqlOperLaptop= new HqlOperLaptop();
			
		/*LaptopDto laptopDto = hqlOperLaptop.getLaptopDetailsByLid("Lenovo00S1454955");
			System.out.println(laptopDto);*/
				//hqlOperLaptop.updateLaptopPriceById("Lenovo00S1454955", 56890.87D);
			hqlOperLaptop.deleteById("Lenovo00S1454955");



	}

}
