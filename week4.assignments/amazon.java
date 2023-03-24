package week4.assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class amazon {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.amazon.in/");
	    driver.findElement(By.xpath("//label[text()='Search Amazon.in']/following::input")).sendKeys("oneplus 9 pro",Keys.ENTER);
	    String phonePrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
	    System.out.println(phonePrice);
	    WebElement customerReview = driver.findElement(By.xpath("//a[@class='a-popover-trigger a-declarative']"));
	    customerReview.click();
	   // Actions action =new Actions(driver);
	    //action.moveToElement(customerReview).click();	  
	    String review = driver.findElement(By.xpath("(//span[@class='a-size-base']//a)[2]")).getText();
	    System.out.println(review);
	    driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
	    Set<String> windowHandles = driver.getWindowHandles();
	     ArrayList<String> aList = new ArrayList<String>(windowHandles);
	     driver.switchTo().window(aList.get(1));
	     System.out.println(driver.getTitle());
	     File screenshot= driver.getScreenshotAs(OutputType.FILE);
	     File save = new File("./snap/img1.png");
	     FileUtils.copyFile(screenshot, save);
	    // String phonePrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
	     Thread.sleep(3000);
	     
	     driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	     Thread.sleep(3000);
	     String cartPrice = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
	     System.out.println(cartPrice);
	     if(cartPrice.contains("40,999")) {
	    	 System.out.println("Price Match");
	     }
	     else {
	    	 System.out.println("Price not Match");
	    	 
	     }
	     driver.quit();

	}

}
