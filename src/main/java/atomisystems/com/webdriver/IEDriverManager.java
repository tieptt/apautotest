package atomisystems.com.webdriver;

import java.io.File;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEDriverManager extends DriverManager{

	@SuppressWarnings("deprecation")
	@Override
	protected void createDriver() {
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		InternetExplorerOptions options = new InternetExplorerOptions();
		capabilities.setCapability("se:ieOptions", options);
		driver = new InternetExplorerDriver((InternetExplorerDriverService)_service, capabilities);
	}

	@Override
	protected void initService() {
		// TODO Auto-generated method stub
		if(null == _service) {
			_service = new InternetExplorerDriverService.Builder()
					.usingDriverExecutable(new File("src/main/res/IEDriverServer.exe"))
					.usingAnyFreePort()
					.build();
		}
	}
	
}