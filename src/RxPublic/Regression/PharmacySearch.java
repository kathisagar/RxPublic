package RxPublic.Regression;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
/*import org.testng.annotations.Test;*/
import org.testng.annotations.Test;

public class PharmacySearch  {
    
	public static void login() throws MalformedURLException{
		
		/*System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		cap.setCapability("requirewindowfocus", true);
		WebDriver driver=new InternetExplorerDriver(cap);
		*/
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();             
		capabilities.setCapability("platform", "Windows 7");               
		capabilities.setCapability("version", "11"); 
		capabilities.setCapability("idleTimeout", 180);  
		capabilities.setCapability("requireWindowFocus", true);
		capabilities.setCapability("screenResolution" , "1280x800");
		
		WebDriver driver = new RemoteWebDriver(
		new URL("http://"+System.getenv("SAUCE_USERNAME")+":"+System.getenv("SAUCE_ACCESS_KEY")+"@ondemand.saucelabs.com:80/wd/hub"),
		capabilities);
		
		
		driver.get("https://crx.benefits.catamaranrx.com/rxpublic/portal/memberMain?customer=DEMO");
		driver.manage().window().maximize();
	}


@Test

public void logintest() throws MalformedURLException{
	login();
}
}
