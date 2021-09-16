package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
				
				
				driver.findElement(By.xpath("(//*[@name='firstName'])[3]")).sendKeys("ram");
				
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				Thread.sleep(1000);
				String text= driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
				
				System.out.println(text);
				
				if(text.equalsIgnoreCase("ram"))
				{
					
					driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
					
					//edit 
					driver.findElement(By.linkText("Edit")).click();
					
					driver.findElement(By.id("updateLeadForm_companyName")).clear();
					
					driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("MSC");
					
					//submit 
					driver.findElement(By.name("submitButton")).click();
					
					String text1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
					
					String text2=text1.substring(0,3);
					
					System.out.println(text2);
					
					if("MSC"==text2)
						System.out.println("updated correctely");
					else
						System.out.println("Not updated correctely");
				}
				else
					
					System.out.println("Data not filter correctely");
	}

}
