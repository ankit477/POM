package com.crm.qa.util;

import com.crm.qa.base.Testbase;

public class TestUtil extends Testbase {
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 200;

public void switchToFrame() {
	driver.switchTo().frame("mainpanel");
}}