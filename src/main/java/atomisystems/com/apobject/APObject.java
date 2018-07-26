package atomisystems.com.apobject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public  class APObject {
	protected WebElement _webElement;
	
	public APObject() {
		_webElement = null;
	}
	
	public APObject(WebElement webElement) {
		_webElement = webElement;
	}
	
	public WebElement getElement() {
		return _webElement;
	}
	
	public ArrayList<APObject> getChildren(String className) {
		String xPath = String.format("div[@class='%s']", className);
		List<WebElement> childs = _webElement.findElements(By.xpath(xPath));
		ArrayList<APObject> apChilds = new ArrayList<APObject>();
		for(WebElement child : childs) {
			APObject object = new APObject(child);
			apChilds.add(object);
		}
		return apChilds;
	}
	
	public int getZIndex() {
		String zindex = _webElement.getCssValue("z-index");
		return Integer.parseInt(zindex);
	}
}
