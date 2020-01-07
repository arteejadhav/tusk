package com.laptop.servicecentre;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.laptop.servicecentre.entity.Laptop;
import com.laptop.servicecentre.service.PurchaseService;
import com.laptop.servicecentre.util.PurchaseUtils;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
	
	private PurchaseService purchaseService =  new PurchaseService();
	
	private PurchaseUtils util =  new PurchaseUtils();
	
	@GetMapping("/company-name")
	public String getCompany(@RequestParam("model") String model) {
		return purchaseService.getCompanyName(model);
	}
	
	@GetMapping("/laptop-list/model")
	public List<Laptop> getLaptopListByModel(@RequestParam("model") String model){
		
		return purchaseService.getLaptopListByModel(model);
	}
	
	@GetMapping("/laptop-list/company")
	public List<Laptop> getLaptopListByCompany(@RequestParam("company") String company){
		
		return purchaseService.getLaptopListByComapny(company);
	}
	
	@GetMapping("/laptop-list/price")
	public List<Laptop> getLaptopListByPrice(@RequestParam("startPrice") String startPrice, @RequestParam("endPrice") String endPrice){
		
		return purchaseService.getLaptopListByPriceRange(Float.parseFloat(startPrice), Float.parseFloat(endPrice));
	}
	
	@PostMapping("/add-new-laptop")
	public void addNewLaptop(@RequestBody String newEntry) {
		Laptop lp = util.prepareLaptopObject(newEntry);
		purchaseService.addNewEntryToList(lp);
	}
}
