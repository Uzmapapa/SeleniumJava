package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 System.out.println(driver.getTitle());
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf123");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("uzma1");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Papa");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Uzi");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("tester");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Lead form data");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("uzi@testleaf.com");
		 driver.findElement(By.name("submitButton")).click();
		 String submitTitle = driver.getTitle();
		 System.out.println(submitTitle);
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).clear();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testng");
		 driver.findElement(By.id("createLeadForm_firstName")).clear();
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("uzmaa");
		 driver.findElement(By.name("submitButton")).click();
		 String submitTitle1 = driver.getTitle();
		 System.out.println(submitTitle1);
		 
		
		 
		

	}

}
