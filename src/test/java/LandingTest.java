import Steps.ElementSteps;
import Steps.LandingsSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingTest extends baseTest {

    LandingsSteps landingSteps = new LandingsSteps(webDriver);
    ElementSteps elementsSteps = new ElementSteps(webDriver);

    @Test
    public void testMenuOptionElement() {
        //Requirement 1. When clicking option Elements, new page must be open. Text Box option menu must be displayed on left menu.

        landingSteps.clickOption(0);
        String elementText = elementsSteps.getElementText();
        System.out.println("Element text: " + elementText);
        Assert.assertEquals(elementText, "Text Box");
    }
}
