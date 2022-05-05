import org.testng.Assert;
import org.testng.annotations.Test;
import Steps.ElementSteps;

public class ElementTest extends BaseTest {

    ElementSteps elementSteps = new ElementSteps(webDriver);
    LandingsSteps landingsSteps =new LandingsSteps(webDriver);

    @Test
    public void testTextBoxForm() {
        //Requirement 2. When clicking Text Box option on left menu, form with fields: Full Name, Email, Current Address,
        //               Permanent Address and Submit Button must be displayed.

        webDriver.get("https://demoqa.com/elements");
        elementsSteps.clickTextBoxOption();
        Assert.assertTrue(elementsSteps.fullNameInputIsDisplayed(), "Full name input is not displayed.");
        Assert.assertTrue(elementsSteps.emailInputIsDisplayed(), "Email input is not displayed.");
        Assert.assertTrue(elementsSteps.currentAddressTextAreaIsDisplayed(), "Current text area is not displayed.");
        Assert.assertTrue(elementsSteps.permanentAddressTextAreaIsDisplayed(), "Permanent text area is not displayed.");
        Assert.assertTrue(elementsSteps.submitButtonIsDisplayed(), "Submit button is not displayed.");
    }

    @Test
    public void testWrongEmail() {
        //Requirement 3. When invalid email is input in Text Button form and clicking submit button, form must be submitted.

        webDriver.get("https://demoqa.com/elements");
        elementsSteps.clickTextBoxOption();
        elementsSteps.fillFullNameInput("Oscar Martinez");
        elementsSteps.fillEmailInput("email.com");
        elementsSteps.fillCurrentAddressTextArea("Palo Alto 33 Las Flores");
        elementsSteps.fillPermanentAddressTextArea("Palo Alto 33 Las Flores");
        elementsSteps.clickSubmitButton();
        Assert.assertFalse(elementsSteps.emailResultIsDisplayed(), "Email is displayed. Wrong email input.");
    }

    @Test
    public void testCorrectEmail() {
        //Requirement 4. When valid email is input in Text Button form and clicking submit button will display information form.

        webDriver.get("https://demoqa.com/elements");
        elementsSteps.clickTextBoxOption();
        elementsSteps.fillFullNameInput("Oscar Martinez");
        elementsSteps.fillEmailInput("email@example.com");
        elementsSteps.fillCurrentAddressTextArea("Palo Alto 33 Las Flores");
        elementsSteps.fillPermanentAddressTextArea("Palo Alto 33 Las Flores");
        elementsSteps.clickSubmitButton();
        Assert.assertTrue(elementsSteps.emailResultIsDisplayed(), "Email is not displayed. Wrong email input.");
    }
  
    @Test
    public void colorDropDownTest() {
        webDriver.get("https://demoqa.com/select-menu");
        elementsSteps.selectFavoriteColorByVisibleText("Blue");
        System.out.println("Selected color is: " + elementsSteps.getSelectedColor());
        //Select by index 3
        elementsSteps.selectFavoriteColorByIndex(3);
        System.out.println("Selected color is: " + elementsSteps.getSelectedColor());
        //Select by value 9
        elementsSteps.selectFavoriteColorByValue("9");
        System.out.println("Selected color is: " + elementsSteps.getSelectedColor());
        //Print if select object is multiple
        System.out.println("Is Select multiple? " + elementsSteps.isColorSelectMultiple());
    }

    @Test
    public void carDropDownTest() {
        webDriver.get("https://demoqa.com/select-menu");
        elementsSteps.selectFavoriteCarByVisibleText("Opel");
        System.out.println("Selected car is: " + elementsSteps.getSelectedCar());
        //Select by index 3
        elementsSteps.selectFavoriteCarByIndex(2);
        System.out.println("Selected car is: " + elementsSteps.getSelectedCar());
        //Select by value 9
        elementsSteps.selectFavoriteCarByValue("volvo");
        System.out.println("Selected car is: " + elementsSteps.getSelectedCar());
        //Print if select object is multiple
        System.out.println("Is Select multiple? " + elementsSteps.isCarSelectMultiple());
    }
}
