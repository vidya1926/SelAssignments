package Assignmentsweek2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafgroundlink {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com//pages/Link.html");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@link='blue']")).click();

		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[3]")).click();

		String control = driver.findElement(By.xpath("//a[@href='Button.html']")).getAttribute("href");
		System.out.println(control);

		driver.findElement(By.linkText("Verify am I broken?")).click();
		String broken = driver.getTitle();
		System.out.println(broken);

		driver.navigate().back();

		String link = driver.findElement(By.xpath("//div[@class='example'][4]//following::a")).getAttribute("href");

		System.out.println(link);

		//int size = driver.findElements(By.tagName("a")).size();
		//System.out.println("Number of links are " + size);
		List<WebElement> links =driver.findElements(By.tagName("a")); 
		System.out.println("Total Links in this page are : " +links.size());
		
		//for (int i=0; i < links.size(); i++) 
		//		{ To print all the links 
		//			WebElement l = links.get(i);
		//			String links = l.getAttribute("href");
		//			System.out.println(links);
				}

	}

}
