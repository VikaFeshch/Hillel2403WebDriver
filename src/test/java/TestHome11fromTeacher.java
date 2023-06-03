import config.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestHome11fromTeacher extends BaseClass {
    By consultButton = By.id("btn-consultation-hero");
    By agreement = By.xpath("//*[@id=\"form-consultation\"]//footer//a[@target=\"_blank\"]");

    @BeforeClass
    public static void bFirstTest(){
        driver.get(("https://kharkiv.ithillel.ua"));
    }
    @Test
    public void test1() throws InterruptedException {
        driver.findElement(consultButton).click();
        String win = driver.getWindowHandle();

        driver.findElement(agreement).click();
        Thread.sleep(2000);
        driver.switchTo().window(win);

    }
}
