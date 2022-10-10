package com.testng.features;

import org.testng.annotations.Test;

public class Expected_Exception {
	String s = "rajesh";
	@Test(expectedExceptions = NullPointerException.class)
	private void calc() {
		System.out.println(s.toUpperCase());
	}
	
}
