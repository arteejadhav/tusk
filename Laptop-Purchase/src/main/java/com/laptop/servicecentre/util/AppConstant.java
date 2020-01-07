package com.laptop.servicecentre.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.laptop.servicecentre.entity.Laptop;

public class AppConstant {

	public static Map<String, String> laptopMap =  new HashMap<>();
	public static List<Laptop> laptopList =  new ArrayList<Laptop>();
	
	static {
		laptopMap.put("i3", "Dell");
		laptopMap.put("i5", "Dell");
		laptopMap.put("i6", "Acer");
		laptopMap.put("i7", "Lenovo");
	}
	
	static {
		laptopList.add(new Laptop("i3", "Dell", 23000));
		laptopList.add(new Laptop("i5", "Dell", 45000));
		laptopList.add(new Laptop("i3", "Lenovo", 38000));
		laptopList.add(new Laptop("i5", "Lenovo", 67000));
		laptopList.add(new Laptop("i3", "Apple", 230000));
		laptopList.add(new Laptop("i2", "Apple", 90000));
		
	}
}
