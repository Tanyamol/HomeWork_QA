package com.epamAT;
import com.search.Pages.SearchGoogle;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class VerifyPages {
    private SearchGoogle page1;
    private ChooseLink page2;
    private FindOnWikipedia page3;
    private SeleniumHomePage page4;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium ChromeDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        page1 = PageFactory.initElements(driver, SearchGoogle.class);
        page2 = PageFactory.initElements(driver,ChooseLink.class);
        page3 = PageFactory.initElements(driver,FindOnWikipedia.class);
        page4 = PageFactory.initElements(driver,SeleniumHomePage.class);
    }

    @Test
    public void verifyGooglePage(){
        page1.typeInput("Wikipedia");
        page1.clickEnter();
        page2.clickLink();
        page3.setInput("Selenium");
        page3.clickEnter();
        page4.goToPage();
    }
}
