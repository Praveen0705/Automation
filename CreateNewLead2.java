package Salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateNewLead2 {
	
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
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='input-125']")).sendKeys("opportunities");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
		
		Thread.sleep(4000);
		WebElement name = driver.findElement(By.xpath("//input[@name='Name']"));
		name.sendKeys("Salesforce Automation by Praveen");
		name.getText();
		System.out.println(name);
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='input-196']")).sendKeys("6/6/2023");
		
		driver.findElement(By.xpath("//button[@id='combobox-button-215']")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		
		
	}

}
