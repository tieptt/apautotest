package atomisystems.com.apobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class APPresentation extends APObject{
	
	protected WebElement _toolbarTop;
	protected APToolbar _toolbarBottom;
	protected APContent _apContent;
	
	public APPresentation() {
		super();
	}
	
	public APPresentation(WebElement webElement) {
		super(webElement);
		_apContent = new APContent(_webElement.findElement(By.xpath("//div[@class='ap-content-area']")));
		_toolbarTop = _webElement.findElement(By.xpath("//div[@class='ap-toolbar-top']"));
		_toolbarBottom = new APToolbar(_webElement.findElement(By.xpath("//div[@class='ap-toolbar ap-toolbar-bottom']")));
	}
	
	public WebElement getToolbarTopElement() {
		return _toolbarTop;
	}
	
	public APToolbar getToolbarBottomElement() {
		return _toolbarBottom;
	}
	
	public APContent getContentElement() {
		return _apContent;
	}
}
