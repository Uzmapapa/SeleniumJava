package week4.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Draggables {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    //droppable
	 /*  WebElement source = driver.findElement(By.xpath("//div[@id='form:drag_content']//p[1]"));
		WebElement des = driver.findElement(By.xpath("//div[@id='form:drop']//div[1]"));
			Actions builder=new Actions(driver);
			builder.dragAndDrop(source, des).perform();
			System.out.println(des.getCssValue("background-color"));
	
		//Draggable	
		WebElement sourceDrag = driver.findElement(By.xpath("//span[text()='Drag me around']"));
		Point location = sourceDrag.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println(x + "," + y);
		builder=new Actions(driver);
		builder.dragAndDropBy(sourceDrag,200,150 ).perform();
		System.out.println("(" +sourceDrag.getLocation().getX() + "," +sourceDrag.getLocation().getY() + ")");
	    
	    //draggable column
	    Thread.sleep(1000);
		WebElement source1 = driver.findElement(By.xpath("(//span[text()='Name'])[1]"));
		Thread.sleep(1000);
		WebElement des1 = driver.findElement(By.xpath("(//span[text()='Quantity'])[1]"));
		Actions builder=new Actions(driver);
		builder.dragAndDrop(source1, des1).build().perform();*/
		
		//draggable Row
		Thread.sleep(1000);
		WebElement source2 = driver.findElement(By.xpath("(//td[text()='Gaming Set'])[2]"));
		Thread.sleep(1000);
		WebElement des2 = driver.findElement(By.xpath("(//td[text()='Black Watch'])[2]"));
		Actions builder=new Actions(driver);
		builder.clickAndHold(source2).moveToElement(des2).release(des2).perform();
		//ranger
		WebElement source3 = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		builder.dragAndDropBy(source3, 40, 50);
		
}
}