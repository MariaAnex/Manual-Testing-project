package amaz;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Aamzone 
{
	WebDriver driver;
	@BeforeTest
	public void setups() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void amzurl() 
	{
		driver.get("https://www.amazon.in");
		
	}
	@Test
	public void amazones() 
	{
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		String Titles=driver.getTitle();
		if(Titles.equals("Amazon.in:mobilephones"))
		{
			System.out.println("Title verified");
		}
		else {
			{
				System.out.println("Title is not verified");
			}
		}
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		JavascriptExecutor Js=(JavascriptExecutor)driver;
		Js.executeScript("window.scrollBy(0,1000)","");
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		
	}
	
		
	
	
}
