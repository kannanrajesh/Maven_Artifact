package org.Maven_Artifact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Task1sign_Pom {
	public Amazon_Task1sign_Pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}
	public WebDriver driver;
	@FindBy(xpath = "//div[@id='nav-tools']/a[2]")
	private WebElement signin;
	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement contemailbtn;
	@FindBy(xpath = "//input[@id=\"ap_password\"]")
	private WebElement password;
	@FindBy(xpath = "//input[@id=\"signInSubmit\"]")
	private WebElement signinsubmit;
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSigninsubmit() {
		return signinsubmit;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getContemailbtn() {
		return contemailbtn;
	}
}
