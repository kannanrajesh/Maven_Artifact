package com.Object.Manger;

import org.Maven_Artifact.Adactin_page1_DemoPOM;
import org.openqa.selenium.WebDriver;

public class Page_Object_ManagerAdactin {
	public WebDriver driver;
	private Adactin_page1_DemoPOM logpage;

	public Page_Object_ManagerAdactin(WebDriver driver) {
		this.driver=driver;
	}
	public Adactin_page1_DemoPOM get_Logpage() {
		if (logpage==null) {
			logpage = new Adactin_page1_DemoPOM(driver);
			
		}
		return logpage;
	}
	
	
}
