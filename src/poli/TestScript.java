package poli;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class TestScript extends Intialize {
	Module m;
	@BeforeClass
	public void initLibs()
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		m=new Module();
	}

	@Test
	public void BverifyTitle() throws InterruptedException
	{
		m.url();
		m.login();
		Thread.sleep(30000);
		m.inBox() ;
		System.out.println("Who i am I");
		m.logout();
		System.out.println("I am fine");
		
	}
	

}
