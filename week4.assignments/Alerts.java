package week4.assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		//EdgeDriver driver = new EdgeDriver();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click(); 
	    Alert fAlert = driver.switchTo().alert();
		String text1 = fAlert.getText();
		System.out.println(text1);
		fAlert.accept();
	    String text4 = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
	    System.out.println(text4);
	   
	    //second alert
	    driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click(); 
	    Alert cAlert = driver.switchTo().alert();
		String text = cAlert.getText();
		System.out.println(text);
		cAlert.accept();
		String text5 = driver.findElement(By.xpath("//span[@id='result']")).getText();
	    System.out.println(text5);
		
	    //third alert
		 driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click(); 
		 String text3 = driver.findElement(By.xpath("//span[@id='result']")).getText();
		 System.out.println(text3);
		 driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		 Thread.sleep(1000);
		
		 //fourth alert 
	     driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
	    
	     //Fifth alert
	     driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		Alert promptAlert = driver.switchTo().alert();
		String text6 = promptAlert.getText();
		System.out.println(text6);
		promptAlert.sendKeys("testleaf");
		promptAlert.accept();
		String text2 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(text2);
		
		//sixth alert
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[7]")).click();
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		
		//seventh alert
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[8]")).click();
		String text7 = driver.findElement(By.xpath("//p[contains(text(),'I am Sweet Alert')]")).getText();
		System.out.println(text7);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-minus']")).click();
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
		driver.close();
		driver.quit();

	}

}
