package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	protected WebDriver driver;

	@BeforeTest
	public void setUpDriver() throws MalformedURLException {
		
		String host = "192.168.99.114";
		DesiredCapabilities dc;
		
		if(System.getProperty("BROWSER") != null &&
				System.getProperty("BROWSER").equalsIgnoreCase("firefox")) {
			dc = DesiredCapabilities.firefox();
		}else {
			dc = DesiredCapabilities.chrome();
		}
		
		if(System.getProperty("HUB_HOST") != null) {
			host = System.getProperty("HUB_HOST");
		}
		
		String completeUrl="http://"+host+":4444/wd/hub";
		System.out.println(completeUrl);
		this.driver = new RemoteWebDriver(new URL(completeUrl), dc);
				
		this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterTest
	public void quit() {
		this.driver.quit();
	}

}
