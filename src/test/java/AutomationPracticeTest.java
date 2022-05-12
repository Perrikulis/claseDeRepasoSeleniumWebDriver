import Steps.AutomationPracticeSteps;
import org.testng.annotations.Test;

public class AutomationPracticeTest  extends BaseTest{

    AutomationPracticeSteps automationPracticeSteps = new AutomationPracticeSteps(this.webDriver);


    @Test(description = "Test to set some values in form", groups = "automationPractice")
    public void setValuesForm(){
        webDriver.get("https://demoqa.com/automation-practice-form");
        System.out.println(" =============    =============");
        automationPracticeSteps.setFirstName ("Cynthia");
    }
}
