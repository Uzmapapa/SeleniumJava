package week4.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CountrowAndColumn {
public static void main(String[] args) {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(option);
	driver.get("https://html.com/tags/table/");
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    String text = driver.findElement(By.xpath("//table//caption[contains(text(),'The Three Most')]")).getText();
    System.out.println("Table 1: " +text);
    
    //first table
    List<WebElement>  rowCount= driver.findElements(By.xpath("//div[@class='render']//tr"));
    System.out.println("rows in 1st table:  "+ rowCount.size());
    List<WebElement>  colCount= driver.findElements(By.xpath("//div[@class='render']//td"));
    System.out.println("column in 1st table:  "+colCount.size());
    
    //second table
    List<WebElement> table1Row = driver.findElements(By.xpath("//table [@class='attributes-list']//tr"));
    System.out.println("rows in 2nd table:  "+table1Row.size()); 
    List<WebElement> table1Col = driver.findElements(By.xpath("//table [@class='attributes-list']//td"));
    System.out.println("column in 2nd table:  "+table1Col.size()); 
    driver.quit();
    
}
}
