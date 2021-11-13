package pages;

import org.openqa.selenium.By;

import base.BaseClassLead;

public class CreateLeadPage extends BaseClassLead {

	public CreateLeadPage enterDetails() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tarun");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sb");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
		driver.findElement(By.name("submitButton")).click();
		return this;
	}
}
