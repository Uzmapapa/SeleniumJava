package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 Thread.sleep(1000);
		 driver.findElement(By.className("decorativeSubmit")).click();
		 System.out.println(driver.getTitle());
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf123");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("uzma1");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Papa");
		 WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select drop1 = new Select(source);
		 drop1.selectByVisibleText("Employee");
		  WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		 Select drop2 = new Select(marketing);
		 drop2.selectByValue("9001");
		 WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 Select drop3 = new Select(owner);
		 drop3.selectByIndex(4);
		 WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		 Select drop4 = new Select(country);
		 drop4.selectByVisibleText("India");
		
		 driver.findElement(By.name("submitButton")).click();
		 
		 String text= driver.findElement(By.id("viewLead_companyName_sp")).getText();
		   	System.out.println(text);
		    	if(text.contains("testleaf123"))
			{
				System.out.println("lead is created");
			}
			else {
				
				System.out.println("lead is not created");
			}
		      driver.close();
		 
		 
}

}


