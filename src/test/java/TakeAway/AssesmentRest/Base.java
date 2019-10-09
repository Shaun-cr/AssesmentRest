package TakeAway.AssesmentRest;

import org.junit.After;
import org.junit.Before;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
	@BeforeTest
	public void log() {
		Reporter.getCurrentTestResult();
		Reporter.log( "Message", true );
	}
	
	@AfterTest
	public void logAfter() {
		Reporter.getCurrentTestResult();
	}
}
