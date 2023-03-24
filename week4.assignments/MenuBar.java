package week4.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MenuBar {
	public static void main(String[] args) throws InterruptedException {
	
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(option);
	driver.get("https://leafground.com/menu.xhtml");
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    //menu bar
    driver.findElement(By.xpath("(//span[text()='Customers'])[1]")).click();
    WebElement customer=driver.findElement(By.xpath("(//span[@class='ui-menuitem-text'])[2]"));
    Actions action =new Actions(driver);
    action.moveToElement(customer).perform();
    Thread.sleep(1000);
  // right click using keyboard action
    WebElement rightClick = driver.findElement(By.xpath("//h5[text()='Context Menu']"));
    action.contextClick(rightClick).perform();
    
    action.contextClick().perform();
	}

}
