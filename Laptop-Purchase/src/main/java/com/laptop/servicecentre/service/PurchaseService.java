package com.laptop.servicecentre.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.laptop.servicecentre.entity.Laptop;
import com.laptop.servicecentre.util.AppConstant;

public class PurchaseService {

	
	public String getCompanyName(String model) {
		return AppConstant.laptopMap.get(model);
	}
	
	public List<Laptop> getLaptopListByModel(String model){
		List<Laptop> lpList =  new ArrayList<Laptop>();
		
		Iterator<Laptop> litr =  AppConstant.laptopList.iterator();
		
		while(litr.hasNext()) {
			Laptop lp =  litr.next();
			if(lp.getModel().equals(model)) {
				lpList.add(lp);
			}
		}
		return lpList;
	}
	
	public List<Laptop> getLaptopListByComapny(String company){
		List<Laptop> lpList =  new ArrayList<Laptop>();
		
		Iterator<Laptop> litr =  AppConstant.laptopList.iterator();
		
		while(litr.hasNext()) {
			Laptop lp =  litr.next();
			if(lp.getCompany().equals(company)) {
				lpList.add(lp);
			}
		}
		return lpList;
	}
	
	public List<Laptop> getLaptopListByPriceRange(float startPrice, float endPrice){
		List<Laptop> lpList =  new ArrayList<Laptop>();
		
		Iterator<Laptop> litr =  AppConstant.laptopList.iterator();
		
		while(litr.hasNext()) {
			Laptop lp =  litr.next();
			if(lp.getPrice()>=startPrice && lp.getPrice()<=endPrice) {
				lpList.add(lp);
			}
		}
		return lpList;
	}

	public void addNewEntryToList(Laptop lp) {
		AppConstant.laptopList.add(lp);
	}
}
