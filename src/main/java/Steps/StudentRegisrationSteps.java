package Steps;

import Pages.StudentRegistrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class StudentRegisrationSteps extends BaseSteps{

    StudentRegistrationPage SRpage = PageFactory.initElements(webDriver, StudentRegistrationPage.class);

    public StudentRegisrationSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public void fillFirstName(String firstName){
        SRpage.getFieldFirstName().sendKeys(firstName);
    }

    public void fillLastName(String lastName){
        SRpage.getFieldLastName().sendKeys(lastName);
    }

    public void selectGender(){
        SRpage.getRadioGenderOption().click();
    }

    public void fillPhoneNumber(String phone){
        SRpage.getFieldNumberPhone().sendKeys(phone);
    }

    public WebElement getButtonSubmit(){
        return SRpage.getBtnSubmit();
    }

    public WebElement getModalContent(){
        return SRpage.getModalContent();
    }

}
