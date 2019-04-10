package com.epamAT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChooseLink {

    @FindBy(xpath="//*[@id=\"rso\"]/div/div/div[2]/div/div/div[1]/a[1]/h3")
    private WebElement navigate;

    public void clickLink(){
        navigate.click();
    }
}
