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

import atomisystems.com.apobject.APContent;
import atomisystems.com.apobject.APPresentation;
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
        driver.get("http://localhost:19481/Untitled291532510672719/test.html");
        WebElement ePresenter = driver.findElement(By.id("X5iGjLuX"));
        APPresentation apPresenter = new APPresentation(ePresenter);
        APContent apContent = apPresenter.getContentElement();
        //Assert.assertEquals(apContent, null);
        APSidebar apSidebar = apContent.getSidebar();
        apSidebar.onClickTocByIndex(2);
        await("Wait for alert").atMost(2, SECONDS)
        .ignoreExceptions();
        apSidebar.onClickTocByIndex(3);
        await("Wait for alert").atMost(1, SECONDS)
        .ignoreExceptions();
        apSidebar.onClickTocByIndex(1);
    }

}
