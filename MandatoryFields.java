package Salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MandatoryFields {
	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://login.salesforce.com/");
	    driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	    driver.findElement(By.id("password")).sendKeys("Leaf@1234");	
	    driver.findElement(By.id("Login")).click();
	    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	    driver.findElement(By.xpath("//button[text()='View All']")).click();
	    driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("App launcher");
		driver.findElement(By.xpath("//mark[text()='App Launcher']")).click();
		driver.findElement(By.xpath("(//span[text()='Tasks'])[1]")).click();
		driver.findElement(By.xpath("//a[@class='slds-button slds-button--icon-x-small slds-button--icon-border-filled']")).click();
		
		WebElement javascript = driver.findElement(By.xpath("//div[text()='New Task']"));
		driver.executeScript("arguments[0].click();",javascript);
		
		driver.findElement(By.xpath("//textarea[@class='textarea textarea uiInput uiInputTextArea uiInput--default uiInput--textarea']")).sendKeys("SALES FORCE");
	    driver.findElement(By.xpath("//span[text()='Save']")).click();
	    WebElement text = driver.findElement(By.xpath("//span[@class='genericError uiOutputText']"));
	    System.out.println(text.getText());
	}

}
