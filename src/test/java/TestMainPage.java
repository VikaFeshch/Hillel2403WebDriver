import config.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.MainPageObject;

public class TestMainPage extends BaseClass {
    private static MainPageObject mainPage;
    @BeforeClass
    public static void before_test(){
        driver.get("https://kharkiv.ithillel.ua");
        mainPage=new MainPageObject(driver);
    }

    @Test
    public void nameButton(){

        System.out.println(mainPage.getConsultButton().getText());
    }
}
