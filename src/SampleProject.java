import org.openqa.selenium.By;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

import java.io.*;





public class SampleProject {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	//System.setProperty("webdriver.ie.driver","C:\\Users\\pdvna\\Downloads\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\pdvna\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//
//WebDriver driver=new InternetExplorerDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	 System.out.println(driver.getCurrentUrl());
	//driver.findElement(By.name("search_query")).sendKeys("hello");
	
	 TakesScreenshot src=(TakesScreenshot)driver;
	 File scr=src.getScreenshotAs(OutputType.FILE);
	 File trg= new File("C:\\Users\\pdvna\\Desktop\\Shailaja\\Software\\Eclipse\\SeleniumPractice\\test1.png");

	FileUtils.copyFile(scr,trg);
	 
	 
	 
	// driver.findElement(By.name("txtUsername")).sendKeys("admin");
	// driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	// driver.findElement(By.name("Submit")).click();
	//System.out.println(driver.getTitle());
	//driver.close();
	//Using Java Script
	 WebElement wb= driver.findElement(By.name("txtUsername"));
	 JavascriptExecutor js= (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].value='admin123';", wb);
	 js.executeScript("document.getElementById('txtPassword').value='admin123';");
	 WebElement btn=driver.findElement(By.name("Submit"));
	 js.executeScript("arguments[0].click();",btn);
	 String span= driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
	 System.out.println(span);
	 Assert.assertEquals(span, "Invalid credentials");
		System.out.println("User not able to login successfully");

	}

}
