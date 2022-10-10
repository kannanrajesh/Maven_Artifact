package org.Maven_Artifact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Task2SearchProductsbySelect_Pom {
		public Amazon_Task2SearchProductsbySelect_Pom(WebDriver driver3) {
			this.driver=driver3;
			PageFactory.initElements(driver,this);
		}
	public WebDriver driver;
	@FindBy(xpath = "//select[@id='searchDropdownBox']")
	private WebElement selectAll;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSelectAll() {
		return selectAll;
	}
	@FindBy(xpath = "//input[@id=\"nav-search-submit-button\"]")
	private WebElement searchbtn;
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	@FindBy(xpath = "//div[@id=\"contentGrid_944446\"]/div/div/div[6]/div/div")
	private WebElement clickimage;
	public WebElement getClickimage() {
		return clickimage;
	}
}
