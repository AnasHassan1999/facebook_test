package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "H:\\my new wep driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
       driver.findElement(By.id("email")).sendKeys("anashaasan123@hotmail.com");
       driver.findElement(By.id("pass")).sendKeys("487887877");
       driver.findElement(By.name("login")).click();
     //  Thread.sleep(3000);
       driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']")).click();

		
	}

}