package Assignmentsweek2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafgrounddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
        driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.findElement(By.linkText("Drop down")).click();

		WebElement webElement1 = driver.findElement(By.id("dropdown1"));
		Select drpDown1 = new Select(webElement1);
		drpDown1.selectByVisibleText("Selenium");

		WebElement webElement2 = driver.findElement(By.name("dropdown2"));
		Select drpDown2 = new Select(webElement2);
		drpDown2.selectByValue("3");

		WebElement webElement3 = driver.findElement(By.id("dropdown3"));
		Select drpDown3 = new Select(webElement3);
		drpDown3.selectByVisibleText("Loadrunner");

		WebElement webElement4 = driver.findElement(By.className("dropdown"));
		Select drpDown4 = new Select(webElement4);
		drpDown4.selectByVisibleText("Loadrunner");

		WebElement webElement5 = driver.findElement(By.xpath("//div[@id='contentblock']//following::select[5]"));
		Select drpDown5 = new Select(webElement5);
		drpDown5.selectByVisibleText("UFT/QTP");
		
		
		driver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option")).click();
		/*
		 * driver.findElement(By.
		 * xpath("//option[text()='Select your programs']/following-sibling::option[2]")
		 * ).click(); driver.findElement(By.
		 * xpath("//option[text()='Select your programs']/following-sibling::option[3]")
		 * ).click();
		 * 
		 * driver.findElement(By.
		 * xpath("//option[text()='Select your programs']/following-sibling::option[4]")
		 * ).click();
		 */		
	
}
}