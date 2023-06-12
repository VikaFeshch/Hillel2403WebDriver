package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Util;

import java.util.ArrayList;
import java.util.List;

public class HW13_VF_FrontEndBasicPageFactory {
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


    private WebDriver driver;

    public HW13_VF_FrontEndBasicPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getCourseTitle() {

        return nameCourseText.getText();
    }

    public String getCourseRate() {

        return courseRatingAver.getText();
    }

    public String getCourseDescription() {
        Util.scrollToElementVisibilityOf(driver, By.xpath("//div[contains(@class,\"introduction-info-redactor_section\")]"));
        String str = courseDescription1.getText() + " " + courseDescription2.getText();
        return str;
    }

    public List<String> getCoachListIsDisplayed() {
        Util.scrollToElementVisibilityOf(driver, By.id("coachesShowAllButton"));
        List<String> strCoachListIsDisplayed = new ArrayList<>();
        for (WebElement sectionElement : coachSection.findElements(By.xpath("//li[@class=\"coach-list_item\" and not(contains(@style,\"display: none;\"))]"))) {
            strCoachListIsDisplayed.add(sectionElement.findElement(By.tagName("p")).getText());
        }
        return strCoachListIsDisplayed;
    }


}
