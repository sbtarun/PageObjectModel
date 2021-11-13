package pages;

import org.openqa.selenium.By;

import base.BaseClassLead;

public class LoginPage extends BaseClassLead{
	
	public LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		return this;
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	
	public HomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage();

	}
}
