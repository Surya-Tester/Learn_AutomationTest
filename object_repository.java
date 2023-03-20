package day2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class object_repository {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	File f1=new File("D:\\selenium_cloudswan\\learn selenium\\Or.prpoperties");
		FileInputStream fis=new   FileInputStream(f1);
		Properties prop=new Properties();
		prop.load(fis);
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
	WebElement un=driver.findElement(By.xpath(prop.getProperty("fbun_id")));
	un.sendKeys("sdvdddjd");
	WebElement pw=driver.findElement(By.xpath(prop.getProperty("fb name")));
	pw.sendKeys("12343");
	WebElement ln=driver.findElement(By.xpath(prop.getProperty("fb_login")));
	ln.click();
	
		

	}

}
