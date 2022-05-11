import Pages.StudentRegistrationPage;
import Steps.StudentRegisrationSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StudentRegisrationTest extends BaseTest{

    StudentRegistrationPage stPage = new StudentRegistrationPage(webDriver);
    StudentRegisrationSteps stStep = new StudentRegisrationSteps(webDriver);

    @Test(description = "Fill mandatory fields and submit in https://demoqa.com/automation-practice-form", groups = {"StudenRegistration"})
    public void testFillFormAndSubmit() {

        Assert.assertFalse(stStep.getModalContent().isDisplayed());

        stStep.fillFirstName("QAMinds");
        stStep.fillLastName("Selenium");
        stStep.fillPhoneNumber("9511962437");
        stStep.selectGender();
        stStep.getButtonSubmit().click();

        Assert.assertTrue(stStep.getModalContent().isDisplayed());


    }
}
