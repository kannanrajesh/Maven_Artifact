package org.Maven_Artifact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MikiFashion_page3_Frame_Pom {
public WebDriver driver;
@FindBy(xpath = "//div[@class='request-identity-modal']")
public WebDriver frame;

@FindBy(xpath = "(//input[@placeholder='Phone'])[2]")
public WebElement whatsappAlert;
@FindBy(xpath = "//button[@type='submit']")
public WebElement Addcrt;

public WebDriver getDriver() {
	return driver;
}
public WebDriver getFrame() {
	return frame;
}
public WebElement getWhatsappAlert() {
	return whatsappAlert;
}
public WebElement getAddcrt() {
	return Addcrt;
}
public MikiFashion_page3_Frame_Pom(WebDriver driver5) {
	this.driver=driver5;
	PageFactory.initElements(driver,this);
}
}
