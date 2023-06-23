package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class meeshopage {

WebDriver driver;
	
	By search= By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[1]/input");
	By men=By.xpath("//*[@id=\"__next]\"]/div[2]/div[3]/div/div[5]/span");
	By Jewellery=By.xpath("//*[@id=\\\"__next\\\"]/div[2]/div[3]/div/div[6]/div/div[3]/a[5]/p");
	By hairclr=By.xpath("//*[@id=\\\"__next\\\"]/div[4]/div[2]/div/div/div[2]/div[2]/div[24]/div[14]/div[2]/div/span[3]/a");
	

public  meeshopage(WebDriver driver) 
{
this.driver=driver;
}
public void saree() 
{
	driver.findElement(search).sendKeys("saree");
}
public void men() {
	driver.findElement(men).click();
	
	driver.findElement(Jewellery).click();
}
public void haircolour()
{
	JavascriptExecutor Js=(JavascriptExecutor)driver;
	Js.executeScript("window.scrollBy(0,1000)","");
	driver.findElement(hairclr).click();
}
}
