package week1.day100;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Praveen");
	    driver.findElement(By.name("lastname")).sendKeys("M");
		driver.findElement(By.name("reg_email__")).sendKeys("6379311990");
		driver.findElement(By.name("reg_passwd__")).sendKeys("praveen1229");
		
		WebElement birthday_day= driver.findElement(By.name("birthday_day"));
		Select dd1=new Select(birthday_day);
		dd1.selectByValue("29");
		Thread.sleep(4000);
		WebElement birthday_month=driver.findElement(By.id("month"));
		Select dd2=new Select(birthday_month);
		dd2.selectByIndex(4);
		
		WebElement birthday_year=driver.findElement(By.name("birthday_year"));
		Select dd3=new Select(birthday_year);
		dd3.selectByValue("2001");
        Thread.sleep(4000);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
	}
	

}
