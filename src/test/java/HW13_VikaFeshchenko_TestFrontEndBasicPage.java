import config.BaseClass;
import magic.HillelUrls;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.FrontEndBasicPageFactoryInt_hw13;
import pages.HW13_VF_FrontEndBasicPageFactory;

public class HW13_VikaFeshchenko_TestFrontEndBasicPage extends BaseClass {
    private static HW13_VF_FrontEndBasicPageFactory frontEndBasicPage;
    @BeforeClass
    public static void before_test() {
        driver.get(HillelUrls.FRONT_END_BASIC_URL);
        frontEndBasicPage = new HW13_VF_FrontEndBasicPageFactory(driver);
    }
    @Test
    public void printCourseTitle(){

        System.out.println(frontEndBasicPage.getCourseTitle());
    }

    @Test
    public void printCourseRate(){

        System.out.println(frontEndBasicPage.getCourseRate());
    }

    @Test
    public void printCourseDescription(){
        System.out.println(frontEndBasicPage.getCourseDescription());
    }

    @Test
    public void printCoachListIsDisplayed(){

        System.out.println(frontEndBasicPage.getCoachListIsDisplayed());
    }

}
