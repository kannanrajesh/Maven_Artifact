package org.Maven_Artifact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_page1_DemoPOM {
		public WebDriver driver;
		
	
		@FindBy(xpath = "//input[@id='username']")
		private WebElement username;
		@FindBy(id = "password")
		private WebElement password;
		@FindBy(xpath = "//input[@class='login_button']")
		private WebElement loginbutton;
		
		public Adactin_page1_DemoPOM(WebDriver driver2)
		{
			this.driver = driver2;
			PageFactory.initElements(driver,this);
			
		}
		public WebDriver getDriver() {
			return driver;
		}
		public WebElement getUsername() {
			return username;
		}
		public WebElement getPassword() {
			return password;
		}
		public WebElement getLoginbutton() {
			return loginbutton;
		}
	
}
