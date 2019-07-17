package demotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TeeBiz\\Desktop\\Selenium\\Browser Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.rediffmail.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.id("email")).sendKeys("mahajanraminder@yahoo.com",Keys.TAB,"Super@422018",Keys.TAB.ENTER);
		driver.findElement(By.linkText("Sign in")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("proceed")).click();
		
		
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		alert.accept();
		
		//driver.close();
	}

}
