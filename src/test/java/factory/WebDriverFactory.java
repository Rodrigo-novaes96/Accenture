package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobject.PageGenerator;

public class WebDriverFactory {

	public static WebDriver driver;
	public static  PageGenerator page;
	public static WebDriverWait wait;
	
	public  static void startChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/lib/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--applicationCacheEnabled");
	//	chromeOptions.addArguments("--incognito");
		chromeOptions.addArguments("--test-type");
		chromeOptions.addArguments("--disable-infobars");
		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("--ignore-certificate-errors");
		chromeOptions.addArguments("--enable-popup-blocking");
		chromeOptions.addArguments("--disable-default-apps");
		chromeOptions.addArguments("--disable-extensions");
	  /*  chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--window-size=1366,768");*/
		chromeOptions.addArguments("--javascriptEnabled");
		chromeOptions.addArguments("--lang=pt-BR");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		wait = new WebDriverWait(driver,15);
		page = new PageGenerator(driver);
	}

	public static WebDriver getCurrentRunningDriver() {
		return driver;
	}

	public static void killCurrentRunningDriver() {
		driver.quit();
			}
}
