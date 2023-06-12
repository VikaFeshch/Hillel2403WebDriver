package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Util;

import java.util.ArrayList;
import java.util.List;

public class FrontEndBasicPageFactoryInt_hw13 {
    @FindBy(xpath = "//span[contains(@class,\"course-descriptor_header-text\")]")
    WebElement nameCourseText;

    @FindBy(xpath = "//span[@class=\"course-rating_average\"]")
    WebElement courseRatingAver;

    @FindBy(xpath = "//div[contains(@class,\"introduction-info_content\")]/p[1]")
    WebElement courseDescription1;
    @FindBy(xpath = "//div[contains(@class,\"introduction-info_content\")]/p[2]")
    WebElement courseDescription2;

    @FindBy(id = "coachesSection")
    WebElement coachSection;

    @FindBy(xpath = "//li[@class=\"coach-list_item\" and not(contains(@style,\"display: none;\"))]")
    List<WebElement> coachListIsDisplayed;

    @FindBy(xpath = "//li[@class=\"coach-list_item\"]")
    List<WebElement> coachFullList;

    @FindBy(id = "coachesShowAllButton")
    WebElement butCoachesShowAllButton;

    @FindBy(xpath = "//button[@class=\"btn -small -light cookie-ntf_agreement\"]")
    WebElement butAgreement;

/*    @FindBy(id="btn-consultation-hero")
    WebElement butConsult;

    public void clickBut(){
        butConsult.click();
    }*/


    private WebDriver driver;

    public FrontEndBasicPageFactoryInt_hw13(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getCourseTitle(){

        return nameCourseText.getText();
    }

    public String getCourseRate(){

        return courseRatingAver.getText();
    }

    public String getCourseDescription(){
        Util.scrollToElementVisibilityOf(driver, By.xpath("//div[contains(@class,\"introduction-info-redactor_section\")]"));
        String str = courseDescription1.getText()+" "+courseDescription2.getText();
        return str;
    }

    public List<String> getCoachListIsDisplayed(){
        Util.scrollToElementVisibilityOf(driver,By.id("coachesShowAllButton"));
        List<String> strCoachListIsDisplayed = new ArrayList<>();
        for (WebElement sectionElement : coachSection.findElements(By.xpath("//li[@class=\"coach-list_item\" and not(contains(@style,\"display: none;\"))]"))) {
            strCoachListIsDisplayed.add(sectionElement.findElement(By.tagName("p")).getText());
        }
        return strCoachListIsDisplayed;
    }

    public List<String> getcoachFullList() throws InterruptedException {
        Util.scrollToElementVisibilityOf(driver,By.id("coachesShowAllButton"));
        butAgreement.click();
        Thread.sleep(5000);
        System.out.println(butCoachesShowAllButton.isEnabled());
        System.out.println(butCoachesShowAllButton.isDisplayed());
        System.out.println(butCoachesShowAllButton.getLocation());
        butCoachesShowAllButton.click();
        List<String> strCoachFullList = new ArrayList<>();
        for (WebElement sectionElement : coachSection.findElements(By.xpath("//li[contains(@class, \"coach-list_item\")]"))) {
            strCoachFullList.add(sectionElement.findElement(By.tagName("p")).getText());
        }
        return strCoachFullList;
    }


}

