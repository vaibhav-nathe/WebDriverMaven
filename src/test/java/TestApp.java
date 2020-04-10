import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestApp {

	public static WebDriver driver;
		@Test
			public void test() {
			Assert.assertEquals("", "");
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
			//cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			//cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			//System.setProperty("webdriver.ie.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\IEDriverServer.exe");
			//System.setProperty("webdriver..driver","D:\\Selenium jars\\chromedriver_win32\\IEDriverServer.exe");
			System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
			 WebDriver driver = new ChromeDriver(cap);
			driver.get("https://google.com");
				
			
		}

		}

