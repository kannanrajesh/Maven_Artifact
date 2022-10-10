package org.Maven_Artifact;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.Object.Manger.Page_Object_ManagerAmazon;

public class Amazon_Runner extends Utility_File{
	public static	WebDriver driver = Utility_File.get_Browser("chrome");
	public static Logger log = Logger.getLogger(Amazon_Runner.class);
	public static Page_Object_ManagerAmazon Manager = new Page_Object_ManagerAmazon(driver);
	public static void main(String[] args) throws Throwable {
		BasicConfigurator.configure();
		PropertyConfigurator.configure("log4j.properties");
		geturl("https://www.amazon.in/");
		log.info("BROWSER LAUNCHED");
		Thread.sleep(5000);
		click(Manager.getTask1().getSignin());
		click(Manager.getTask1().getEmail());
		send_keys(Manager.getTask1().getEmail(),"manorajesh008@gmail.com");
		click(Manager.getTask1().getContemailbtn());
		send_keys(Manager.getTask1().getPassword(),"rajesh1992" );
		click(Manager.getTask1().getSigninsubmit());
		
		selectIndex(Manager.getSelectproducts().getSelectAll(),8);
		click(Manager.getSelectproducts().getSearchbtn());
		click(Manager.getSelectproducts().getClickimage());
	}
	

}
