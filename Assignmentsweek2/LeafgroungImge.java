package Assignmentsweek2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroungImge {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com//pages/Image.html");

		driver.manage().window().maximize();
		/*
		 * String image = driver.findElement(By.
		 * xpath("//label[text()='Click on this image to go home page']/following-sibling::img"
		 * )) .getAttribute("src");
		 * 
		 * System.out.println(image);
		 */
		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
		driver.navigate().back();
		
		String brokenLink = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).getAttribute("src");
		System.out.println(brokenLink);
		
		
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
		
		String title=driver.getTitle();
		System.out.println(title);

		
		
		
	}

}
