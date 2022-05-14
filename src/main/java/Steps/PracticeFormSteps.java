package Steps;

import Pages.PracticeFormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class PracticeFormSteps extends BaseSteps{
    PracticeFormPage practiceFormPage = PageFactory.initElements(webDriver, PracticeFormPage.class);

    //Constructor
    public PracticeFormSteps(WebDriver webDriver) {
        super(webDriver);
    }

    //Métodos
    public void setTextFirstName(String firstName){
        practiceFormPage.getInputFirstName().sendKeys(firstName);
        System.out.println("Se ingreso: " + firstName);
        Reporter.log("Se ingreso: " + firstName + "<br>");
    }

    public void setTextLastName(String lastName){
        practiceFormPage.getInputLastName().sendKeys(lastName);
        System.out.println("Se ingreso: " + lastName);
        Reporter.log("Se ingreso: " + lastName + "<br>");
    }

    public void selectGender(int index){
        practiceFormPage.getRadioOption().get(index).click();
        System.out.println("Se seleccionó: " + practiceFormPage.getRadioOption().get(index).getAttribute("value"));
        Reporter.log("Se seleccionó: " + practiceFormPage.getRadioOption().get(index).getAttribute("value") + "<br>");
    }

    public void setTextUserNumber(String mobileNumber){
        practiceFormPage.getInputUserNumber().sendKeys(mobileNumber);
        System.out.println("Se ingreso: " + mobileNumber);
        Reporter.log("Se ingreso: " + mobileNumber + "<br>");
    }

    public Boolean isDisplayedSubmitButton(){
        Reporter.log( "Is Submit button displayed? " + practiceFormPage.getButtonSubmit().isDisplayed() + "<br>");
        return practiceFormPage.getButtonSubmit().isDisplayed();
    }

    public void clickSubmitButton(){
        practiceFormPage.getButtonSubmit().click();
    }
}
