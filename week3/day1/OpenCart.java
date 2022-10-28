package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.findElement(By.name("username")).sendKeys("praveen1229");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Praveen");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("M");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("praveenmanjunathanp@gmail.com");

		WebElement country_id=driver.findElement(By.name("country_id"));
		Select dd1= new Select(country_id);
		dd1.deselectByVisibleText("India");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("deva1411");

	}

}
