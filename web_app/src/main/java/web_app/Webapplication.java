package web_app;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webapplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Firefox.driver","C:\\Users\\exam\\Desktop\\web_application\\geckodriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.swiggy.com");
		driver.findElement(By.id("APjFqb")).sendKeys("https://www.swiggy.com");
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//input[@class = 'gNO89b']")).click();	
		driver.findElement(By.className("gNO89b")).click();
	
	}
		

		
	}


