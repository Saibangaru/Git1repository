package OrangeHRM1;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPage1 {

	private static Object[] arguments;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\pdvna\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
				WebDriver driver= new ChromeDriver();
				
				driver.get("https://opensource-demo.orangehrmlive.com/");
			
				driver.findElement(By.id("txtUsername")).sendKeys("admin");
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				driver.findElement(By.id("btnLogin")).click();
				WebElement image= driver.findElement(By.xpath("//*[@id=\'branding\']/a[1]/img"));
				if(image.isDisplayed())
				{
					System.out.println("Image is displayed");
					System.out.println(image.getAttribute("alt"));
					
				}
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				WebElement move=driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']"));
				WebElement pim= driver.findElement(By.xpath("//*[@id=\'menu_pim_viewPimModule\']/b"));
				WebElement leave=driver.findElement(By.xpath("//*[@id=\'menu_leave_viewLeaveModule\']/b"));
				WebElement time=driver.findElement(By.xpath("//*[@id=\'menu_time_viewTimeModule\']/b"));
				WebElement recruitment=driver.findElement(By.xpath("//*[@id=\'menu_recruitment_viewRecruitmentModule\']/b"));
				WebElement performance=driver.findElement(By.xpath("//*[@id=\'menu__Performance\']/b"));
				WebElement dashboard=driver.findElement(By.xpath("//*[@id=\'menu_dashboard_index\']/b"));
				WebElement directory=driver.findElement(By.xpath("//*[@id=\'menu_directory_viewDirectory\']/b"));
				WebElement maintenance=driver.findElement(By.xpath("//*[@id=\'menu_maintenance_purgeEmployee\']/b"));
				
				WebElement admin= driver.findElement(By.xpath("//*[@id=\'welcome\']"));
				WebElement about= driver.findElement(By.xpath("//*[@id=\'aboutDisplayLink\']"));
				//WebElement companyName= driver.findElement(By.xpath("//*[@id=\'companyInfo\']/ul/li[1]/p"));
			
				Actions act = new Actions(driver);
				act.moveToElement(move).build().perform();
				act.moveToElement(pim).build().perform();
				
				act.moveToElement(leave).build().perform();
				
				act.moveToElement(time).build().perform();
				
				act.moveToElement(recruitment).build().perform();
				
				act.moveToElement(performance).build().perform();
				
				act.moveToElement(dashboard).build().perform();
				
				act.moveToElement(directory).build().perform();
				act.moveToElement(maintenance).build().perform();
				act.moveToElement(admin).click().build().perform();
				System.out.println("moved to admin");
				
			//	JavascriptExecutor js = JavascriptExecutor(driver);
			//	js.executeScript( "arguments[0]).click();", about);
				
				
				act.moveToElement(about).click().build().perform();
				
				System.out.println("completed");
				//Thread.sleep(5000);
				WebElement ab=driver.findElement(By.cssSelector("#displayAbout > div > h3"));
				System.out.println(	ab.getText());
				
		WebElement cpInfo= driver.findElement(By.xpath("//*[@id=\'companyInfo\']/ul/li[1]/p"));
		String info= cpInfo.getText();
		System.out.println(info);
		driver.findElement(By.xpath("//*[@id=\'displayAbout\']/div/a")).click();
		System.out.println("verify");
		WebElement num=driver.findElement(By.xpath("//*[@id=\'pieLabel0\']/div"));
	System.out.println(	num.getText());
	
	String chart1=driver.findElement(By.xpath("//*[@id=\'div_graph_display_emp_distribution\']/canvas[2]")).getCssValue("background-color");
	System.out.println(chart1);
	// chart1.click();
WebElement msg=	driver.findElement(By.xpath("//*[@id=\'hover_div_graph_display_emp_distribution\']"));
	
	System.out.println(	msg.getText());
	System.out.println(msg.getCssValue("color"));
				//driver.switchTo().alert().dismiss();
				/*WebElement companyName= driver.findElement(By.id("//*[@id=\'companyInfo\']/ul/li[1]/p"));
				String comp=companyName.getText();
				String name="Company Name: OrangeHRM (Pvt) Ltd";
				
				if(name==comp)
				{
					System.out.println("successful");
					
				}else
				{

                    System.out.println("not successfull");
                    
				} */
				
			//WebElement ab=driver.findElement(By.cssSelector("#displayAbout > div > h3"));
		//	System.out.println(	ab.getText());
	}

	
}
