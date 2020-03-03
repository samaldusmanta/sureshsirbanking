package com.bank.lib;
 
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.bank.objectsinfo.*;
import com.bank.testdata.*;
import com.bank.utility.Log;
public class CommonFunctions {
//Re-Usable fun:
	WebDriver driver;
	public static void printstmt(String msg) {
		System.out.println(msg);
		Reporter.log(msg);
		Log.info(msg);
	}
	
	public void openApplication() {
		try {
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to(TestData.url);
	System.out.println("Application opened");
	CommonFunctions.printstmt("Application opened");
	Reporter.log("Application opened");
	Log.info("Application Opened");
	
		}
		catch(Exception e) {
			System.out.println("Application not Opened "+ e);
			Log.error("Application not Opened");
		}
	}
	
	public void login() throws Exception{
		try {
	driver.findElement(By.name(ObjectsInfo.txt_username_batch1)).sendKeys(TestData.username);
	driver.findElement(By.name(ObjectsInfo.txt_pasword_batch1)).sendKeys(TestData.password);
	driver.findElement(By.name(ObjectsInfo.btn_Submit)).click();
	Thread.sleep(3000);
	System.out.println("Login completed");
	Log.info("Login  completed");
		}
		catch(Exception e) {
			System.out.println("Login issue found" + e);
			Log.error("Login issue found");
		}
	}

	public void clickBuild2() throws Exception{
		try {
		driver.findElement(By.id(ObjectsInfo.btn_build2)).click();
		Thread.sleep(3000);
		System.out.println("Clicked on Build2");
		Log.info("Clicked on Build2");
		}
		catch(Exception e) {
			System.out.println("Build2 to not Opened" + e);
			Log.error("Build2 to not Opened");
		}
	}
	
	public void clickAdmin() throws Exception{
		try {
		driver.findElement(By.xpath(ObjectsInfo.link_Admin)).click();
		Thread.sleep(3000);
		System.out.println("Clicked on Admin Link");
		Log.info("Clicked on Admin Link");
		}
		catch(Exception e) {
			System.out.println("Admin link not clicked" + e);
			Log.error("Admin link not clicked");
		}
	}

	public void admin_Login() throws Exception{
		try {
		driver.findElement(By.name(ObjectsInfo.txt_Admin_username)).sendKeys(TestData.admin_username);
		driver.findElement(By.name(ObjectsInfo.txt_Admin_password)).sendKeys(TestData.admin_password);
		driver.findElement(By.name(ObjectsInfo.btn_Admin_Login)).click();
		Thread.sleep(3000);
		System.out.println("Admin login completed");
		Log.info("Admin login completed");
		}
		
		catch(Exception e) {
			System.out.println("Admin not login");
			Log.error("Admin not login");
		}
	}

	public void click_AddNewLoans() throws Exception{
		try {
		driver.findElement(By.xpath(ObjectsInfo.link_Admin_AddNewLoans)).click();
		Thread.sleep(3000);
		System.out.println("Clicked on AddNew loan link");
		Log.info("Clicked on AddNew loan link");
		}
		catch(Exception e) {
			System.out.println("AddNew load link not clicked");
			Log.error("AddNew load link not clicked");
			
		}
	}
	public void AddNewLoan() throws Exception{
		try {
		driver.findElement(By.xpath(ObjectsInfo.txt_Admin_LoanName)).sendKeys(TestData.loanname);
		driver.findElement(By.name(ObjectsInfo.txt_Admin_NoticePer)).sendKeys(TestData.notp);
		driver.findElement(By.name(ObjectsInfo.txt_Admin_Emi)).sendKeys(TestData.emi);
		driver.findElement(By.name(ObjectsInfo.txt_Admin_ROI)).sendKeys(TestData.roi);
		driver.findElement(By.name(ObjectsInfo.txt_Admin_MaxAmount)).sendKeys(TestData.maxa);
		driver.findElement(By.name(ObjectsInfo.btn_Admin_Submit)).click();
		Thread.sleep(3000);
		System.out.println("New Loan Added Successfully");
		Log.info("New Loan Added Successfully");
		}
		catch(Exception e) {
			System.out.println("New Load detail not Added");
			Log.error("New Load detail not Added");
		}
	}
	
	public void alert()  {
		try {
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		}
		catch(Exception e) {
			System.out.println("alert not closed");
		}
	}

	public void close() {
		try {
		driver.close();
		System.out.println("Brower closed");
		Log.info("Brower closed");
		}
		catch(Exception e) {
			System.out.println("Browser not closed" + e);
			Log.error("Browser not closed");
		}
	}
	
}
