import config.BaseClass;
import magic.HillelUrls;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.FrontEndBasicPageFactoryInt_hw13;


public class TestFrontEndBasic extends BaseClass {
    private static FrontEndBasicPageFactoryInt_hw13 frontEndBasicPage;

    @BeforeClass
    public static void before_test() {
        driver.get(HillelUrls.FRONT_END_BASIC_URL);
        frontEndBasicPage = new FrontEndBasicPageFactoryInt_hw13(driver);
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

    @Test
    public void printCoachFullList() throws InterruptedException {
        System.out.println(frontEndBasicPage.getcoachFullList());
    }
  /*  @Test
    public void clB(){
        frontEndBasicPage.clickBut();
    }*/
}
