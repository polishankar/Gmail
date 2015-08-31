package poli;

public class Module extends PageHome {
	public void init() 
	{
		
		System.out.println("It's me");
		
	}
	public void login() throws InterruptedException 
	{
		username().sendKeys("poli.sankar@gmail.com");
		nextPage() .click();
		password().sendKeys("naidutej12");
		loginButton().click();
		
	}
	
	public void inBox() 
	{
		
		inBoxDrop().click();
		inbox().click();
		
	}
	public void logout() 
	{
		imageLink() .click();
		logoutLink().click();
		
	}
	

}
