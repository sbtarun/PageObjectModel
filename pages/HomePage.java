package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.BaseClassLead;

public class HomePage extends BaseClassLead {
	
	public HomePage verifyLogin()
	{
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);		
		return this;		
	}
	
	public MyHomePage clickCrmSfa()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}
	

}
