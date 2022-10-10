package org.Maven_Artifact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MikiFashion_SearchProducts_Pom {
public WebDriver driver;
@FindBy(xpath = "//input[@type=\"search\"]")
private	WebElement searchproducts;
@FindBy(xpath = "//div[@id='root']/div/div/div[2]/div/div/div/a/div/div/div")
private WebElement selectdress;
@FindBy(xpath = "//label[@for='f7bdc9e0-fa2f-11ec-9634-fbae7dfe855f']")
private WebElement selectsize;
@FindBy(xpath = "//div[@class='add-to-list-action']")
private WebElement addcart;
@FindBy(xpath ="//div[@ class='field']")
private WebElement phonenumber;
@FindBy(xpath = "//button[@type='submit']")
private WebElement addlst;
@FindBy(xpath = "//div[@id='root']/div/div[1]/div/div[1]")
private WebElement back;

public WebElement getBack() {
	return back;
}
public WebElement getAddlst() {
	return addlst;
}
public WebElement getAddcart() {
	return addcart;
}

public WebElement getPhonenumber() {
	return phonenumber;
}
public void setAddcart(WebElement addcart) {
	this.addcart = addcart;
}
public WebElement getSelectsize() {
	return selectsize;
}
public WebElement getSelectdress() {
	return selectdress;
}
public MikiFashion_SearchProducts_Pom(WebDriver driver) { 
this.driver=driver;
PageFactory.initElements(driver,this);
	
}
public WebDriver getDriver() {
	return driver;
}
public WebElement getSearchproducts() {
	return searchproducts;
}

}
