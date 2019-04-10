package com.epamAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeleniumHomePage {

    @FindBy (xpath="//*[@id=\"mw-content-text\"]/div/table[1]/tbody/tr[8]/td/span/a")
    private WebElement navigate;

    public SeleniumHomePage goToPage(){
        navigate.click();
        return this;
    }
}
