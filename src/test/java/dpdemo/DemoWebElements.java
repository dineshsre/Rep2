package dpdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	
		//FirefoxDriver ffdriver = new FirefoxDriver();
		//EdgeDriver iedriver = new EdgeDriver();
		driver.get("https://www.sugarcrm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[3]/header/div/div/nav/nav/ul/li[8]/a/span[1]")).click();
		String demourl = driver.getCurrentUrl();
		System.out.println("Current URL is "+demourl);
		driver.findElement(By.name("firstname")).sendKeys("Shiv");
		driver.findElement(By.name("email")).sendKeys("SShankar@mail.com");
		driver.findElement(By.name("title")).sendKeys("new era");
		
		driver.quit();

	}

}
