package atomisystems.com.apobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class APToolbar extends APObject{
	protected WebElement _eRestart;
	protected WebElement _eFirst;
	protected WebElement _ePrev;
	protected WebElement _ePlay;
	protected WebElement _eNext;
	protected WebElement _eLast;
	protected WebElement _eSpeed;
	
	protected WebElement _eMute;
	protected WebElement _eCC;
	protected WebElement _eAbout;
	protected WebElement _eDisplayMode;
	protected WebElement _eToc;
	protected WebElement _eSidebar;
	
	public APToolbar() {
		super();
	}
	
	public APToolbar(WebElement webElement) {
		super(webElement);
		_eRestart 		= _webElement.findElement(By.xpath("//div[@class='ap-button ap-tool-restart']"));
		_eFirst 		= _webElement.findElement(By.xpath("//div[@class='ap-button ap-tool-first']"));
		_ePrev 			= _webElement.findElement(By.xpath("//div[@class='ap-button ap-tool-prev']"));
		_ePlay 			= _webElement.findElement(By.xpath("//div[@class='ap-button ap-tool-play']"));
		_eNext 			= _webElement.findElement(By.xpath("//div[@class='ap-button ap-tool-next']"));
		_eLast 			= _webElement.findElement(By.xpath("//div[@class='ap-button ap-tool-last']"));
		_eSpeed 		= _webElement.findElement(By.xpath("//div[@class='ap-button ap-tool-speed']"));
		_eMute 			= _webElement.findElement(By.xpath("//div[@class='ap-button ap-tool-sound']"));
		_eCC 			= _webElement.findElement(By.xpath("//div[@class='ap-button ap-tool-cc']"));
		_eAbout 		= _webElement.findElement(By.xpath("//div[@class='ap-button ap-tool-about']"));
		_eDisplayMode 	= _webElement.findElement(By.xpath("//div[@class='ap-button ap-tool-displaymode']"));
		_eToc 			= _webElement.findElement(By.xpath("//div[@class='ap-button ap-tool-toc']"));
		_eSidebar 		= _webElement.findElement(By.xpath("//div[@class='ap-button ap-tool-sidebar']"));
	}
	
	public void onRestart() {
		if(null != _eRestart) {
			_eRestart.click();
		}
	}
	
	public void onFirstSlide() {
		if(null != _eFirst) {
			_eFirst.click();
		}
	}
	
	public void onPrevSlide() {
		if(null != _ePrev) {
			_ePrev.click();
		}
	}
	
	public void onPlayOrPause() {
		if(null != _ePlay) {
			_ePlay.click();
		}
	}
	
	public void onNextSlide() {
		if(null != _eNext) {
			_eNext.click();
		}
	}
	
	public void onLastSlide() {
		if(null != _eLast) {
			_eLast.click();
		}
	}
	
	public void onSpeed() {
		if(null != _eSpeed) {
			_eSpeed.click();
		}
	}
	
	public void onMute() {
		if(null != _eMute) {
			_eMute.click();
		}
	}
	
	public void onShowHideCC() {
		if(null != _eCC) {
			_eCC.click();
		}
	}
	
	public void onAbout() {
		if(null != _eAbout) {
			_eAbout.click();
		}
	}
	
	public void onDisplayMode() {
		if(null != _eDisplayMode) {
			_eDisplayMode.click();
		}
	}
	
	public void onShowHideToc() {
		if(null != _eToc) {
			_eToc.click();
		}
	}
	
	public void onShowHideSidebar() {
		if(null != _eSidebar) {
			_eSidebar.click();
		}
	}
}
