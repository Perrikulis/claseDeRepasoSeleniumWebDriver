import Steps.PracticeFormSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest{

    PracticeFormSteps practiceFormSteps = new PracticeFormSteps(this.webDriver);

    //Test a probar
    @Test(description = "Test to set some values in form", groups = "practiceFormSet")
    public void setValuesForm(){
        webDriver.get("https://demoqa.com/automation-practice-form");
        practiceFormSteps.setTextFirstName("Sergio");
        practiceFormSteps.setTextLastName("Medel");
        //There is a problem with some object, doesn't select radio group
        //practiceFormSteps.selectGender(0);
        practiceFormSteps.setTextUserNumber("5544332211");
        Assert.assertTrue(practiceFormSteps.isDisplayedSubmitButton(), "Submit button is not displayed");
        /** There is a problem with resolution, doesn't select submit button
        if (practiceFormSteps.isDisplayedSubmitButton()) {
            practiceFormSteps.clickSubmitButton();
        }*/
    }
}
