package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class learnlocators {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	WebElement fbcreate=driver.findElement(By.xpath("//a[text()='Create new account']"));
	fbcreate.click();
	
	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50)); 
	Thread.sleep(2000);
	
	WebElement fn=driver.findElement(By.xpath("//input[@name='firstname' or @aria-label='First name']"));
	
	//wait.until(ExpectedConditions.elementToBeSelected(fn));

	fn.sendKeys("fox");
	WebElement sn=driver.findElement(By.xpath("//input[starts-with(@id,'u_2_d')]"));
	sn.sendKeys("suri");
	WebElement email=driver.findElement(By.xpath("//input[contains(@id,'u_2_g')]"));
	email.sendKeys("9876543210");
	Thread.sleep(1000);
	WebElement np=driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
	np.sendKeys("123456");
	Thread.sleep(2000);
	WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
	WebElement mon= driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select dd=new Select(day);
	dd.selectByIndex(6);
	Select dy=new Select(mon);
	dy.selectByVisibleText("Aug");
	

	}

}
