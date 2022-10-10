package org.Maven_Artifact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MikiFashion_page1_Pom {

	public WebDriver driver;
	
	@FindBy(xpath = "//div[.='Baby Frock']")
	private WebElement chooseDress;
	public WebDriver getDriver1() {
		return driver;
	}
	
	public WebElement getChooseDress() {
		return chooseDress;
	}
	public MikiFashion_page1_Pom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
