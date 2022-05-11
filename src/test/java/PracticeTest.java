import Steps.ESPNStep;
import Steps.PracticeSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeTest extends BaseTest{

    Steps.PracticeSteps practiceSteps = new PracticeSteps(this.webDriver);

    @Test(description = "Test para verificar que el Text Box Field First Name is present")
    public void testTextBoxFieldFirstNameisPresent(){
        webDriver.get("https://demoqa.com/automation-practice-form");
        System.out.println(practiceSteps.getTextFirstNameElement());
        Assert.assertTrue(practiceSteps.getTextFirstNameElement(),"El campo Full Name is not present");
    }

}
