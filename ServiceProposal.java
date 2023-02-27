package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceProposal {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dev140572.service-now.com");
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("filter")).sendKeys("proposal");
		driver.findElement(By.xpath("//div[text()='My Proposals']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		
		driver.findElement(By.xpath("//input[@id='std_change_proposal.short_description']")).sendKeys("test");
		driver.findElement(By.xpath("//button[text()='Submit'][1]")).click();
		WebElement number=driver.findElement(By.xpath("//input[@class='form-control'][1]"));
		number.sendKeys("STDCHG0001024",Keys.ENTER);
		String num="STDCHG0001024";
		WebElement result=driver.findElement(By.xpath("//td[@class='vt'][1]"));
	    String num1=result.getText();
	    
		 
		if(num.contains(num1)) {
			System.out.println("sucessfully created");
		}
		
		
		
	}


}
