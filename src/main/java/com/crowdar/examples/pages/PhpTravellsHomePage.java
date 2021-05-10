package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class PhpTravellsHomePage extends PageBasePhpTravells {

    public final String HOTEL_TAB_XPATH = "//a[contains(text(),'Hotels')]";
    public final String HOTEL_LIST_XPATH = "//div[contains(@class,'price')]";

    public PhpTravellsHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void go() {
        navigateToCompleteURL();
    }

    public void clickOnHotelTab() {
        clickElement(By.xpath(HOTEL_TAB_XPATH));
    }

    public void clickFirstHotel(){
        List<WebElement> hotels = getWebElements(By.xpath(HOTEL_LIST_XPATH));
        hotels.get(0).click();
    }

}
