package com.testng.features;

import org.testng.annotations.Test;

public class Depends_On_Methods {

	@Test
	private void laptop() {
System.out.println("laptopPurchase");
	}
	@Test
	private void zebronics() {
		System.out.println("zebronics ");
			}
	@Test(priority = 1,dependsOnMethods = "laptop",alwaysRun = true)
	private void offer() {
System.out.println("laptops offer price");
	}
}
