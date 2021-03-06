import Steps.ElementSteps;
import Steps.LandingsSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class LandingTest extends BaseTest{
    ElementSteps elementSteps =new ElementSteps(webDriver);
    LandingsSteps landingsSteps =new LandingsSteps(webDriver);

    @Test (description = "Test MenuOption", groups = "FormElementsTest")
    public void testMenuOptionElement() {
        landingsSteps.clickOption(0);
        System.out.println(elementSteps.getText());
        Assert.assertEquals(elementSteps.getText(), "Text Box");
    }
    @Test (description = "Test Elements in Form", groups = "FormElementsTest")
    public void testFormElements() {
        landingsSteps.clickOption(0);
        elementSteps.clickOptionTextBox(0);
        System.out.println(elementSteps.getTextFullName());
        Assert.assertEquals(elementSteps.getTextFullName(), "Full Name");
        System.out.println(elementSteps.getTextEmail());
        Assert.assertEquals(elementSteps.getTextEmail(),"Email");
        System.out.println(elementSteps.getTextCurrentAddress());
        Assert.assertEquals(elementSteps.getTextCurrentAddress(),"Current Address");
        System.out.println(elementSteps.getTextPermanentAddress());
        Assert.assertEquals(elementSteps.getTextPermanentAddress(),"Permanent Address");
        System.out.println(elementSteps.getTextSubmit());
        Assert.assertEquals(elementSteps.getTextSubmit(),"Submit");
    }

    @Test (description = "Test Elements are displayed in Form", groups = "FormElementsTest")
    public void testFiveElementsAreDisplayed(){
        landingsSteps.clickOption(0);
        elementSteps.clickOptionTextBox(0);
        System.out.println("----------a click in Text Box option--------------");

        System.out.println("----------USER NAME--------------");
        Assert.assertTrue(landingsSteps.userNameTextBoxIsDisplayed(), "not ok");

        System.out.println("----------USER MAIL--------------");
        Assert.assertTrue(landingsSteps.userMailTextBoxIsDisplayed(), "not ok");

        System.out.println("----------CURRENT ADDRESS--------------");
        Assert.assertTrue(landingsSteps.currentAddressTextBoxIsDisplayed(), "not ok");

        System.out.println("----------PERMANENT ADDRESS--------------");
        Assert.assertTrue(landingsSteps.permanentAddressTextBoxisDisplayed(), "not ok");

        System.out.println("----------BUTTON--------------");
        Assert.assertTrue(landingsSteps.buttonIsDisplayed(), "not ok");

    }
}
