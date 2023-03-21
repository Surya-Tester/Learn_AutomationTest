package salesforce.salesforcelogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class salestestTest {
	@Test
	public void saleslogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.id("username")).sendKeys("manoj");
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("iphone");
		Thread.sleep(3000L);
		driver.findElement(By.name("Login")).click();
	}
		@Test
		public void forget() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium_workspace\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/?locale=in");
			driver.findElement(By.id("username")).sendKeys("manoj");
			Thread.sleep(3000L);
			driver.findElement(By.linkText("Forgot Your Password?")).click();
			}
		@Test
		public void empty() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium_workspace\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/?locale=in");
			driver.findElement(By.id("username")).sendKeys("manoj");
			Thread.sleep(3000L);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
			Thread.sleep(3000L);
			driver.findElement(By.name("Login")).click();
		}
	
		
	

}
