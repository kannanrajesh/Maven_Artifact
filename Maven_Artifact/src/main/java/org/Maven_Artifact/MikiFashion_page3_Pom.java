package org.Maven_Artifact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MikiFashion_page3_Pom {
public WebDriver driver;

@FindBy(xpath = "//label[@for='77a4cea0-3587-11ed-aa95-fd9991b3d7dc']")
public WebElement selectsize;
@FindBy(xpath = "//div[@class='add-to-list-action']")
public WebElement Addtocart;
public WebDriver getDriver() {
	return driver;
}
public WebElement getSelectsize() {
	return selectsize;
}
public WebElement getAddtocart() {
	return Addtocart;
}
public MikiFashion_page3_Pom(WebDriver driver4 ) {
	this.driver=driver4;
	PageFactory.initElements(driver, this);
}
}
