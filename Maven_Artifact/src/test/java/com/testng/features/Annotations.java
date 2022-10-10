package com.testng.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	private void launch_browser() {
System.out.println("Launch_browser");
	}
	@BeforeTest
	private void launch_Url() {
		System.out.println("Launch_Url");
	}
	@BeforeClass
	private void clickAcc() {
		System.out.println("clickAccount");
	}
	
	@BeforeMethod
	private void login() {
		System.out.println("login");
	}
	@Test
	private void morningdress() {
		System.out.println("morning dress");
	}
	@Test
	private void eveningdress() {
		System.out.println("evening dress");
	}
	@Test
	private void t_shirts() {
		System.out.println("t_shirts");
	}
	@AfterMethod
	private void logout() {
		System.out.println("logout");
	}
	@AfterClass
	private void getUrl() {
		System.out.println("getting Url");
	}
	@AfterTest
	private void printUrl() {
		System.out.println("print url");
	}
	@AfterSuite
	private void close() {
		System.out.println("close browser");
	}
}
