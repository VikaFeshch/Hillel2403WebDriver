package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class MainPageFactory {
    @FindBy(xpath = "//button[contains(@class,\"btn-consultation\")and contains(@class,\"ontacts-item_btn\"")
    WebElement consultButton;
    @FindBy(id = "form-consultation")
    WebElement formConsult;
    @FindBy(xpath = "//li[@class=\"socials-list_item\"]")
    List<WebElement> socialList;

 /*   private  WebElement driver;

    public MainPageFactory(WebElement driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }*/

    public boolean isEnabledFormConsultation() {
        return formConsult.isEnabled();
    }

    public List<String> getSocialLink(){
        List<String> stringList=new ArrayList<>();
        for (WebElement element:socialList){
            stringList.add(element.findElement(By.tagName("a")).getAttribute("href"));
        }
        return stringList;
    }

}
