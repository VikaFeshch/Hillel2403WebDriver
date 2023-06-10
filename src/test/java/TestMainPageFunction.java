import config.BaseClass;
import magic.HillelUrls;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.MainPageObject;




public class TestMainPageFunction extends BaseClass {
    private static MainPageObject mainPage;
    private static String mainUrl = "https://kharkiv.ithillel.ua";


    @BeforeClass
    public static void before_test() {
        driver.get(mainUrl);
        mainPage = new MainPageObject(driver);
    }

    @After
    public void afTest() {
        if (!driver.getCurrentUrl().equals(mainUrl)) {
            driver.navigate().to(mainUrl);
        }
    }

    @Test
    public void formIsEnabled() {
        mainPage.getConsultButton().click();
        assertTrue(mainPage.isEnabledFormConsultation());
    }

    @Test
    public void clickContactsButton() {
        mainPage.getContactsButton().click();
        assertEquals(HillelUrls.CONTACT_URL,driver.getCurrentUrl());
    }
}
