package dpdemo;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoResizeable {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.ca/");
		driver.manage().window().maximize();
		//Implicit Wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebElement element = driver.findElement(By.xpath("/html/body/div[6]/div[1]/ul/li[6]"));

		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		
		//Fluent Wait
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .withMessage("This is message from Fluent wait")
				  .ignoring(NoSuchElementException.class);
		//Explicit Wait
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div[1]/ul/li[6]/div[2]/div[1]/nav[2]/ul/li[2]/a"))).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div[1]/ul/li[6]/div[2]/div[1]/nav[2]/ul/li[2]/a"))).click();
		//driver.findElement(By.xpath("/html/body/div[6]/div[1]/ul/li[6]/div[2]/div[1]/nav[2]/ul/li[2]/a")).click();
		//driver.close();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[4]/div[4]/div[1]/section[1]/div[2]/div/div/ul/li[1]/a/p"))).click();
		//driver.findElement(By.xpath("/html/body/div[5]/div[4]/div[4]/div[1]/section[1]/div[2]/div/div/ul/li[1]/a/p")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[4]/div[4]/div[1]/section[2]/div[2]/div/div/ul/li[4]/a/p"))).click();
		//driver.findElement(By.xpath("/html/body/div[5]/div[4]/div[4]/div[1]/section[2]/div[2]/div/div/ul/li[4]/a/p")).click();


	}

}
