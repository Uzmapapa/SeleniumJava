package week4.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LibraryTable {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    List<WebElement>  rowCount= driver.findElements(By.xpath("//div[@class='render']//tr"));
	    System.out.println("rows in 1st table:  "+ rowCount.size());
	    List<WebElement>  colCount= driver.findElements(By.xpath("//div[@class='render']//td"));
	    System.out.println("column in 1st table:  "+colCount.size());
	    
	    for (int i = 0;i<colCount.size() -1; i++) {
	    	System.out.println(colCount.get(i).getText());
       }
	  
	}
	    		 	 
}		
	    	
   	
