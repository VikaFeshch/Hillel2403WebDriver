import config.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.Util;

import java.util.List;

public class HW12_VikaFeshchenko extends BaseClass {
    static String url = "https://kharkiv.ithillel.ua";

    @Test
    public void hw12(){
        driver.get(url);
        driver.findElement(By.xpath("//button[@data-dropdown-trigger=\"coursesMenu\"]")).click();driver.findElement(By.xpath("//button[@data-category=\"programming\"]")).click();
        driver.findElement(By.xpath("//button[@data-value=\"front-end\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"block-202987\"]/div/ul/li[1]/a")).click();
        Util.scrollToElementVisibilityOf(driver,By.className("coaches"));
        WebElement element=driver.findElement(By.id("coachesSection"));
        for (WebElement el: element.findElements(By.xpath("//li[@class=\"coach-list_item\" and not(contains(@style,\"display: none;\"))]"))){
            System.out.println(el.findElement(By.tagName("p")).getText());
        }


    }

}
