package week4.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowsHandiling {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		//option.addArguments ("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://leafground.com/window.xhtml");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //window1
		 driver.findElement(By.xpath("//span[text()='Open']")).click();
		 System.out.println(driver.getTitle());
		 Set<String> windowHandles = driver.getWindowHandles();
		  ArrayList<String> aList = new ArrayList<String>(windowHandles);
		  driver.switchTo().window(aList.get(1));
		  System.out.println(driver.getTitle());
		  driver.close();
		  driver.switchTo().window(aList.get(0));
		  
		   //window2
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		  windowHandles = driver.getWindowHandles();
		  aList = new ArrayList<String>(windowHandles);
		  driver.switchTo().window(aList.get(1));
		  System.out.println(driver.getCurrentUrl()); 
		  driver.close();
		  driver.switchTo().window(aList.get(2));
		  System.out.println(driver.getCurrentUrl());
		  driver.close();
		  driver.switchTo().window(aList.get(0));
		  
		  //window3
		  driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		  windowHandles = driver.getWindowHandles();
		  aList = new ArrayList<String>(windowHandles);
		  driver.switchTo().window(aList.get(1));
		  System.out.println(driver.getCurrentUrl()); 
		  driver.close();
		  driver.switchTo().window(aList.get(2));
		  System.out.println(driver.getCurrentUrl()); 
		  driver.close();
		  driver.switchTo().window(aList.get(3));
		  System.out.println(driver.getCurrentUrl()); 
		  driver.close();
		  driver.switchTo().window(aList.get(0));
		  
		  //window4
		  driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		  windowHandles = driver.getWindowHandles();
		  aList = new ArrayList<String>(windowHandles);
		  driver.switchTo().window(aList.get(1));
		  Thread.sleep(1000);
		  System.out.println(driver.getCurrentUrl()); 
		  driver.close();
		  driver.switchTo().window(aList.get(2));
		  Thread.sleep(1000);
		  System.out.println(driver.getCurrentUrl()); 
		  driver.close();
		  driver.switchTo().window(aList.get(0));
		  driver.quit(); 
	}
}
