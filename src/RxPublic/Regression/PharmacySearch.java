package RxPublic.Regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
/*import org.testng.annotations.Test;*/
import org.testng.annotations.Test;

public class PharmacySearch  {
    
	public static void login(){
		
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		cap.setCapability("requirewindowfocus", true);
		WebDriver driver=new InternetExplorerDriver(cap);
		
		driver.get("https://crx.benefits.catamaranrx.com/rxpublic/portal/memberMain?customer=DEMO");
		driver.manage().window().maximize();
	}


@Test

public void logintest(){
	login();
}
}
