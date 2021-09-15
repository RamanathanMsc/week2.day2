package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://en-gb.facebook.com/");
		// create button
		driver.findElement(By.linkText("Create New Account")).click();

		// first name

		driver.findElement(By.name("firstname")).sendKeys("Ram");

		// Surname

		driver.findElement(By.name("lastname")).sendKeys("K");

		// mobile number

		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9626472811");

		// password

		driver.findElement(By.id("password_step_input")).sendKeys("ram12345");

		// birthday date month year

		WebElement Day = driver.findElement(By.name("birthday_day"));

		Select day1 = new Select(Day);

		day1.selectByVisibleText("2");

		WebElement Month = driver.findElement(By.id("month"));

		Select Month1 = new Select(Month);

		Month1.selectByIndex(3);

		WebElement Year = driver.findElement(By.id("year"));

		Select Year1 = new Select(Year);

		Year1.selectByValue("1989");
		
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		

	}

}
