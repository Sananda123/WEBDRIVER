package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hmrs.lib.General;

public class TC001 {
//public static void main(String[]args) {
	@Test
	public void tc001() {
		DOMConfigurator.configure("Log4j.xml");

	//test step
	General obj = new General() ;
	obj.OpenApplication();
	obj.login();
	obj.logout();
	obj.closeApplication();
}
}
