package TestNGFeature;

import org.testng.annotations.Test;

public class TestNGGrop {
	
	
	@Test(groups= {"sanity"})
	public void login()
	{
		
		System.out.println("this is sanity testcase for login functionality ");
	}

	@Test(groups= {"somke"})
	public void GetTitle()
	{
		
		System.out.println("this is somke testcase for title  ");
	}
	
	
	@Test(groups= {"dailyBuild"})
	public void dragandDrop()
	{
		
		System.out.println("this is dailybuild testcase for drag and drop  ");
	}
	
	
}
