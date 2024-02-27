import org.testng.annotations.*;

public class MyFirstAutomationTest {

    @BeforeSuite
    public void testBeforeSuite(){ System.out.println("A test before the Suite");}


    @BeforeTest
    public void testBeforeTest(){System.out.println("A test before the test");}

    @BeforeClass
    public void testBeforeClass(){System.out.println("A test before the class");}

    @BeforeMethod
    public void testBeforeMethod(){System.out.println("A test before the Method");}

    @Test
    public void testName(){System.out.println("Testing uno");}

    @Test
    public void testSurname(){System.out.println("Testing dos");}

    @AfterMethod
    public void testAfterMethod(){System.out.println("A test after the method");}

    @AfterClass
    public void testAfterClass(){System.out.println("A test after the class.");}

    @AfterTest
    public void testAfterTest(){System.out.println("A test after the test.");}

    @AfterSuite

    public void testAfterSuite(){System.out.println("A test after the suite");}



}
