package week4.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StockMarketDuplicateName {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.findElement(By.xpath("(//a[@class='ch-bar-item ch-button'])[3]")).click();
	   driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
	   List <WebElement> SecutityNames=driver.findElements
			     (By.xpath("//table[contains(@class,'table table-bordered')]//tr/td[1]"));
	   System.out.println(SecutityNames.size());
	   Set<String>name =new LinkedHashSet<String>();
	   
	   
		 for (int j = 0; j < SecutityNames.size(); j++) {
			// WebElement SecutityNames=driver.findElement
				//     (By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']//tr["+ j +"]//td[1]"));
			 String text = SecutityNames.get(j).getText();
			 name.add(text);
			 
			}
		 System.out.println(name);
	}
}