package atomisystems.com.webdriver;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.service.DriverService;

public abstract class DriverManager {
	protected DriverService _service;
	protected WebDriver driver;
	protected abstract void initService();
	protected abstract void createDriver();
	
	protected void startService() {
		if(null == _service) {
			initService();
		}
		try {
			_service.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void stopService() {
		if(null != _service && _service.isRunning())
			_service.stop();
	}
	
	public void quitDriver() {
		if(null != driver) {
			driver.quit();
			driver = null;
		}
	}
	
	public WebDriver getDriver() {
		if(null == driver) {
			startService();
			createDriver();
		}
		return driver;
	}
}