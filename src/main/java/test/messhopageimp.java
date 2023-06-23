package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.meeshopage;

public class messhopageimp {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void meeshologins() {
		driver.get("https://www.meesho.com/");
	}
	@Test
	public void running() {
		meeshopage mepg=new meeshopage(driver);
		mepg.men();
		mepg.saree();
	}
	

}
