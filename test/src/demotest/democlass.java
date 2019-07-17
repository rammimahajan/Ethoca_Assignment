package demotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class democlass {

	public static void main(String[] args) throws InterruptedException 
	{
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\TeeBiz\\Desktop\\Selenium\\Browser Driver\\geckodriver.exe");
	  WebDriver ff=new FirefoxDriver();
	  ff.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      ff.get("http://www.facebook.com");
      ff.quit();
      
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\TeeBiz\\Desktop\\Selenium\\Browser Driver\\chromedriver.exe");
      WebDriver c=new ChromeDriver();
      Thread.sleep(30000);
      c.get("http://www.facebook.com");
      c.close();
      
      //WebDriver s=new SafariDriver();
      //s.get("http://www,facebook.com");
      //s.close();
      
      System.setProperty("webdriver.ie.driver", "C:\\Users\\TeeBiz\\Desktop\\Selenium\\Browser Driver\\IEDriverServer_Win32_3.13.0\\IEDriverServer.exe");
      WebDriver iex=new InternetExplorerDriver();
      Thread.sleep(10000);
      iex.get("http://www.facebook.com");
      String ac = iex.getTitle();
      System.out.println(ac);
      String ex = "Facebook - log in or sign up";
      String ex1 = "Facebook – log in or sign up";
      
      if(ac.equals(ex))
      {
    	  System.out.println("EX matched Sucessfully");
      }
      
      else if(ac.equals(ex1))
      {
    	  System.out.println("EX1 matched Sucessfully");
      }
      else
      {
    	  System.out.println("Titles did not matched");
      }
      
      iex.close();
	}

}
