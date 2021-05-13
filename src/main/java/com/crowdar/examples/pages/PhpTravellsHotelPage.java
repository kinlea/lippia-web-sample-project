package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

public class PhpTravellsHotelPage extends PageBasePhpTravells {

    public final String CHECK_ROOM_XPATH = "//label[contains(@class, 'custom-control')]";
    public final String BUTTON_BOOK_XPATH = "//button[contains(@class,'book_button')]";


    public PhpTravellsHotelPage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void clickFirstCheck() {
        List<WebElement> rooms = getWebElements(By.xpath(CHECK_ROOM_XPATH));
        JavascriptExecutor jse = this.driver;
        jse.executeScript("arguments[0].scrollIntoView()", getWebElement(By.xpath("//span[contains(text(), 'Hotel Amenities')]")));
        clickElementWithoutScroll(rooms.get(0));
        jse.executeScript("arguments[0].scrollIntoView()", rooms.get(0));

    }

    public void clickOnButton() {
        WebElement btn = getWebElement(By.xpath(BUTTON_BOOK_XPATH));
        btn.click();
    }


}
