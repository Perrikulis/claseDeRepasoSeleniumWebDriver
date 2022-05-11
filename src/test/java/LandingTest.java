import Steps.ElementSteps;
import Steps.LandingsSteps;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class LandingTest extends BaseTest {

    ElementSteps elementStep = new ElementSteps(webDriver);
    LandingsSteps landingStep = new LandingsSteps(webDriver);
    //ElementsStep elementsStep = new ElementsStep(webDriver);

    @Test(description = "Test Box element is present and includes the Text as expected", groups = {"LandingTest", "SmokeTest"})
    public void testMenuOptionElment() {
        Reporter.log("This Log es una prueba**********---- *********");
        Reporter.log("This Log es una prueba**********---- *********");
        landingStep.clicOPtion(0);
        System.out.println(elementStep.getText());
        Assert.assertEquals(elementStep.getText(), "Text Box");
    }

    @Test(description = "Test to open the form of elements", groups = {"LandingTest"})
    public void testFormTextBox() {
        Reporter.log("This Log es una prueba**********---- *********");
        Reporter.log("This Log es una prueba**********---- *********");
        landingStep.clicOPtion(0);
        elementStep.clickTextBoxOpt();
    }
}

