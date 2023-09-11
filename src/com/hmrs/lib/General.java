package com.hmrs.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hrms.utility.Log;


public class General extends Global {

	public void OpenApplication() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Home\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application open");
		Log.info("Application Opened");
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application close");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login....");
		}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout");
	}
	public void entrFrame() {
		driver.switchTo().frame(frame_empinfo);
		System.out.println("Enter frame");
	}
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("exit frame");
		}
	public void addNewEmp() {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_efn)).sendKeys(efn);
	    driver.findElement(By.name(txt_eln)).sendKeys(eln);
	    driver.findElement(By.id(btn_save)).click();
	    System.out.println("new emp added ");
	}
	
	
	
	

}