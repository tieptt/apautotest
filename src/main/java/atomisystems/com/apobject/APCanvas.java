package atomisystems.com.apobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class APCanvas extends APObject{
	public APCanvas() {
		super();
	}
	
	public APCanvas(WebElement webElement) {
		super(webElement);
	}
	
	public WebElement getElementByIndex(int nIndex) {
		String xpath = String.format("//div[@class='ap-slides']/div[3]/div[%d]", nIndex);
		WebElement element = _webElement.findElement(By.xpath(xpath));
		return element;
	}
	
	public WebElement getElementByID(String id) {
		String xpath = String.format("//div[@class='ap-slides']/div[3]/div[@id='%s']", id);
		WebElement element = _webElement.findElement(By.xpath(xpath));
		return element;
	}
}
