package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_login 

{
      public static void main (String[]args)
   {
	 System.setProperty("webdriver.chrome.driver","\\E:\\my salenium\\chromedriver_win32 (6)\\chromedriver.exe\\");
	 
	            WebDriver driver = new ChromeDriver();
	            driver.get("https://www.facebook.com//");
	            driver.findElement(By.xpath("//input[ @name='email']")).sendKeys("dipakrmali2@gmail.com");
	             driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("8600917550");
	             driver.findElement(By.xpath("//button[@name='login']")).click();
   }
	
	
}
