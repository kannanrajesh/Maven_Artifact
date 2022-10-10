package com.Object.Manger;

import org.Maven_Artifact.Amazon_Task1sign_Pom;
//import org.Maven_Artifact.Amazon_Task1sign_Pom;
import org.Maven_Artifact.Amazon_Task2SearchProductsbySelect_Pom;
import org.openqa.selenium.WebDriver;

public class Page_Object_ManagerAmazon {
	public Page_Object_ManagerAmazon(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebDriver driver;
	private Amazon_Task1sign_Pom Task1;
	public WebDriver getDriver() {
		return driver;
	}
	public Amazon_Task1sign_Pom getTask1() {
		if (Task1==null) {
			Task1= new Amazon_Task1sign_Pom(driver);
		}
		return Task1;
	}
	private Amazon_Task2SearchProductsbySelect_Pom selectproducts;
	public Amazon_Task2SearchProductsbySelect_Pom getSelectproducts() {
		if (selectproducts==null) {
			selectproducts = new Amazon_Task2SearchProductsbySelect_Pom(driver);
		}
		return selectproducts;
	}
	private Amazon_Task2SearchProductsbySelect_Pom selectimg;
	public Amazon_Task2SearchProductsbySelect_Pom getSelectimg() {
		if (selectimg==null) {
			selectimg = new Amazon_Task2SearchProductsbySelect_Pom(driver);
		}
		return selectimg;
	}

	
}
