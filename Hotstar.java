import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Hotstar implements ITestListener {
	@Parameters({"skey","sloc","surl"})
	@Test
	public void hotstarLogin(String sk,String sl,String sur) throws InterruptedException {
		System.setProperty(sk, sl);
		WebDriver driver=new ChromeDriver();
		driver.get(sur);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#phoneNo")).sendKeys("902378");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".submit-button")).click();
	}
	
		
				
	
	@Test
	public void otpCheck() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_workspace\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hotstar.com/in/subscribe/sign-in?returnURL=/in/subscribe/my-account");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#phoneNo")).sendKeys("9025947690");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".single-otp-input")).sendKeys("7896");
		driver.findElement(By.cssSelector(".submit-button")).click();
		
	}
	@Test
	public void verifytitle() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_workspace\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hotstar.com/in/subscribe/sign-in?returnURL=/in/subscribe/my-account");
		String actualTitle=driver.getTitle();
		String expectedTitle=("Log In");
		Assert.assertEquals(actualTitle, expectedTitle);
		
		}




	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}




	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}




	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
		System.out.println("not duckling");
	}




	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}




	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		System.out.println("duckling");
	}




	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
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
		System.out.println("sam****");
	}
		
	
	
}