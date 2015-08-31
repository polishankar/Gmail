package poli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class PageHome extends Intialize {
	
	public WebElement username() 
	{
		WebElement textBar = driver.findElement(By.id("Email"));
		return textBar;
		
	}
	public WebElement nextPage() 
	{
		WebElement next = driver.findElement(By.id("next"));
		return next;
		
	}
	public WebElement password() 
	{
		WebElement Passwd = driver.findElement(By.name("Passwd"));
		return Passwd;
		
	}
	
	public WebElement loginButton() 
	{
		WebElement send = driver.findElement(By.id("signIn"));
		return send;
		
	}
	


	public WebElement inBoxDrop() 
	{
		WebElement dropdown = driver.findElement(By.xpath("//img[@class='afM']"));
		return dropdown;
		
	}
	public WebElement inbox() 
	{
		WebElement inbx = driver.findElement(By.id(":jw"));
		return inbx;
		 
	}
	public WebElement imageLink() 
	{
		WebElement image = driver.findElement(By.xpath("//span[@class='gb_Fa gbii']"));
		return image;
		
	}
	
	
	public WebElement logoutLink() 
	{
		WebElement sinout = driver.findElement(By.id("gb_71"));
		return sinout;
		
	}
	
	
}
	


