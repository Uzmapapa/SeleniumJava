package week4.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameHandiling {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		//option.addArguments ("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://leafground.com/frame.xhtml");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 //frame1
		  driver.switchTo().frame(0);
		  driver.findElement(By.xpath("//button[text()='Click Me']")).click();
	      String text = driver.findElement(By.xpath("//button[contains(text(),'Hurray')]")).getText();
	      System.out.println(text);
	      driver.switchTo().defaultContent();
	      
	      //frame2
	      WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='nested.xhtml']"));
	      driver.switchTo().frame(frame1);
	      WebElement button = driver.findElement(By.xpath("//button[text()='Count Frames']"));
	      button.click();
	      System.out.println(button.getText());
	      driver.switchTo().defaultContent();
	      
	      //frame3
	      WebElement fframe = driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));
	      driver.switchTo().frame(fframe);
	      WebElement sframe = driver.findElement(By.xpath("//iframe[@src='framebutton.xhtml']"));
	      driver.switchTo().frame(sframe);
	      driver.findElement(By.xpath("//button[text()='Click Me']")).click();
	      String text1= driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
	      System.out.println(text1);
	      driver.switchTo().defaultContent();
	      driver.switchTo().parentFrame();
	      driver.close();
	}
}
	      
	     
	  