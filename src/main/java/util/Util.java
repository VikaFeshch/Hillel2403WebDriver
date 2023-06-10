package util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Util {
    // the method is to scroll to the element
    public static void scrollToElementVisibilityOf(WebDriver driver, By by){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        boolean bool = false;
        // цикл перевіряє чи присутній елемент, якщо ні, скролить ще раз
        while (!bool) {
            try {
                driver.findElement(by);
                bool = true;
                js.executeScript("window.scrollBy(0,500)");
            }catch (Exception ignore){
                js.executeScript("window.scrollBy(0,500)");
  /*              try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }*/

            }
        }
    }


}
