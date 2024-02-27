import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
    @Test
    public void assertionTest() {
        Assert.assertFalse(3 > 4);
        Assert.assertEquals("Emilian", "Emilian");
        Assert.assertEquals("Emo", "Emo");
    }


        @Test
                public void assertionSoft(){
            SoftAssert softAssert = new SoftAssert();

            softAssert.assertTrue(5 == 5);
            softAssert.assertFalse(5 < 4);
            softAssert.assertEquals("Emo", "Emo");

            softAssert.assertAll();

        }

}
