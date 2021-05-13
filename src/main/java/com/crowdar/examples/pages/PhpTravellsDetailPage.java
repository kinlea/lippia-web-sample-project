package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeSelected;

public class PhpTravellsDetailPage extends PageBasePhpTravells {

    public final String BUTTON_BOOK_XPATH = "//button[contains(@class,'book_button')]";
    public final String FIELD_FIRST_NAME_XPATH = "//input[@name=\"firstname\"]";
    public final String FIELD_LAST_NAME_XPATH = "//input[@name=\"lastname\"]";
    public final String FIELD_EMAIL_LIST_XPATH = "//input[@name=\"email\"]";
    public final String FIELD_CONFIRM_EMAIL_LIST_XPATH = "//input[@name=\"confirmemail\"]";
    public final String FIELD_CNUMBER_XPATH = "//input[@name=\"phone\"]";
    public final String FIELD_ADDRES_XPATH = "//input[@name=\"address\"]";
    public final String COMBO_COUNTRY_XPATH = "//span[contains(text(),'Select Country')]";
    public final String INPUT_COUNTRY_XPATH = "//input[@class=\"chosen-search-input\"]";
    public final String SLIDE_EXTRA_XPATH = "//*[@id=\"2\"]";
    public final String BUTTON_CONFIRM_XPATH = "//button[contains(text(),'CONFIRM')]";

    public PhpTravellsDetailPage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void completeForm(String fName, String lName, String email, String cNumber, String address, String country) {
                WebElement element1 = getWebElement(By.xpath(FIELD_FIRST_NAME_XPATH));
        element1.sendKeys(fName);
        WebElement element2 = getWebElement(By.xpath(FIELD_LAST_NAME_XPATH));
        element2.sendKeys(lName);
        WebElement element3 = getWebElement(By.xpath(FIELD_EMAIL_LIST_XPATH));
        element3.sendKeys(email);
        WebElement element6 = getWebElement(By.xpath(FIELD_CONFIRM_EMAIL_LIST_XPATH));
        element6.sendKeys(email);
        WebElement element4 = getWebElement(By.xpath(FIELD_CNUMBER_XPATH));
        element4.sendKeys(cNumber);
        WebElement element5 = getWebElement(By.xpath(FIELD_ADDRES_XPATH));
        element5.sendKeys(address);
        selectCountry(country);
    }

    public void completeEmail(String email) {
        List<WebElement> emails = getWebElements(By.xpath(FIELD_EMAIL_LIST_XPATH));
        completeField(emails.get(0), email);
        completeField(emails.get(1), email);
    }

    public void selectCountry(String country) {
        clickElement(By.xpath(COMBO_COUNTRY_XPATH));
        completeField(By.xpath(INPUT_COUNTRY_XPATH), country + "\n");
    }

    public void selectExra(){
        clickElement(By.xpath(SLIDE_EXTRA_XPATH));
    }
    public void clickConfirm(){
        clickElement(By.xpath(BUTTON_CONFIRM_XPATH));
    }
}
