package org.Maven_Artifact;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MikiFashion_AccountCreate {
public WebDriver driver;

@FindBy(xpath = "//div[@class='customer-profile-button']")
private WebElement account;

@FindBy(xpath = "//div[@class='mandatory-login-phone-input ']")
private WebElement phnnum;

@FindBy(xpath = "//button[@class='submit-button']")
private WebElement start;

@FindBy(xpath = "//div[@class='submit-container']")
private WebElement verify;

@FindBy(xpath = "//form[@name=\"mandatoryLoginForm\"]")
private WebElement alert1;
public WebElement getAlert1() {
	return alert1;
}
public MikiFashion_AccountCreate(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver,this);
}
public WebElement getVerify() {
	return verify;
}
public WebElement getStart() {
	return start;
}
public WebElement getPhnnum( ) {
	return phnnum;
}
public WebDriver getDriver() {
	return driver;
}
public WebElement getAccount() {
	return account;
}
}
