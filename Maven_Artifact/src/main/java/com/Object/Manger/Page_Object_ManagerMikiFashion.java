package com.Object.Manger;

import org.Maven_Artifact.MikiFashion_AccountCreate;
import org.Maven_Artifact.MikiFashion_SearchProducts_Pom;
import org.Maven_Artifact.MikiFashion_page1_Pom;
import org.Maven_Artifact.MikiFashion_page2_Pom;
import org.Maven_Artifact.MikiFashion_page3_Frame_Pom;
import org.Maven_Artifact.MikiFashion_page3_Pom;
import org.openqa.selenium.WebDriver;

public class Page_Object_ManagerMikiFashion {

	public WebDriver driver;
	private MikiFashion_SearchProducts_Pom search;
	private MikiFashion_AccountCreate accountpg;
	private MikiFashion_page1_Pom page1;
	private MikiFashion_page2_Pom page2;
	private MikiFashion_page3_Frame_Pom framepg;
	private MikiFashion_page3_Pom page3;
	public WebDriver getDriver() {
		return driver;
	}
	
	public Page_Object_ManagerMikiFashion(WebDriver driver) {
		this.driver=driver;
	}
	public MikiFashion_SearchProducts_Pom getSearch() {
		if (search==null) {
			search = new MikiFashion_SearchProducts_Pom(driver);
			
		}
		return search;
	}
	public MikiFashion_AccountCreate getAccountpg() {
		if (accountpg==null) {
			accountpg = new MikiFashion_AccountCreate(driver);
		}
		return accountpg;
	}
	public MikiFashion_page1_Pom getPage1() {
		if (page1==null) {
			page1 = new MikiFashion_page1_Pom(driver);
		}
		return page1;
	}
	public MikiFashion_page2_Pom getPage2() {
		if (page2==null) {
			page2 = new MikiFashion_page2_Pom(driver);
		}
		return page2;
	}
	public MikiFashion_page3_Frame_Pom getFramepg() {
		if (framepg==null) {
			framepg =new MikiFashion_page3_Frame_Pom(driver);
		}
		return framepg;
	}
	public MikiFashion_page3_Pom getPage3() {
		if (page3==null) {
			page3 = new MikiFashion_page3_Pom(driver);
		}
		return page3;
	}
	
	
}
