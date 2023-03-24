package week4.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		//option.addArguments ("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Merge')]")).click();
		 driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
		 System.out.println(driver.getTitle());
		 Set<String> windowHandles = driver.getWindowHandles();
		  ArrayList<String> aList = new ArrayList<String>(windowHandles);
		  driver.switchTo().window(aList.get(1));
		  System.out.println(driver.getTitle());
		  //Thread.sleep(2000);
		  driver.findElement(By.xpath("(//a[@class='linktext'])[3]")).click();
		//  Thread.sleep(2000);
		  driver.switchTo().window(aList.get(0));
		  
		  driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		  System.out.println(driver.getTitle());
		  windowHandles = driver.getWindowHandles();
		  aList = new ArrayList<String>(windowHandles);
		  driver.switchTo().window(aList.get(1));
		  //Thread.sleep(2000);
		  driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		  driver.switchTo().window(aList.get(0));
		  driver.findElement(By.className("buttonDangerous")).click();
		  Alert Alert = driver.switchTo().alert();
		  String text = Alert.getText();
			System.out.println(text);
			Alert.accept();
			System.out.println(driver.getTitle());
		   driver.close();
		  
		

	}

}
