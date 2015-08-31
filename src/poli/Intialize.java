package poli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class Intialize {
	static WebDriver driver;
	static String browser="FF";
	@BeforeSuite
	public static void browserChoose() 
	{
		if (browser.equals("FF") || browser.equals("FireFox")) 
		{
			driver=new FirefoxDriver();
			
		}else if(browser.equals("IE") || browser.equals("Internet Explorer")) 
		{
			driver=new InternetExplorerDriver();
		}
		else if(browser.equals("Chrome") || browser.equals("Chrome")) 
		{
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	public void url(){
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en-GB&service=mail#identifier");
		 driver.manage().window().maximize();
	}
	@AfterSuite(alwaysRun = true)
	public static void intializeDown() {
		driver.quit();
		driver = null;
	}

    public String getTestName() {
        return getClass().getSimpleName();
    }
}
