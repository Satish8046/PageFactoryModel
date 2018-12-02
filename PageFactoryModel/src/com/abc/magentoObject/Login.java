package com.abc.magentoObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login
{
	WebDriver driver;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="pass")
	WebElement password;
	@FindBy(id="send2")
	WebElement login;
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void typeEmail(String em)
	{
		email.sendKeys(em);
	}
	public void typePass(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickOnLogin()
	{
		login.click();
	}
}
