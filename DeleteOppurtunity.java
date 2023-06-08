package Salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DeleteOppurtunity {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		driver.findElement(By.xpath("(//p[@class='al-app-tile-description'])[2]")).click();
		
		Thread.sleep(4000);
		WebElement javaScript = driver.findElement(By.xpath("//a[@title='Opportunities']"));
		driver.executeScript("arguments[0].click();",javaScript);
		
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("Salesforce Automation by Praveen",Keys.ENTER);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@role='button'])[26]")).click();
		
		Thread.sleep(9000);
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		
		
		
	}

}
