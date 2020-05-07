package OrangeHRM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:\\Users\\pdvna\\Downloads\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe"); 
		WebDriver driver= new InternetExplorerDriver();
		driver.get("https://www.google.com/");

	}

}
