package demotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpath {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TeeBiz\\Desktop\\Selenium\\Browser Driver\\geckodriver.exe");
		WebDriver w= new FirefoxDriver();
		//w.get("http://www.gmail.com");
		//w.get("http://www.facebook.com");
	    //w.findElement(By.xpath("//Input[@id='email']")).sendKeys("mahajanraminder@yahoo.com");
		//w.findElement(By.xpath("//Input[@id='pass']")).sendKeys("aptech@3389");
		//w.findElement(By.xpath("//Input[@type='submit']")).click();
		//w.findElement(By.xpath("//Input[@id='identifierId']")).sendKeys("kaur.raminder3");
		//w.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		//w.findElement(By.xpath("//Input[@name='password']")).sendKeys("aptech@3389");
		//w.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		w.get("https://www.tutorialspoint.com/selenium/selenium_pdf_version.htm");
		w.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[1]/aside/ul[2]/li[4]/a")).click();
		//w.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[2]/div[1]/div/h1[2]/a")).click();
		
		
	}

}
