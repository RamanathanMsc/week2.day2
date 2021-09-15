package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static ChromeDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");

		// first name

		textbox(By.name("UserFirstName"), "Ram");

		// Last name

		textbox(By.name("UserLastName"), "K");

		// User email

		textbox(By.name("UserEmail"), "Ramanathan.kabilan@gmail.com");
		// company

		textbox(By.name("CompanyName"), "MSC");

		// company

		textbox(By.name("UserPhone"), "9626472811");

		// Job Title

		Dropdown(By.name("UserTitle"), "Customer Service Manager");

		// employee

		Dropdown(By.name("CompanyEmployees"), "501 - 1500 employees");

		// company country

		Dropdown(By.name("CompanyCountry"), "India");
		
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[1]")).click();

	}

	public static void textbox(By Locator, String text1) {
		WebElement text = driver.findElement(Locator);

		text.sendKeys(text1);

	}

	public static void Dropdown(By Locator, String text2) {
		WebElement drop = driver.findElement(Locator);
drop.click();
		Select S1 = new Select(drop);
		S1.selectByVisibleText(text2);

	}

}
