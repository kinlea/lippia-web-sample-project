package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class PhpTravellsHomePage extends PageBasePhpTravells {

    public final String HOTEL_TAB_XPATH = "//a[contains(text(),'Hotels')]";
    public final String HOTEL_LIST_XPATH = "//div[contains(@class,'price')]";
    private int hotelIndex = 1;
    public final String INPUT_CHECKIN_XPATH = "//input[@id=\"checkin\"]";
    public final String INPUT_CHECKOUT_XPATH = "//input[@id=\"checkout\"]";
    public final String INPUT_DESTINATION_XPATH = "//div[@id=\"s2id_autogen16\"]";
    public final String INPUT_HOTEL_XPATH = "//div[contains(text(),'Grand Plaza')]";
    public final String BUTTON_ADD_CHILD_XPATH = "//*[@id=\"hotels\"]/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[2]/div/div[2]/div/span/button[1]";
    public final String BUTTON_SEARCH_XPATH = "//button[contains(text(),'Search')]";
    public final String DATE_CHECKIN_CSS = "#datepickers-container > div.datepicker.-bottom-left-.-from-bottom-.active > div > div > div.datepicker--cells.datepicker--cells-days > div:nth-child(18)";
    public final String DATE_CHECKOUT_CSS = "#datepickers-container > div.datepicker.-bottom-left-.-from-bottom-.active > div > div > div.datepicker--cells.datepicker--cells-days > div:nth-child(27)";

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
        clickElement(hotels.get(hotelIndex));
    }

    public void seleccionarHotel() {
        WebElement btn = getWebElement(By.xpath(INPUT_DESTINATION_XPATH));
        btn.click();
        WebElement btnHotel = getWebElement(By.xpath(INPUT_HOTEL_XPATH));
        btnHotel.click();

    }

    public void completarCheckIn() {
 /*     JavascriptExecutor jse = this.driver;
        jse.executeScript("document.body.style.zoom='50%'");
        jse.executeScript("arguments[0].scrollIntoView()", getWebElement(By.xpath("//h5[contains(text(), 'Refine Dates')]")));
*/      WebElement btnCheckin = getWebElement(By.xpath(INPUT_CHECKIN_XPATH));
        btnCheckin.click();
        WebElement btnDate = getWebElement(By.cssSelector(DATE_CHECKIN_CSS));
        btnDate.click();

    }

    public void completarCheckOut() {
        WebElement btn = getWebElement(By.xpath(INPUT_CHECKOUT_XPATH));
        btn.click();
        WebElement btnDate = getWebElement(By.cssSelector(DATE_CHECKOUT_CSS));
        btnDate.click();
    }
    public void addAChild() {
        WebElement btnAddChild = getWebElement(By.xpath(BUTTON_ADD_CHILD_XPATH));
        btnAddChild.click();
    }
    public void clickBtnSearch() {
        WebElement btnSearch = getWebElement(By.xpath(BUTTON_SEARCH_XPATH));
        btnSearch.click();

    }


}
