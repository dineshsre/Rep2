package dpdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoFrames {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		//Method 1 using WebElement
		WebElement element = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(element);
		//Method 2 using frame -id
		//driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		Alert testAlert = driver.switchTo().alert();
		String alertText = testAlert.getText();
		
		System.out.println(alertText);
		Thread.sleep(5000);
		testAlert.accept();
		
		driver.close();
		


	}

}
