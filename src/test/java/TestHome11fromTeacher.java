import config.BaseClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import util.Util;

public class TestHome11fromTeacher extends BaseClass {
    By consultButton = By.id("btn-consultation-hero");
    By agreement = By.xpath("//*[@id=\"form-consultation\"]//footer//a[@target=\"_blank\"]");
    static String mainUrl = "https://kharkiv.ithillel.ua";
    @BeforeClass
    public static void bFirstTest(){
        driver.get(mainUrl);
    }

    @Before
    public void beforeM(){
        if(!driver.getCurrentUrl().equals(mainUrl)){
            driver.navigate().to(mainUrl);
        }
    }
    @Test
    public void test1() throws InterruptedException {
        driver.findElement(consultButton).click();
        String win = driver.getWindowHandle();

        driver.findElement(agreement).click();
        Thread.sleep(2000);
        driver.switchTo().window(win);
    }
    @Test
    public void test2(){
        driver.findElement(consultButton).click();
        Assert.assertTrue(driver.findElement(By.id("form-consultation")).isEnabled());
    }

    @Test
    public void test3(){
        driver.get("https://kharkiv.ithillel.ua/courses/front-end-basic");
        Util.scrollToElementVisibilityOf(driver,By.className("coaches"));
    }



}
