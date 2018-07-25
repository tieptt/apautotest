package atomisystems.com.webdriver;

import java.io.File;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxDriverManager extends DriverManager{

	@SuppressWarnings("deprecation")
	@Override
	protected void createDriver() {
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("test-type");
		capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
		driver = new FirefoxDriver((GeckoDriverService)_service, capabilities);
	}

	@Override
	protected void initService() {
		// TODO Auto-generated method stub
		if(null == _service) {
			_service = new GeckoDriverService.Builder()
					.usingDriverExecutable(new File("src/main/res/geckodriver.exe"))
					.usingAnyFreePort()
					.build();
		}
	}
	
}
