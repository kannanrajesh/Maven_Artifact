package org.Maven_Artifact;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Object.Manger.Page_Object_ManagerMikiFashion;

public class Miki_Fashion_Runner extends Utility_File{

	public static	WebDriver driver = Utility_File.get_Browser("chrome");
	public static Logger log = Logger.getLogger(Miki_Fashion_Runner.class);
	public static Page_Object_ManagerMikiFashion Manager = 	new Page_Object_ManagerMikiFashion(driver);
	public static	Actions a = new Actions( driver);
	
	public static void main(String[] args) throws Throwable {
		BasicConfigurator.configure();
		PropertyConfigurator.configure("log4j.properties");
		geturl("https://www.mickifashion.in/");
		log.info("BROWSER LAUNCHED");
		Thread.sleep(5000);
		click(Manager.getSearch().getSearchproducts());
		send_keys(Manager.getSearch().getSearchproducts(), "11 girl baby frock");
		Thread.sleep(5000);
		//screenshot(Miki_Fashion_Runner.screenshot("C:\\Users\\HP\\eclipse-workspace\\Maven_Artifact\\Screnshot\\mikiwbst.png"));
		click(Manager.getSearch().getSelectdress());
		Thread.sleep(2000);
		//click(Manager.getSearch().getAddcart());
		click(Manager.getSearch().getBack());
		
		
		//		driver.switchTo().frame(0);
//		driver.switchTo().alert();
//		click(Manager.getSearch().getPhonenumber());
//		send_keys(Manager.getSearch().getPhonenumber(),"6382868248" );
//		click(Manager.getSearch().getAddlst());
		
		
		click(Manager.getPage1().getChooseDress());
		Thread.sleep(5000);
		
		/*a.moveToElement( Manager.getAccountpg().getAccount());
		click(Manager.getAccountpg().getAccount());
		driver.switchTo().alert();
		Thread.sleep(5000);
		click(Manager.getAccountpg().getPhnnum());
		send_keys(Manager.getAccountpg().getPhnnum(), "6382868248");
		
		click(Manager.getAccountpg().getStart());
		Thread.sleep(10000);
		click(Manager.getAccountpg().getVerify());
		
		screenshot(Miki_Fashion_Runner.screenshot("C:\\Users\\HP\\eclipse-workspace\\Maven_Artifact\\Screnshot\\mikiacc.png"));*/
		
		Thread.sleep(5000);
		click(Manager.getPage2().getCatchkbx());
		//screenshot(Miki_Fashion_Runner.screenshot("C:\\Users\\HP\\eclipse-workspace\\Maven_Artifact\\Screnshot\\mikichkbx.png"));

		Thread.sleep(3000);
		click(Manager.getPage2().getSizeschkbx());
		//screenshot(Miki_Fashion_Runner.screenshot("C:\\Users\\HP\\eclipse-workspace\\Maven_Artifact\\Screnshot\\mikisizbx.png"));

		Thread.sleep(9000);
		click(Manager.getPage2().getSelectdress());
		//screenshot(Miki_Fashion_Runner.screenshot("C:\\Users\\HP\\eclipse-workspace\\Maven_Artifact\\Screnshot\\mikislctdrs.png"));

		
		Thread.sleep(5000);
		click(Manager.getPage3().getSelectsize());
		//screenshot(Miki_Fashion_Runner.screenshot("C:\\Users\\HP\\eclipse-workspace\\Maven_Artifact\\Screnshot\\mikisltsz.png"));

		Thread.sleep(5000);
		click(Manager.getPage3().getAddtocart());
		//screenshot(Miki_Fashion_Runner.screenshot("C:\\Users\\HP\\eclipse-workspace\\Maven_Artifact\\Screnshot\\mikiadcrt.png"));

		
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		send_keys(Manager.getFramepg().getWhatsappAlert(),"9865917735");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		click(Manager.getFramepg().getAddcrt());
		
		
	}
	
}
