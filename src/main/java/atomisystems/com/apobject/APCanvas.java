package atomisystems.com.apobject;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import atomisystems.com.apobject.APSlide;

public class APCanvas extends APObject{
	
	/*
	 * 	_SLIDE_BACKGROUND_HIGH: 3,
		_SLIDE_BOTTOM_HIGH: 4,
		_SLIDE_HIGH: 5,
		_SLIDE_TOP_HIGH: 6,
	 */
	
	HashMap<Integer, APSlide> _mapSlide = new HashMap<Integer, APSlide>();  
	
	public APCanvas() {
		super();
	}
	
	public APCanvas(WebElement webElement) {
		super(webElement);
		List<WebElement> childs = _webElement.findElements(By.xpath("//div[@class='ap-slides']/div[@class='ap-slide']"));
		for(WebElement child : childs) {
			APSlide slide = new APSlide(child);
			_mapSlide.put(slide.getZIndex(), slide);
		}
	}
	
	public APSlide getTopSlide() {
		return _mapSlide.get(6);
	}

	public APSlide getSlide() {
		return _mapSlide.get(5);
	}
	
	public APSlide getBottomSlide() {
		return _mapSlide.get(4);
	}
	
	public APSlide getBackgroundSlide() {
		return _mapSlide.get(3);
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
