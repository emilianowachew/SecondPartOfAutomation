import org.testng.annotations.Test;

public class PriorityTest {
    @Test(priority = -4)
    public void firstTestPriority(){System.out.println("I come first.");}

    @Test(priority = 0)
    public void secondTestPriority(){System.out.println("I come second.");}

    @Test(priority = 3)

    public void thirdTestPriority(){System.out.println("I come third.");}
}
