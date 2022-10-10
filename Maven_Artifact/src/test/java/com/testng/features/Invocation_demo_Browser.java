package com.testng.features;

import org.Maven_Artifact.Utility_File;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class Invocation_demo_Browser extends Utility_File{
	public static WebDriver driver;

	@Test
	private void browserlaunch() {
		driver = get_Browser("chrome");
		System.out.println("Launch_Browser");
	}
	@Test
	private void urlLaunch() {
		geturl("https://www.youtube.com/");
		System.out.println("Launch_URL");
	}
	@Test(priority = 1,invocationCount = 2,
			invocationTimeOut = 100000)
	private void refersh() {
		driver.navigate().refresh();
		System.out.println("referesh");
	} 
}
