package com.crowdar.examples.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class PhpTravellsPaymentPage extends PageBasePhpTravells {

    public final String PAY_ON_ARRIVAL_BUTTON_XPATH = "//button[contains(text(),'Pay on Arrival')]";
    public final String H4_TITLE_XPATH = "//h4[contains(text(),\"Your booking status is Reserved\")]";


    public PhpTravellsPaymentPage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void clickPayOnArrival() {
        clickElement(By.xpath(PAY_ON_ARRIVAL_BUTTON_XPATH));
        Alert alert = getFluentWait().until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }

    public void verifyCompleteFlow() {
        Assert.assertTrue(getElementText(By.xpath(H4_TITLE_XPATH)).contains("Your booking status is Reserved"), "Error, no se completó el flujo");

    }

}
