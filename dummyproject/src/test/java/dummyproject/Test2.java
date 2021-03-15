package dummyproject;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "./src/main/resources/chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("//demo.actitime.com/login.do");
		d.findElementById("username").sendKeys("admin");
		d.findElementByName("pwd").sendKeys("manager");
		d.getTitle();
		

	}

}
