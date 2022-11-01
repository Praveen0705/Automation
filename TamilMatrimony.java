package week1.day100;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TamilMatrimony {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement name1 = driver.findElement(By.name("REGISTERED_BY"));
		Select name2 = new Select(name1);
		name2.selectByIndex(1);
		
		driver.findElement(By.id("NAME")).sendKeys("Praveen");
		driver.findElement(By.className("hp-gender")).click();
		
		WebElement Date1 = driver.findElement(By.name("DOBDAY"));
		Select Date2 = new Select(Date1);
		Date2.selectByIndex(29);
		
		WebElement month = driver.findElement(By.id("DOBMONTH"));
		Select month1 = new Select(month);
		month1.selectByValue("6");
		
		WebElement year = driver.findElement(By.id("DOBYEAR"));
		Select year1 = new Select(year);
		year1.selectByValue("2001");
		
		WebElement Relegion = driver.findElement(By.id("RELIGION"));
		Select Relegion2 = new Select(Relegion);
		Relegion2.selectByIndex(1);
		
		WebElement mothertongue = driver.findElement(By.id("MOTHERTONGUE"));
		Select mothertongue1 = new Select(mothertongue);
		mothertongue1.selectByIndex(11);
		
		WebElement country = driver.findElement(By.id("COUNTRY"));
		Select country1 = new Select(country);
		country1.selectByIndex(1);
		driver.findElement(By.id("MOBILENO")).sendKeys("6379311990");
		driver.findElement(By.id("EMAIL")).sendKeys("praveenmanjunathanp@gmail.com");
		driver.findElement(By.xpath("(//input[@id='PASSWORD'])[3]")).sendKeys("praveen@1229");
		
	}

}
