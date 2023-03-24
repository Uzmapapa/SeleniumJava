package week4.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;

public class Nykaa {


	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments ("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.nykaa.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
	    Actions action =new Actions(driver);
	    action.moveToElement(brands).perform();
	    driver.findElement(By.xpath("//div[@id='scroller-container']/div[7]/a[1]")).click();
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("//span[@class='sort-name']")).click();
	    driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
	    driver.findElement(By.xpath("(//span[@class='title '])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Hair']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
	    driver.findElement(By.xpath("(//span[@class='count'])[2]")).click();
	    String text = driver.findElement(By.xpath("//span[text()='Shampoo']")).getText();
	    if(text.contains("Shampoo")) {
	    	System.out.println("filter has applied");
	    }
	    Thread.sleep(2000);	  
	    driver.findElement(By.xpath("(//div[@class='lazy-load-wrap']/img)[5]")).click();
	    Thread.sleep(1000);
	    Set<String> windowHandles = driver.getWindowHandles();
		  ArrayList<String> aList = new ArrayList<String>(windowHandles);
		  driver.switchTo().window(aList.get(1));
		  driver.findElement(By.xpath("//span[text()='180ml']")).click();
		  String rate = driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();
		  System.out.println(rate);
		  driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		  driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		  driver.switchTo().frame(0);
		  String GrandTotal = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText();
		  System.out.println("Grand Total: " + GrandTotal);
		  driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		  //i dint do the coding to compare the grand total as it taking it to sign in page after clicking proceed.
		  driver.quit();
	}
	
}
