package com.testng.features;

import org.testng.annotations.Test;

public class Invocations_Demo {

	
	@Test
	private void browserlaunch() {
System.out.println("Launch_Browser");
	}
	@Test
	private void urlLaunch() {
		System.out.println("Launch_URL");
	}
	@Test(priority = 1,invocationCount = 3,
			invocationTimeOut = 4000)
	private void refersh() {
		System.out.println("referesh");
	} 
}
