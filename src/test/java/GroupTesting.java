import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GroupTesting {

    @BeforeSuite
    public void beforeTest(){System.out.println("Let me check before you proceed.");}

    @Test(groups = "first")
    public void firstTest(){System.out.println("We are coming first. 1");}

    @Test(groups = "first")
    public void firstTest1(){System.out.println("We are coming first. 2");}

    @Test(groups = "first")
    public void firstTest2(){System.out.println("We are coming first. 3");}

    @Test(groups = "second", priority = 3)
    public void secondTest1(){System.out.println("We are coming second. 1");}

    @Test(groups = "second", priority = 3)
    public void secondTest2(){System.out.println("We are coming second. 2");}

    @Test(groups = "second", priority = 3)
    public void secondTest3(){System.out.println("We are coming second. 3");}

}
