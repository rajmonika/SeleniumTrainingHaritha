package TestNGclass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestNGClass {

	@BeforeMethod
	public void Login()
	{
		System.out.println("@before Method --- Login into application");
	}
	
	//Test cases --- starts with @test
	@Test
	public void TitleTest()
	{
		System.out.println("@ test --- Test case - Google title test");
	}
	
	@Test
	public void SearchTest()
	{
		System.out.println("@ test --- Test case - Search data test");
	}
	
	@Test
	public void LogoCheck()
	{
		System.out.println("@ test --- Test case - Google Logo check");
	}
	
	@AfterMethod
	public void Logout()
	{
		System.out.println("@after Method --- Logout of the application");
	}
	
}
