package pages;

import org.openqa.selenium.By;

import base.BaseClassLead;

public class MyHomePage extends BaseClassLead {

	public LeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new LeadsPage();
	}

}
