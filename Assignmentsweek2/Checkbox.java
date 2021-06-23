package Assignmentsweek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");

		driver.manage().window().maximize();

		driver.findElementByXPath("//*[@id='post-153']/div[2]/div/ul/li[7]/a/img").click();

		driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[2]/input")).click();

		
		driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/label")).click();
		
	//WebElement select=driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input")).size();
		
	 int size = driver.findElementsByXPath("//label[text()='Select all below checkboxes ']/following::input").size();
	    
	    for (int i = 1; i <=size; i++) {
	       
	    	driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following::input["+i+"]").click();
	        
	    }
	    

		
	//	driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[1]")).click();

	}

}
