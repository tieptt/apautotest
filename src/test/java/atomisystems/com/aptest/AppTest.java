package atomisystems.com.aptest;

import static org.awaitility.Awaitility.*;
import static org.awaitility.Duration.*;
import static java.util.concurrent.TimeUnit.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import atomisystems.com.apobject.APCanvas;
import atomisystems.com.apobject.APContent;
import atomisystems.com.apobject.APPresentation;
import atomisystems.com.apobject.APRadioButton;
import atomisystems.com.apobject.APSidebar;
import atomisystems.com.webdriver.DriverManager;
import atomisystems.com.webdriver.DriverManagerFactory;
import atomisystems.com.webdriver.DriverType;
import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest {

    DriverManager driverManager;
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driverManager = DriverManagerFactory.getManager(DriverType.FIREFOX);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = driverManager.getDriver();
    }

    @AfterMethod
    public void afterMethod() {
        //driverManager.quitDriver();
    }

    @Test
    public void launchATest() {
        driver.get("http://localhost:23324/Untitled281532511849902/test.html");
        WebElement ePresenter = driver.findElement(By.id("MevankN9"));
        APPresentation apPresenter = new APPresentation(ePresenter);
        APContent apContent = apPresenter.getContentElement();
        //Assert.assertEquals(apContent, null);
        APCanvas apCanvas = apContent.getCanvas();
        APRadioButton radio = new APRadioButton(apCanvas.getElementByID("ap-ctrl-MevankN9-1-6"));
        boolean isCheck = radio.isChecked();
        Assert.assertEquals(isCheck, false);
    }

}
