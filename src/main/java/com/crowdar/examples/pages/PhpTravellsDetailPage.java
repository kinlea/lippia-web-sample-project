package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

public class PhpTravellsDetailPage extends PageBasePhpTravells {

public final String CHECK_ROOM_XPATH = "//label[contains(@class,'custom-control')]";
public final String BUTTON_BOOK_XPATH = "//button[contains(@class,'book_button')]";

    public PhpTravellsDetailPage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }
public void completForm(){


}


}
