package com.laptop.servicecentre.util;

import org.codehaus.jackson.map.ObjectMapper;

import com.laptop.servicecentre.entity.Laptop;

public class PurchaseUtils {
	static private ObjectMapper mapper =  new ObjectMapper();
	
	// function to convert given string to Laptop class object
	public Laptop prepareLaptopObject(String jsonString) {
		Laptop lp = null;
		try {
			lp = mapper.readValue(jsonString, Laptop.class); // to convert json string to Laptop object
		} catch (Exception e) {
			System.out.println(e);
		}
		return lp;
	}

}
