package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caller {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://dev140572.service-now.com");
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("filter")).sendKeys("callers");
		driver.findElement(By.xpath("//div[text()='Callers']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='New']")).click();

		driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys("praveen");
		driver.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys("M");
		driver.findElement(By.xpath("//input[@id='sys_user.title']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@id='sys_user.email']")).sendKeys("praveenmanjunathanp@gmail.com");
		driver.findElement(By.xpath("//input[@id='sys_user.phone']")).sendKeys("Poco");
		driver.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).sendKeys("6379311990");
		driver.findElement(By.xpath("//button[@id='sysverb_insert_bottom']")).click();

		WebElement name = driver.findElement(By.xpath("//input[@class='form-control'][1]"));
		name.sendKeys("praveen", Keys.ENTER);
		String Firstname = "praveen";

		WebElement name1 = driver.findElement(By.xpath("//td[text()='praveen'][1]"));
		String Result = name1.getText();
		if (Firstname.equals(Result)) {
			System.out.println("sucessfully created");

		}

	}

}

}
