import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class AshotImages {

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pdvna\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getCurrentUrl());
		WebElement uname=driver.findElement(By.name("txtUsername"));
		
		//Screenshot scr = new AShot().takeScreenshot(driver,uname);
		Screenshot scr = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(500)).takeScreenshot(driver,uname);
		File trg= new File("C:\\Users\\pdvna\\Desktop\\Shailaja\\Software\\Eclipse\\SeleniumPractice\\screenshot\\fullimage2.jpg");
		ImageIO.write(scr.getImage(), "jpg",trg );
		
		//uname.sendKeys("admin");
		//driver.findElement(By.name("txtUsername")).sendKeys("admin");
	//	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	//	driver.findElement(By.name("Submit")).click();
	//	System.out.println(driver.getTitle());
		driver.close();

	}

	

	private static void takescreenshot(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

}
