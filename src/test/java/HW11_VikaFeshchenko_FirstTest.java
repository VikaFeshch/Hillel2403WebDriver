import config.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HW11_VikaFeshchenko_FirstTest extends BaseClass {
    static String url = "https://kharkiv.ithillel.ua";
    @Test
    public void hw() {
        driver.get(url);
        driver.findElement(By.id("btn-consultation-hero")).click();
        driver.findElement(By.id("input-name-consultation")).sendKeys("Віка");
        driver.findElement(By.id("input-email-consultation")).sendKeys("vikafeshch@gmail.com");
        driver.findElement(By.id("input-tel-consultation")).sendKeys("630478391");
        driver.findElement(By.xpath("//button[@data-name=\"tg\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"tg\"]")).sendKeys("https://t.me/feshviki");
        driver.findElement(By.id("listbox-btn-input-course-consultation")).click();
        driver.findElement(By.xpath("//li[@data-value=\"13177\"]")).click();
        driver.findElement(By.xpath("//*[@class=\"checkbox_checkmark\"]")).click();

    }
}
