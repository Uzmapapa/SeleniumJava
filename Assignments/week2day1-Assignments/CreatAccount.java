package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Accounts")).click();
		 driver.findElement(By.linkText("Create Account")).click();
		 driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit-ltd-Account");
		 driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("uzma");
		 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		 driver.findElement(By.xpath("//input[contains(@id,'officeSi')]")).sendKeys("testleaf adyar");
		 WebElement industry = driver.findElement(By.name("industryEnumId"));
		 Select drop1 = new Select(industry);
		 drop1.selectByVisibleText("Computer Software");
		 WebElement owner = driver.findElement(By.name("ownershipEnumId"));
		 Select drop2 = new Select(owner);
		 drop2.selectByVisibleText("S-Corporation");
		 WebElement source = driver.findElement(By.id("dataSourceId"));
		 Select drop3 = new Select(source);
		 drop3.selectByValue("LEAD_EMPLOYEE");
		 WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
		 Select drop4 = new Select(marketing);
		 drop4.selectByIndex(6);
		 driver.findElement(By.xpath("//input[@class = 'smallSubmit']")).click();
		 driver.close();
		
	}

}
