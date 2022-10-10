package com.testng.features;

import org.testng.annotations.Test;

public class Description_Demo {
	@Test(description = "Launch The Browser")
	private void browserlaunch() {
System.out.println("Launch_Browser");
	}
	@Test(description = "Open The Url")
	private void urlLaunch() {
		System.out.println("Launch_URL");
	}
	@Test(priority = 1,invocationCount = 3,
			invocationTimeOut = 4000,description = "refresh the page")
	private void refersh() {
		System.out.println("referesh");
	} 

}
