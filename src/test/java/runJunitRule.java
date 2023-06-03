import config.TestBase;
import org.junit.*;

public class runJunitRule extends TestBase {

    @BeforeClass
    public static void startM(){
        System.out.println("Before Class");
    }

    @Before
    public void bMethod(){
        System.out.println("Before Method");
    }

    @After
    public void afMethod(){
        System.out.println("After Method");
    }

    @Test
    public void hometest(){
        System.out.println("test1");

    }

    @Test
    public void hometest1(){
        System.out.println("test2");
    }

    @AfterClass

    public static void afterM(){
        System.out.println("After Class");
    }
}
