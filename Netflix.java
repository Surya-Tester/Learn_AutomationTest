import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Netflix implements ITestListener {
	//WebDriver driver;
	//@BeforeMethod
	/*public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_workspace\\chromedriver_win32 (2)\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));*/


	@Test(dataProvider = "getdata")
	public void login(String surya, String siva) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_workspace\\chromedriver_win32 (2)\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("#id_userLoginId")).sendKeys(surya);
		driver.findElement(By.cssSelector("#id_password")).sendKeys(siva);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
	@DataProvider
	public Object getdata() {
		Object[][] data=new Object[3][2];
		data[0][0]="surya";
		data[0][1]="thattithookku";
		data[1][0]="vikram";
		data[1][1]="amar";
		data[2][0]="varisu";
		data[2][1]="thunivu";
		return data;
	}
	@Test
	public void lanChange() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_workspace\\chromedriver_win32 (2)\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement sdd=driver.findElement(By.cssSelector("#lang-switcher-select"));
		Select dd=new Select(sdd);
		dd.selectByIndex(1);
	}
	@Test
	public void helpCenter() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_workspace\\chromedriver_win32 (2)\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Help Centre")).click();
	}
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		System.out.println("podu thakali");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		System.out.println("ada enswimming fool");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
		
  /* @AfterMethod   
   public void tearDown() {
	driver.quit();*/
}
   
