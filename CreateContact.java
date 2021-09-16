package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args)  {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://leaftaps.com/opentaps/control/login");

		// USER NAME
		WebElement username = driver.findElement(By.id("username"));

		username.sendKeys("demosalesmanager");
//password
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("crmsfa");
//login
		WebElement Login = driver.findElement(By.className("decorativeSubmit"));

		Login.click();
		
		WebElement linktext = driver.findElement(By.linkText("CRM/SFA"));
		linktext.click();
		
		//contact tab
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		//first name
		
		driver.findElement(By.id("firstNameField")).sendKeys("Ram");
		//last name
		driver.findElement(By.id("lastNameField")).sendKeys("k");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Ram");
		
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("k");
		
		//description
		driver.findElement(By.id("createContactForm_description")).sendKeys("test");
		
		//department
		
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		
		//email
				driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("ramanathan.kabilan@gmail.com");
				
				//state
				
				WebElement elem =driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		
				Select s1=new Select(elem);
				
				s1.selectByVisibleText("New York");
				
				//create button
				
				
				driver.findElement(By.name("submitButton")).click();
				
				//edit 
				driver.findElement(By.linkText("Edit")).click();
				
				//description
				driver.findElement(By.id("updateContactForm_description")).clear();
				
				
				driver.findElement(By.name("importantNote")).sendKeys("ramanathan.kabilan@gmail.com");
				
				//submit 
				driver.findElement(By.name("submitButton")).click();
				
				String Title = driver.getTitle();

				System.out.println(Title);

		
	}

}
