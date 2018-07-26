package atomisystems.com.apobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class APRadioButton extends APObject{
	public APRadioButton() {
		super();
	}
	
	public APRadioButton(WebElement webElement) {
		super(webElement);
	}
	
	public void onClick() {
		_webElement.click();
	}
	
	public boolean isChecked() {
		WebElement pathCheck = _webElement.findElement(By.xpath("//*[local-name() = 'svg']/*[local-name() = 'g'][1]/*[local-name() = 'path'][4]"));
		if(null != pathCheck) {
			String attribute = pathCheck.getAttribute("d");
			return !attribute.isEmpty();
		}
		return false;
	}
}

