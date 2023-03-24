package week4.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Sortable {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(option);
	driver.get("https://jqueryui.com/selectable/");
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.switchTo().frame(0);
    WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
    WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
    WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
    WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
    WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
    WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
    Actions action = new Actions(driver);
    action.clickAndHold(item1).clickAndHold(item5).perform();
    Thread.sleep(1000);
    
    action.keyDown(Keys.CONTROL).click(item2).click(item6).click(item3).click(item4).keyUp(Keys.CONTROL).perform();
    driver.close();
	
}
}
