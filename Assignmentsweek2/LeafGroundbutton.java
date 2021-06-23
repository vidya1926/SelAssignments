package Assignmentsweek2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com//pages/Button.html");

		driver.manage().window().maximize();
		
     	WebElement Homepage=driver.findElement(By.id("home"));
		String title= driver.getTitle();
		System.out.println(title);
		Homepage.click();
		
		
		driver.findElement(By.xpath("//a[@href='pages/Button.html']")).click();
		
		Point location = driver.findElement(By.xpath("//button[text()='Get Position']")).getLocation();
        System.out.println(location);
        
		String color = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(color);
		
		Dimension size = driver.findElement(By.id("size")).getSize();
		System.out.println(size);
	}

	

}
