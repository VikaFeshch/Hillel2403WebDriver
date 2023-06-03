import config.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestWiki extends BaseClass {
    static By wikiLink = new By.ById("Welcome_to_Wikipedia"),
    listTabs = new By.ByXPath("//li[contains(@class, \"vector-tab-noicon\") and contains(@class, \"mw-list-item\")] ");
    static String url = "https://en.wikipedia.org/wiki/Main_Page";

    public static void main(String[] args) throws InterruptedException {

        driver.get(url);

        WebElement webElement = driver.findElement(wikiLink);
        System.out.println("link " + webElement.findElement(By.tagName("a")).getAttribute("href"));
        System.out.println("title " + webElement.findElement(By.tagName("a")).getAttribute("title"));
        System.out.println("text " + webElement.findElement(By.tagName("a")).getText());
        List<WebElement> webElementList=driver.findElements(listTabs);
        for (WebElement element : webElementList) {
            System.out.print(element.getText()+" ");
            System.out.println(element.findElement(By.tagName("a")).getAttribute("href"));

        }



        Thread.sleep(3000);
        driver.quit();
    }

}
