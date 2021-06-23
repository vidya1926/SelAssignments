package Assignmentsweek2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.redbus.in/");
			
			driver.manage().window().maximize();
			//driver.switchTo().alert().dismiss();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			
	WebElement select = driver.findElementById(("src"));
	select.sendKeys("chennai");
	Thread.sleep(2000);
	select.sendKeys(Keys.ARROW_DOWN);
	select.sendKeys(Keys.TAB);
	select.sendKeys(Keys.ENTER);

			
	WebElement select1= driver.findElementById("dest");
	select1.sendKeys("bangalore");
	Thread.sleep(1000);
	select1.sendKeys(Keys.ARROW_DOWN);
	select1.sendKeys(Keys.TAB);
	select1.sendKeys(Keys.ENTER);

 driver.findElement(By.id("onward_cal")).click();
	
	//driver.findElement(By.xpath("//td[@class='next']//button[1]")).click();
//.findElement(By.xpath("//td[@class='we day']")).click();
 driver.findElement(By.xpath("//td[text()='28']")).click();
	driver.findElementById("search_btn").click();
	Thread.sleep(5000);
		/*
		 * String buses =
		 * driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		 * System.out.println(buses);
		 */
	
	
	
	
	/*
	 * Choose only Sleeper Bus 8.Print the number of search results 9.Choose also AC
	 * buses 10.Print the number of search results
	 */

}}
