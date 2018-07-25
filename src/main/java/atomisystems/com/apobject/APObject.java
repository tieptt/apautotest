package atomisystems.com.apobject;

import org.openqa.selenium.WebElement;

public abstract class APObject {
	protected WebElement _webElement;
	
	public APObject() {
		_webElement = null;
	}
	
	public APObject(WebElement webElement) {
		_webElement = webElement;
	}
	
	WebElement getElement() {
		return _webElement;
	}
}
