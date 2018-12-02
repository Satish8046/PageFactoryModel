package com.abc.magentotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoObject.Login;
import com.abc.magentoObject.Logout;
import com.abc.magentoObject.Welcome;

public class MagentoTest {

	public static void main(String[] args) 
	{
		String url="https://www.magento.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to(url);
		
		Welcome w=new Welcome(driver);
		w.clickOn();
		
		Login l=new Login(driver);
		l.typeEmail("sucheendra.abc@gmail.com");
		l.typePass("Welcome123");
		l.clickOnLogin();
		
		Logout m=new Logout(driver);
		m.clickOnLogout();
		
	}

}
