package dummyproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	WebDriver driver;
	@BeforeClass
	
	public void configBc() {
		String browser = System.getProperty("browser");
		System.out.println(browser);
		if(browser.equals("FireFox")) {
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			
			
		}
		
		
	}
	

}
