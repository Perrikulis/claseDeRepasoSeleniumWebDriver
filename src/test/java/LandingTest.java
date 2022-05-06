import Steps.ElementSteps;
import Steps.LandingsSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class LandingTest extends BaseTest{

    ElementSteps elementStep = new ElementSteps(webDriver);
    LandingsSteps landingStep = new LandingsSteps(webDriver);
    //ElementsStep elementsStep = new ElementsStep(webDriver);

    @Test
    public void testMenuOptionElment() {
        landingStep.clicOPtion(0);
        System.out.println(elementStep.getText());
        Assert.assertEquals(elementStep.getText(), "Text Box");
    }

    @Test
    public void testFormTextBox() {
        landingStep.clicOPtion(0);
        elementStep.clickTextBoxOpt();
    }
}

