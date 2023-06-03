import config.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestHillel extends BaseClass {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://kharkiv.ithillel.ua");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getPageSource());
        WebElement consultButton = driver.findElement(By.id("btn-consultation-hero"));
//        System.out.println(driver.findElement(By.id("btn-consultation-hero")).getText());
        System.out.println(consultButton.getText());
//        consultButton.click();
        System.out.println(driver.findElement(By.className("section-content_descriptor")).getText());
    }
}
