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

public class AmazonAnnotations {
	@BeforeSuite
	private void launch_browser() {
System.out.println("Launch_browser");
	}
	@BeforeTest
	private void Looger() {
		System.out.println("Logger");
	}
	@BeforeClass
	private void Launch_Url() {
		System.out.println("Launch_Url");
	}
	@BeforeMethod
	private void click_signin() {
		System.out.println("click_siginbtn");
	}
	@Test
	private void email() {
		System.out.println("EnterEmail");
	}
	@Test
	private void cont() {
		System.out.println("clickContinuebtn");
	}
	@Test
	private void password() {
		System.out.println("EnterPassword");
	}
	@Test
	private void ClickSubmitbtn() {
		System.out.println("Click SUbmitButton");
	}
	@AfterMethod
	private void logout() {
		System.out.println("ClickLogoutBtn");
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
