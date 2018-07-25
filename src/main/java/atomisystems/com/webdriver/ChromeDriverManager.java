package atomisystems.com.webdriver;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDriverManager extends DriverManager {

	@SuppressWarnings("deprecation")
	@Override
	protected void createDriver() {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver((ChromeDriverService)_service, capabilities);
	}

	@Override
	protected void initService() {
		// TODO Auto-generated method stub
		if(null == _service) {
			_service = new ChromeDriverService.Builder()
					.usingDriverExecutable(new File("src/main/res/chromedriver.exe"))
					.usingAnyFreePort()
					.build();
		}
	}
	
}