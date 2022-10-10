package org.Maven_Artifact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MikiFashion_page2_Pom {
	public  WebDriver driver;
	@FindBy(xpath = "(//span[@class=\"checkmark\"])[2]")
	public WebElement catchkbx ;
	@FindBy(xpath = "(//span[@class=\"checkmark\"])[4]")
	public WebElement sizeschkbx; 
	@FindBy(xpath ="(//div[@id='root']/div/div[2]/div/div[5]/a[3]/div/div/div")
	public WebElement selectdress;
	
	public MikiFashion_page2_Pom(WebDriver driver3) {
		this.driver=driver3;
		PageFactory.initElements(driver, this);
		
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCatchkbx() {
		return catchkbx;
	}
	public WebElement getSizeschkbx() {
		return sizeschkbx;
	}
	public WebElement getSelectdress() {
		return selectdress;
	}
}
