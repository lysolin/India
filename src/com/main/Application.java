package com.main;

import com.model.Company;
import com.model.Product;
import com.model.User;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Testing 1 2 3...");
		User user = new User("David", "Bowie");
		Company company = new Company("Transactional");
		Product product = new Product("Pastry", "Catering");
		System.out.println("Owner: "+user.getFirstName()+" "+user.getLastName());
		System.out.println("Works in: "+company.getCompanyName());
		System.out.println("Services: "+product.getProductCategory()+"/"+product.getProductName());	
	}
}
