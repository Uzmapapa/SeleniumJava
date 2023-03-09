package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    WebElement sTool = driver.findElement(By.className("ui-selectonemenu"));
	    Select drop= new Select(sTool);
	    drop.selectByVisibleText("Playwright");
	    driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
	    driver.findElement(By.xpath("//li[@id='j_idt87:country_2']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[@id='j_idt87:city_label']")).click();
	    driver.findElement(By.xpath("//li[@id='j_idt87:city_1']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[contains(@class,'ui-button-icon')]")).click();
	    driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
	    driver.findElement(By.xpath("//span[contains(@class,'ui-button-icon')]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//li[text()='Playwright']")).click();
	    driver.findElement(By.xpath("(//span[@class= 'ui-icon ui-icon-triangle-1-s ui-c'])[3]")).click();
	    driver.findElement(By.xpath("//li[text()='English']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[text() = 'Select Values']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//li[text()='Two']")).click();
	    driver.close();
	    	    
	    }

}
