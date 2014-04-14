package com.main;

import com.model.User;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Testing 1 2 3...");
		User user = new User("David", "Bowie");
		System.out.println("Owner: "+user.getFirstName()+" "+user.getLastName());
	}

}
