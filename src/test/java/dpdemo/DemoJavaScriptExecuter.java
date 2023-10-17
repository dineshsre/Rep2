package dpdemo;

import java.time.Duration;

import javax.swing.text.Document;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoJavaScriptExecuter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		
		JavascriptExecutor jsExec = (JavascriptExecutor) driver;
		//Get Page Title
		String script = "return document.title ;";
		String title = (String)jsExec.executeScript(script);
		System.out.println(title);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		//Click Button
		
		driver.switchTo().frame("iframeResult");
		jsExec.executeScript("myFunction()");
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		//Highlight Button 
		
		WebElement element = driver.findElement(By.xpath("/html/body/button"));
		jsExec.executeScript("arguments[0].style.border='3px solid red'", element);
		
		//Scroll
		
		driver.navigate().to("https://www.w3schools.com/");
		//wait.until(ExpectedConditions.elementToBeSelected(By.xpath("/html/body/div[5]/div[15]/a")));
		WebElement lastLink = driver.findElement(By.xpath("//a[@class = 'w3-btn w3-margin-bottom']"));
		jsExec.executeScript("arguments[0].scrollIntoView[true]", lastLink);
		jsExec.executeScript("arguments[0].style.border='3px solid green'", lastLink);

	}

}
