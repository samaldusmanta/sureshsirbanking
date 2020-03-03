package com.bank.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.bank.lib.CommonFunctions;

public class TC001 {

//Actual TestCase steps
@Test 
public void testng()throws Exception{
	
	//public static void main(String args[]) throws Exception{
	DOMConfigurator.configure("log4j.xml");
		CommonFunctions obj = new CommonFunctions();
		obj.openApplication();
		obj.login();
		obj.clickBuild2();
		obj.clickAdmin();
		obj.admin_Login();
		obj.click_AddNewLoans();
		obj.AddNewLoan();
		obj.alert();
		obj.close();
}
	
}
