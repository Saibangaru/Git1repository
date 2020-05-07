import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class DataDrivenTesting {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pdvna\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

driver.manage().window().maximize();
driver.manage().deleteAllCookies();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	 System.out.println(driver.getCurrentUrl());
	 
	FileInputStream file= new FileInputStream("C:\\Users\\pdvna\\Desktop\\Shailaja\\Software\\Eclipse\\SeleniumPractice\\ExcelSheet\\data1.xlsx");
	 XSSFWorkbook wb= new XSSFWorkbook(file);
	 XSSFSheet sheet= wb.getSheet("sheet1");
	 int row=sheet.getLastRowNum();
	 int cell= sheet.getRow(0).getLastCellNum();
	 
	 for(int i=1; i<=row;i++)
	 {
		 
	 
	 XSSFRow current_Row= sheet.getRow(i);
	 //for(int j=0; j<=cell;j++)
	 //{
			String uname = current_Row.getCell(0).getStringCellValue();
			String pword = current_Row.getCell(1).getStringCellValue();

			WebElement username = driver.findElement(By.name("txtUsername"));
			username.clear();
			username.sendKeys(uname);
			WebElement password = driver.findElement(By.name("txtPassword"));
			password.clear();
			password.sendKeys(pword);
			driver.findElement(By.name("Submit")).click();

	/*	String span= driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
	if (span.contains("Invalid credentials"))
	{
		System.out.println("Login  not completed successfully");
	}
	else {
	
		
		System.out.println("Login completed successfully ");
	
		Assert.assertEquals(span, "Invalid credentials");
		System.out.println("welcome");
		
		System.out.println(driver.getTitle());
	*/

	driver.navigate().back();
	 }
	
	 
		}

}

