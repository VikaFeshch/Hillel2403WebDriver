import config.BaseClass;
import magic.HillelUrls;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.MainPageFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestContactsPage extends BaseClass {
    static List<String> list=new ArrayList<>();
    static {
        list.add("https://www.linkedin.com/school/ithillel/");
        list.add("https://t.me/ithillel");
        list.add("https://www.facebook.com/Hillel.IT.School");
        list.add("https://www.youtube.com/user/HillelITSchool?sub_confirmation=1");
        list.add("https://www.instagram.com/hillel_itschool/");
        list.add("https://www.behance.net/hillel_it_school");
        list.add("https://www.tiktok.com/@hillel_it_school");
        list.add("https://twitter.com/Hillel_ITschool");
    }
    private static MainPageFactory contactsPage;

    @BeforeClass
    public static void before_test() {
        driver.get(HillelUrls.CONTACTS_URL);
        contactsPage = PageFactory.initElements(driver, MainPageFactory.class);
      //  contactsPage=new MainPageFactory(driver); if driver is init in the MainPageFactory
    }

    @Test
    public void formIsEnabled() {
        assertTrue(contactsPage.isEnabledFormConsultation());
    }
 /*   @Test
    public void test2IntermediateResult(){
        for (String socialLink : contactsPage.getSocialLink()) {
            System.out.println("List.add(\""+socialLink+"\")");
        }
    }*/
    @Test
    public void testLinksArrayEquals(){
        assertArrayEquals(list.toArray(),contactsPage.getSocialLink().toArray());
    }

}
