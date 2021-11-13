package pages;

import org.openqa.selenium.By;

import base.BaseClassLead;

public class LeadsPage extends BaseClassLead {

	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}
}