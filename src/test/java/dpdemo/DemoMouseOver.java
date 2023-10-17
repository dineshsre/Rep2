package dpdemo;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoMouseOver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.ca/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//a[@_sp = 'p2481888.m1382.l3250']"));
		//WebElement element = driver.findElement(By.className("hl-cat-nav__container"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		driver.close();
	
		


	}

}
