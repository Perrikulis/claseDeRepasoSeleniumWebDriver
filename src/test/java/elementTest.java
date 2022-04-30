import Steps.elementSteps;
import Steps.landingsSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

public class elementTest extends baseTest{
    elementSteps elementSteps = new elementSteps(webDriver);
    landingsSteps landingsSteps =new landingsSteps(webDriver);

    @Test
    public void testFormElements() {
        landingsSteps.clickOption(0);
        elementSteps.clickOptionTextBox(0);
        System.out.println(elementSteps.getTextFullName());
        Assert.assertEquals(elementSteps.getTextFullName(), "Full Name");
    }
}
