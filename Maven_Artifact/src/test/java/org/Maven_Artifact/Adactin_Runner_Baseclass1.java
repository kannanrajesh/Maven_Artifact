package org.Maven_Artifact;

import java.io.File;
import java.io.IOException;

import org.Maven_Artifact.Adactin_page1_DemoPOM;
import org.Maven_Artifact.Utility_File;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Object.Manger.Page_Object_ManagerAdactin;
import com.logger.Log_BasicConfigurator;

public class Adactin_Runner_Baseclass1 extends Utility_File {
		public static WebDriver driver=Utility_File.get_Browser("chrome");
		public static Page_Object_ManagerAdactin managerAdactin = new Page_Object_ManagerAdactin(driver);
		public static Logger log = Logger.getLogger(Adactin_Runner_Baseclass1.class);
		public static void main(String[] args) throws Throwable {
			BasicConfigurator.configure();
			PropertyConfigurator.configure("log4j.properties");
			geturl("https://adactinhotelapp.com/");
			log.info("predefined browser");
			log.info("BROWSER LAUNCHED");
			click(managerAdactin.get_Logpage().getUsername());
			send_keys(managerAdactin.get_Logpage().getUsername(), "rajeshkannan");
//			Adactin_Runner_Baseclass1 logpg = new Adactin_Runner_Baseclass1();
//		send_keys(logpage.getUsername(),"rajeshkannan");
//		Thread.sleep(1000);
//		send_keys(logpage.getPassword(),"rajesh1992");
//		screenshot(Adactin_Runner_Baseclass1.screenshot("C:\\Users\\HP\\eclipse-workspace\\Maven_Artifact\\Screnshot\\runner3.png"));	
//		click(logpage.getLoginbutton());
		
		
		/*WebElement selctloct = driver.findElement(By.id("location"));
		Select s1 = new Select(selctloct);
		s1.selectByValue("Paris");
		
		WebElement hotl = driver.findElement(By.id("hotels"));
		Select s2 = new Select(hotl);
		s2.selectByValue("Hotel Sunshine");
	
		WebElement roomtyp = driver.findElement(By.id("room_type"));
		Select s3 = new Select(roomtyp);
		s3.selectByVisibleText("Super Deluxe");*/
//		
//		WebElement numbrrm = driver.findElement(By.name("room_nos"));
//		//@SuppressWarnings("unused")
//		Select s4 = new Select(numbrrm);
//		s4.selectByValue("3");
//		
//		
//		
//		WebElement chkndt = driver.findElement(By.id("datepick_in"));
//		chkndt.clear();
//		chkndt.sendKeys("27/08/2022");
//		
//		WebElement chkout = driver.findElement(By.id("datepick_out"));
//		chkout.clear();
//		chkout.sendKeys("03/09/2022");
//		
//		WebElement adltrm = driver.findElement(By.name("adult_room"));
//		Select s5 = new Select(adltrm);
//		s5.selectByVisibleText("3 - Three");
//		
//		WebElement chldrm = driver.findElement(By.name("child_room"));
//		Select s6 = new Select(chldrm);
//		s6.selectByVisibleText("2 - Two");
//		
//		driver.findElement(By.id("Submit")).click();
//		
//		driver.findElement(By.id("radiobutton_0")).click();
//		
//		driver.findElement(By.name("continue")).click();
//		
//		driver.findElement(By.name("first_name")).sendKeys("rajesh");
//		
//		driver.findElement(By.name("last_name")).sendKeys("kannan");
//		
//		driver.findElement(By.name("address")).sendKeys("adayar,chennai,Tamilnadu,India");
//		
//		driver.findElement(By.name("cc_num")).sendKeys("0123456789146895");
//		
//		WebElement cctype = driver.findElement(By.id("cc_type"));
//		Select s7 = new Select(cctype);
//		s7.selectByVisibleText("Master Card");
//		
//		WebElement ccmonth = driver.findElement(By.name("cc_exp_month"));
//		Select s8 = new Select(ccmonth);
//		s8.selectByValue("4");
//		
//		WebElement ccyear = driver.findElement(By.name("cc_exp_year"));
//		Select s9 =new Select(ccyear);
//		s9.selectByVisibleText("2022");
//		
//		driver.findElement(By.name("cc_cvv")).sendKeys("579");
//		
//		
//		driver.findElement(By.id("book_now")).click();
//		
//		TakesScreenshot adactin = (TakesScreenshot) driver;
//		File screenshotAs = adactin.getScreenshotAs(OutputType.FILE);
//		File data =new File("C:\\Users\\HP\\eclipse-workspace\\Testing_Sample\\Screnshot\\runner.png");
//		FileUtils.copyFile(screenshotAs, data);
//		
//		driver.findElement(By.linkText("Logout")).click();
//		
//		driver.findElement(By.linkText("Click here to login again")).click();
//		
//		//next location hotel
//		driver.findElement(By.id("username")).sendKeys("rajeshkannan");
//		driver.findElement(By.id("password")).sendKeys("rajesh1992");
//		driver.findElement(By.id("login")).click();
//		
//		WebElement selctloct1 = driver.findElement(By.id("location"));
//		Select j1 = new Select(selctloct1);
//		j1.selectByValue("Sydney");
//		
//		WebElement hotl1 = driver.findElement(By.id("hotels"));
//		Select j2 = new Select(hotl1);
//		j2.selectByValue("Hotel Creek");
//		
//		WebElement roomtyp1 = driver.findElement(By.id("room_type"));
//		Select j3 = new Select(roomtyp1);
//		j3.selectByVisibleText("Standard");
//		
//		WebElement numbrrm1 = driver.findElement(By.name("room_nos"));
//		//@SuppressWarnings("unused")
//		Select j4 = new Select(numbrrm1);
//		j4.selectByValue("5");
//		
//		
//		
//		WebElement chkndt1 = driver.findElement(By.id("datepick_in"));
//		chkndt1.clear();
//		chkndt1.sendKeys("27/08/2022");
//		
//		WebElement chkout1 = driver.findElement(By.id("datepick_out"));
//		chkout1.clear();
//		chkout1.sendKeys("07/09/2022");
//		
//		WebElement adltrm1 = driver.findElement(By.name("adult_room"));
//		Select j5 = new Select(adltrm1);
//		j5.selectByVisibleText("4 - Four");
//		
//		WebElement chldrm1 = driver.findElement(By.name("child_room"));
//		Select j6 = new Select(chldrm1);
//		j6.selectByVisibleText("4 - Four");
//		
//		driver.findElement(By.id("Submit")).click();
//		
//		driver.findElement(By.id("radiobutton_0")).click();
//		
//		driver.findElement(By.name("continue")).click();
//		
//		driver.findElement(By.name("first_name")).sendKeys("kannan");
//		
//		driver.findElement(By.name("last_name")).sendKeys("rajesh");
//		
//		driver.findElement(By.name("address")).sendKeys("Besannagar,chennai,Tamilnadu,India");
//		
//		driver.findElement(By.name("cc_num")).sendKeys("0123456789146895");
//		
//		WebElement cctype1 = driver.findElement(By.id("cc_type"));
//		Select j7 = new Select(cctype1);
//		j7.selectByVisibleText("American Express");
//		
//		WebElement ccmonth1 = driver.findElement(By.name("cc_exp_month"));
//		Select j8 = new Select(ccmonth1);
//		j8.selectByValue("2");
//		
//		WebElement ccyear1 = driver.findElement(By.name("cc_exp_year"));
//		Select j9 =new Select(ccyear1);
//		j9.selectByVisibleText("2021");
//		
//		driver.findElement(By.name("cc_cvv")).sendKeys("564");
//		
//		
//		driver.findElement(By.id("book_now")).click();
//		
//	    TakesScreenshot adactin1 = (TakesScreenshot) driver;
//		File screenshotAs1 = adactin1.getScreenshotAs(OutputType.FILE);
//		File data1 =new File("C:\\Users\\HP\\eclipse-workspace\\Testing_Sample\\Screnshot\\runner1.png");
//		FileUtils.copyFile(screenshotAs1, data1);
//		
//		driver.findElement(By.name("radiobutton_0")).click();
//		driver.findElement(By.id("continue")).click();
//		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("kumar");
//		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("kash");
//		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("beasnt nage beach,chennai,india");
//		driver.findElement(By.name("cc_num")).sendKeys("0123456789012");
//		
//		WebElement cctype3 = driver.findElement(By.name("cc_type"));
//		Select a1 = new Select(cctype3);
//		a1.selectByValue("VISA");
//		
//		WebElement exp3 = driver.findElement(By.name("cc_exp_month"));
//		Select a2 = new Select(exp3);
//		a2.selectByValue("3");
//		
//		WebElement expyer3 = driver.findElement(By.name("cc_exp_year"));
//		Select a3 = new Select(expyer3);
//		a3.selectByValue("2022");
//		 
//		 driver.findElement(By.name("cc_cvv")).sendKeys("1234");
//		 
//		 driver.findElement(By.xpath("//input[@id='book_now']")).click();
//		 Thread.sleep(4000);
//		 JavascriptExecutor js =  (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0],ScrollIntoview()","my_itinerary");
//		 
//		 driver.findElement(By.xpath("//input[@id='my_itinerary']")).click();		 
//
//	}
}
		
}