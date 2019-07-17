package demotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class democlass1 {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TeeBiz\\Desktop\\Selenium\\Browser Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		String currenturl1 = driver.getCurrentUrl();
		String currenturl2 = driver.getTitle();
		String currenturl = driver.getPageSource();
	    driver.quit();
	    System.out.println("Current URL Source is " + currenturl1);
	    System.out.println("Page Title is " + currenturl2);
        System.out.println("Page Source is " + currenturl);
	}

}
