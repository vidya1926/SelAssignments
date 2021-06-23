package Assignmentsweek2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editlead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Hari");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId']")).click();
	//	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		String text1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
System.out.println(text1);
		
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra'])[2]//a[3]")).click();
		
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("TL");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
	}

}
