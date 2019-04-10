package com.search.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Set;

public class SearchGoogle {

       @FindBy (xpath="//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")
       private WebElement search;

    public void typeInput(String string) {
        search.sendKeys(string);
    }

    public void clickEnter(){
        search.sendKeys(Keys.ENTER);
    }
}
