package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class ConfigurationWebDriver {
    public static void main(String[] args) throws InterruptedException {
 /*       URL mainUrl=null;
        try {
            mainUrl=new URL("https://kharkiv.ithillel.ua");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }*/
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        WebDriver driver=new ChromeDriver();
   //     driver.manage().window().maximize();
        driver.get("https://kharkiv.ithillel.ua");
  //      driver.navigate().to(mainUrl);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
    }

}
