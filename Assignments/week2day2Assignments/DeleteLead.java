package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			 driver.findElement(By.className("decorativeSubmit")).click();
			 driver.findElement(By.linkText("CRM/SFA")).click();
			 driver.findElement(By.linkText("Leads")).click();
			 driver.findElement(By.linkText("Find Leads")).click();
			 driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
			 driver.findElement(By.name("phoneNumber")).sendKeys("12345678");
			 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			 String text = driver.findElement(By.xpath("//a[text()='15771']")).getText();
			 System.out.println(text);
			 driver.findElement(By.xpath("//a[text()='15771']")).click();
			 driver.findElement(By.linkText("Delete")).click();
			 driver.findElement(By.linkText("Find Leads")).click();
			 driver.findElement(By.xpath("//input[@name='id']")).sendKeys("15771");
			 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			 String text1 = driver.findElement(By.className("x-paging-info")).getText();
			 System.out.println(text1);
			 if(text1.contains("No")) {
				 System.out.println("No records found");
			 }
			 else {
				 System.out.println("records found");
			 }
}
}