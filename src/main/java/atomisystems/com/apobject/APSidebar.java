package atomisystems.com.apobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class APSidebar extends APObject{
	public APSidebar() {
		super();
	}
	
	public APSidebar(WebElement webElement) {
		super(webElement);
	}
	
	public WebElement getTocByIndex(int nIndex) {
		String xpath = String.format("//div[@class='ap-toc-container ap-no-select']/div[@class='ap-toc-content-wrapper']/table[@class='ap-toc']/tr[%d]", nIndex);
		WebElement toc = _webElement.findElement(By.xpath(xpath));
		return toc;
	}
	
	public void onClickTocByIndex(int nIndex) {
		WebElement toc = getTocByIndex(nIndex);
		toc.click();
	}
}
