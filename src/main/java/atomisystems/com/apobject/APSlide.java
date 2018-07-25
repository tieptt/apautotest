package atomisystems.com.apobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class APSlide extends APObject{
	public APSlide() {
		super();
	}
	
	public APSlide(WebElement webElement) {
		super(webElement);
	}
	
	WebElement getElementById(String id) {
		return _webElement.findElement(By.id(id));
	}
}
