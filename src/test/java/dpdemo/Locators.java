package dpdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {

		if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();

		String url = driver.getCurrentUrl();
		System.out.println("Current URL IS "+url);

		String title = driver.getTitle();
		System.out.println("Titel is "+title);

		String pagesrc = driver.getPageSource();
		System.out.println("Page source "+ pagesrc);

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.findElement(By.id("login-button")).click();

		List<WebElement> webelements =   driver.findElements(By.xpath("//div[@class = 'inventory_list']/div"));
		
		System.out.println("WebElemets Fetched are " +webelements);

		//driver.close();

		driver.quit();

	}

}
