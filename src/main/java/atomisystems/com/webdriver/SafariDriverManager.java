package atomisystems.com.webdriver;

import java.io.File;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriverService;
import org.openqa.selenium.safari.SafariOptions;

public class SafariDriverManager extends DriverManager {

	@Override
	protected void createDriver() {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		SafariOptions options = new SafariOptions();
		capabilities.setCapability(SafariOptions.CAPABILITY, options);
		driver = new SafariDriver((SafariDriverService)_service);
	}

	@Override
	protected void initService() {
		// TODO Auto-generated method stub
		if(null == _service) {
			_service = new SafariDriverService.Builder()
					.usingDriverExecutable(new File("chromedriver.exe"))
					.usingAnyFreePort()
					.build();
		}
	}
	
}
