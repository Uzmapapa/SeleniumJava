package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceboookSignup {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://en-gb.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.xpath("//button[text()='Allow essential and optional cookies']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	    driver.findElement(By.name("firstname")).sendKeys("Uzma");
	    driver.findElement(By.name("lastname")).sendKeys("papa");
	    driver.findElement(By.name("reg_email__")).sendKeys("Uzma_papa@testleaf.com");
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Uzma_papa@testleaf.com");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("Cool123!");
	  
	    WebElement date = driver.findElement(By.name("birthday_day"));
		Select drop = new Select(date);
		drop.selectByVisibleText("4");
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select drop1 = new Select(month);
		drop1.selectByVisibleText("Jan");
		WebElement year= driver.findElement(By.name("birthday_year"));
		Select drop2 = new Select(year);
		drop2.selectByVisibleText("1990");
		driver.findElement(By.className("_58mt")).click();

	}
}