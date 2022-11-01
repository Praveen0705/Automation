package week1.day100;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UibankUipath {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://uibank.uipath.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//small[@id='emailHelp'])[2]")).click();
		driver.findElement(By.xpath("(//input[@id='firstName'])")).sendKeys("Praveen");
		
		WebElement title = driver.findElement(By.xpath("//select[@id='title']"));
		Select dd1 = new Select(title);
		dd1.selectByIndex(2);
		
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("M");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("roocky");
		
		WebElement gender = driver.findElement(By.name("gender"));
		Select dd2 = new Select(gender);
		dd2.selectByValue("male");
		
		WebElement employmentStatus = driver.findElement(By.id("employmentStatus"));
		Select dd3 = new Select(employmentStatus);
		dd3.selectByIndex(0);
		
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("06/29/2001");
		
		WebElement MaritalStatus = driver.findElement(By.xpath("//select[@id='maritalStatus']"));
		Select dd4 = new Select(MaritalStatus);
		dd4.selectByIndex(0);
		
		driver.findElement(By.id("numberOfDependents")).sendKeys("1");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Praveen.M");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("praveenmanjunathanp@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("praveen14865");

	}

}
