package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Thread.sleep(1000);
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		// Thread.sleep(1000);
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("uzma");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		 String text1= driver.findElement(By.xpath("//a[text()='15319']")).getText();
		 System.out.println(text1);
		 driver.findElement(By.xpath("//a[text()='15319']")).click();
		 driver.findElement(By.xpath("//a[text()='Edit']")).click();
		 driver.findElement(By.id("updateLeadForm_companyName")).clear();
		 driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Apricot Jingles");
		 
		 driver.findElement(By.xpath("(//input[@class='smallSubmit'])")).click();
		 Thread.sleep(1000);
		 String text2= driver.findElement(By.id("viewLead_companyName_sp")).getText();
		 System.out.println(text2);
		 
		
		//a[text()='testleaf123']
		// TODO Auto-generated method stub

	}

}
