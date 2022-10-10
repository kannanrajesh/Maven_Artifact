package org.Maven_Artifact;

import java.io.File;
import java.io.IOException;
import java.util.Set;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility_File {
	public static WebDriver driver;
	public static WebElement element;

	public static WebDriver get_Browser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("edge")) {
			System.setProperty("webDriver.edge.driver", "");
		}

		driver.manage().window().maximize();
		return driver;

	}

	public static String geturl(String url) {
		driver.get(url);
		return url;
	}
	private void getScroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	}
	public static  void Contextclick(WebElement element) {
		element.click();
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void doubleclick(WebElement element) {
        element.click();
	}
	public static void draganddrop(WebElement source,WebElement target, WebElement element) {
		element.click();
	}
	public static void clickandhold(WebElement element) {
		element.click();
	}
	public static void movetoelement(WebElement element) {
		element.click();
	}
	

	public static void  send_keys(WebElement element, String string) {
		element.sendKeys(string);
	}

	public static void selectIndex(WebElement element, int index) {
		Select refName = new Select(element);
		refName.selectByIndex(index);
	}

	public static void selectValue(WebElement element, String value) {
		Select refName1 = new Select(element);
		refName1.selectByValue(value);
	}

	public static void selectText(WebElement element, String text) {
		Select refName2 = new Select(element);
		refName2.selectByVisibleText(text);
	}

	protected static String get_Number( WebElement element,int string) {
		return null;
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public static boolean isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

	public static boolean isSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}

	public static String getTagName(WebElement element) {
		String tagName = element.getTagName();
		return tagName;
	}

	public static void getSize(WebElement element) {
		element.getSize();
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String getCurrentUrl(String url) {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static String getPageSource() {
		String pageSource = driver.getPageSource();
		return pageSource;
	}

	public static void navigate(String Url) {
		Navigation navigate = driver.navigate();
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	public static void switchTo() {
		driver.switchTo();
	}

	public static String switchToAlert() {
		Alert alert = driver.switchTo().alert();
		return null;
	}

	public static String switchToFrame(String index) {
		WebDriver frame = driver.switchTo().frame(index);
		return index;
	}

	public static String switchToFrame1(String nameOrId) {
		WebDriver frame2 = driver.switchTo().frame(nameOrId);
		return nameOrId;
	}

	public static String switchToFrame2(String frameElement) {
		WebDriver frame3 = driver.switchTo().frame(frameElement);
		return frameElement;
	}

	public static void windowHandle() {
		String windowHandle = driver.getWindowHandle();
	}

	public static void windowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
	}
		public static String screenshot(String path) throws IOException{
			TakesScreenshot ts = (TakesScreenshot) driver;
			 File source = ts.getScreenshotAs(OutputType.FILE);
			 File destinaton = new File(path);
			 FileUtils.copyFile(source, destinaton);
			return path;
		}
		
		
}
