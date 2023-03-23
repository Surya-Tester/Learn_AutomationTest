package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Draganddrop {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement inact=driver.findElement(By.xpath("//*[text()='Interactions']"));
	wait.until(ExpectedConditions.visibilityOf(inact));
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguements[0].click", inact);

		

	}

}
