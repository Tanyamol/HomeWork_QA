package com.epamAT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindOnWikipedia {

    @FindBy(xpath="//*[@id=\"searchInput\"]")
    private WebElement navigate;

    public void setInput(String str){
        navigate.sendKeys(str);
    }
    public void clickEnter(){
        navigate.sendKeys(Keys.ENTER);
    }
}
