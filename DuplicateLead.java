package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		
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
		
	//Leads tab
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("emailAddress")).sendKeys("jenniferaniston@gmail.com");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		String text= driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
		
		System.out.println("actual name" +  text);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
	     
	     driver.findElement(By.linkText("Duplicate Lead")).click();
	     Thread.sleep(1000);
	     String text1= driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
	     System.out.println(text1);
	     
	     if(text.equals(text1))
	    	 System.out.println("Duplicate value is correct");
	     else
	    	 System.out.println("Duplicate value is wrong");
	}

}
