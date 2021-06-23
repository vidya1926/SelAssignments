package Assignmentsweek2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeafgroundpages {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//img[@alt='Edit / Text Fields']")).click();
		
		  //driver.findElement(By.xpath("//a[@href='pages/Edit.html']")).click();
		  
		  
		  driver.findElement(By.id("email")).sendKeys("vid.sanand@gmail.com");
		  
		  driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("TL");
		  
		  
		  String  text=driver.findElement(By.xpath("//input[@value='TestLeaf']")).getText();
		  System.out.println(text);
		  
		  driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		  
		 WebElement textDisabled=
		  driver.findElement(By.xpath("//input[@disabled='true']"));
		  
		  if(textDisabled.isEnabled()) 
		   { 
		     System.out.println("The field box is enabled. Return: "+textDisabled.isEnabled()); 
		   } 
		   else 
		   { 
		     System.out.println("The field box is disabled. Return: " +textDisabled.isEnabled()); 
		   } 


	}

}
