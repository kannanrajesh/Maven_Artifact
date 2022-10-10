package com.testng.features;

import org.testng.annotations.Test;

public class Priority_Demo {	
	@Test(priority = 1)
	private void ug() {
		System.out.println("UG");
	}
	@Test(priority = 2)
	private void pg() {
		System.out.println("PG");
	}
	@Test
	private void hsc() {
		System.out.println("HSC");
	}
	@Test(priority = -1)
	private void sslc() {
		System.out.println("SSLC");
	}
	@Test(priority = 3)
	private void at() {
		System.out.println("AUTOMATIOON SOFTWARE TESTING");
	}
}
