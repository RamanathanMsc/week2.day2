package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		
		
		//Find tab
		
				driver.findElement(By.linkText("Find Leads")).click();
		//phone		
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				
			//	driver.findElement(By.name("phoneCountryCode")).sendKeys("1");
				
				driver.findElement(By.name("phoneNumber")).sendKeys("99");
				
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				Thread.sleep(1000);
				String text= driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
				
				System.out.println(text);
				
			     driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			     
			     driver.findElement(By.linkText("Delete")).click();
			     
				
			   //Find tab
					
					driver.findElement(By.linkText("Find Leads")).click();
					
					driver.findElement(By.name("id")).sendKeys(text);
					
					driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
					
					Thread.sleep(1000);
					String text1 = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText(); 
					System.out.println(text1);
					
					if (text1.equalsIgnoreCase("No records to display"))
					{
						System.out.println("Lead id deleted successfully");
					}
					else
					{
						System.out.println("Lead id is not deleted successfully");
					}
	}
}
