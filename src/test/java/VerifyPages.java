import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class VerifyPages {

    private SearchGoogle googleSearchPage;
    private ChooseLink chooseLinkPage;
    private FindOnWikipedia searchOnWikipediaPage;
    private SeleniumHomePage SeleniumPage;
    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium ChromeDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        googleSearchPage = PageFactory.initElements(driver, SearchGoogle.class);
        chooseLinkPage = PageFactory.initElements(driver,ChooseLink.class);
        searchOnWikipediaPage = PageFactory.initElements(driver,FindOnWikipedia.class);
        SeleniumPage = PageFactory.initElements(driver,SeleniumHomePage.class);
    }

    @Test
    public void verifyGooglePage(){
        googleSearchPage.typeInput("Wikipedia");
        googleSearchPage.clickEnter();
        chooseLinkPage.clickLink();
        searchOnWikipediaPage.setInput("Selenium");
        searchOnWikipediaPage.clickEnter();
        SeleniumPage.goToPage();
    }

    @After
    public void closePage() {
        driver.quit();
    }

}
