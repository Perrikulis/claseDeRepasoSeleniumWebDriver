package Steps;

import Pages.AutomationPracticePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AutomationPracticeSteps extends BaseSteps{


    AutomationPracticePage automationPracticePage = PageFactory.initElements(webDriver, AutomationPracticePage.class);

    public AutomationPracticeSteps (WebDriver webDriver) {
        super (webDriver);
    }

   //Método
    public void setFirstName (String name){
        automationPracticePage.getInputFirstName().sendKeys(name);
        System.out.println("El nombre ingresado es: " + name);
        Reporter.log("El nombre ingresado es: " + name);
    }
}