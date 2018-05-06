import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Cross_Connection {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		//dc.setBrowserName("chrome");
		//dc.setPlatform(Platform.WINDOWS);
		//WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.120:4445/wd/hub"),dc);
		//driver.get("http://www.facebook.com");
		
		dc.setBrowserName(BrowserType.EDGE);
		dc.setPlatform(Platform.WIN10);
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.120:4445/wd/hub"),dc);
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
	}

}
