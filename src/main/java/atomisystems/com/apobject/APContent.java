package atomisystems.com.apobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class APContent extends APObject{
	protected APCanvas _apCanvas;
	protected APSidebar _apSidebar;
	public APContent() {
		super();
	}
	
	public APContent(WebElement webElement) {
		super(webElement);
		_apCanvas = new APCanvas(_webElement.findElement(By.xpath("//div[@class='ap-stage']/div[@class='ap-canvas']")));
		_apSidebar = new APSidebar(_webElement.findElement(By.xpath("//div[@class='ap-side-bar']")));
	}
	
	public APSidebar getSidebar() {
		return _apSidebar;
	}
	
	public APCanvas getCanvas() {
		return _apCanvas;
	}
}