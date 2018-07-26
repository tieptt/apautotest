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
	
	public WebElement getElementByIndex(int nIndex) {
		String xpath = String.format("///div[%d]", nIndex);
		WebElement element = _webElement.findElement(By.xpath(xpath));
		return element;
	}
	
	public WebElement getElementByID(String id) {
		String xpath = String.format("//div[@id='%s']", id);
		WebElement element = _webElement.findElement(By.xpath(xpath));
		return element;
	}
}
