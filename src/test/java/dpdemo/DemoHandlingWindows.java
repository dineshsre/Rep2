package dpdemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoHandlingWindows {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.salesforce.com/ca/?ir=1");//
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("a[@aria-label='Start free trial - Sales Cloud']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println(windowHandles);
		
		Iterator<String> itrString = windowHandles.iterator();
		
		String parentWindow = itrString.next();
		String childWindow = itrString.next();
		TargetLocator tgtLocator = driver.switchTo();
		tgtLocator.window(childWindow);
		driver.findElement(By.name("UserFirstName")).sendKeys("Laptop");
		Thread.sleep(4000);
		driver.findElement(By.name("UserLastName")).sendKeys("LAps");
		driver.findElement(By.name("UserTitle")).sendKeys("Worship");
		
		tgtLocator.window(parentWindow);
		
	
		
		
		
		
		//driver.close();

	}

}
