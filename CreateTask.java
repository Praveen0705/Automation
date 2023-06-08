package Salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateTask {
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
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='input-125']")).sendKeys("Task");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		
		driver.findElement(By.xpath("(//span[@part='boundary'])[10]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='slds-context-bar__label-action slds-p-left--none'])[4]")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@role='combobox'])[2]")).sendKeys("Bootcamp");
	
		
		 driver.findElement(By.xpath("(//a[@class='select'])[1]")).click();
		   // (//div[@class='uiPopupTrigger'])[5]
		    //driver.findElement(By.xpath("(//div[@class='uiPopupTrigger'])[5]")).click();
		    driver.findElement(By.xpath("//li[@class='uiMenuItem uiRadioMenuItem']")).click();
		    driver.findElement(By.xpath("//a[@title='Waiting on someone else']")).click();
		
	}

}
