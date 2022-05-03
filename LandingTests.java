import Steps.ElementsSteps;
import Steps.HomeSteps;
import Steps.LandingSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingTests extends BaseTests{

    HomeSteps homeStep = new HomeSteps(_webDriver);
    ElementsSteps elementsSteps = new ElementsSteps(_webDriver);
    LandingSteps textBoxSteps = new LandingSteps(_webDriver);

    @Test
    public void testFiveElementsAreDisplayed(){
        homeStep.clickOption(0);
        elementsSteps.ClickOptionSubMenuTextBox(0);
        System.out.println("----------a click in Text Box option--------------");

        System.out.println("----------USER NAME--------------");
        Assert.assertTrue(textBoxSteps.userNameTextBoxIsDisplayed(), "not ok");

        System.out.println("----------USER MAIL--------------");
        Assert.assertTrue(textBoxSteps.userMailTextBoxIsDisplayed(), "not ok");

        System.out.println("----------CURRENT ADDRESS--------------");
        Assert.assertTrue(textBoxSteps.currentAddressTextBoxIsDisplayed(), "not ok");

        System.out.println("----------PERMANENT ADDRESS--------------");
        Assert.assertTrue(textBoxSteps.permanentAddressTextBoxisDisplayed(), "not ok");

        System.out.println("----------BUTTON--------------");
        Assert.assertTrue(textBoxSteps.buttonIsDisplayed(), "not ok");

        }





}
