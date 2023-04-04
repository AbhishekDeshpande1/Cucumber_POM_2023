package MyHooks;


import com.test.practise.testbase.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks {
		
	@Before("@Smoke")
	public static void startBrowser() {
			DriverFactory.setup();
		}
	
	@After("@Smoke2")
	public void  quitBrowser(){
		DriverFactory.closeBrowser();
	
	}
	
//	@After(order = 1)
//	public void takeScreenshot(Scenario scenario) throws IOException {
//		
//		if(scenario.isFailed()) {
//			
//			
//			TakeScreenShot.getScreenShot(driver,"screesnshot");
//			
//			
//		}
		
		
		
	}

