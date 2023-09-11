package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hmrs.lib.General;

public class TC002 {
// public static void main(String[]args) {
	@Test
	public void tc002() {
		DOMConfigurator.configure("Log4j.xml");

	 //test Steps
	 General obj = new General();
	 obj.OpenApplication();
	 obj.login();
	 obj.entrFrame();
	 obj.addNewEmp();
	 obj.exitFrame();
	 obj.logout();
	 obj.closeApplication();
 }
}
