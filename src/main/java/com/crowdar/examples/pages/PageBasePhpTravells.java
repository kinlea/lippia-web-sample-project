package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseWeb;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PageBasePhpTravells extends PageBaseWeb {

    public PageBasePhpTravells(RemoteWebDriver driver) {
        super(driver);
        BASE_URL = "https://www.phptravels.net/";
    }


}
