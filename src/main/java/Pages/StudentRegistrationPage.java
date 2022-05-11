package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StudentRegistrationPage extends BasePage{

    public StudentRegistrationPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.ID, id = "submit")
    private WebElement btnSubmit;

    @FindBy(how = How.ID, id = "firstName")
    private WebElement fieldFirstName;

    @FindBy(how = How.ID, id = "lastName")
    private WebElement fieldLastName;

    @FindBy(how = How.ID, id = "gender-radio-1")
    private WebElement radioGenderOption;

    @FindBy(how = How.ID, using = "userNumber")
    private WebElement fieldNumberPhone;

    private String modalContentCssLocator = ".modal-content";
  //  @FindBy(how = How.CLASS_NAME, className = "modal-content")
    // private WebElement modalContent;



    public WebElement getBtnSubmit() {
        return btnSubmit;
    }

    public WebElement getFieldFirstName() {
        return fieldFirstName;
    }

    public WebElement getFieldLastName() {
        return fieldLastName;
    }

    public WebElement getRadioGenderOption() {
        return radioGenderOption;
    }

    public WebElement getFieldNumberPhone() {
        return fieldNumberPhone;
    }

    public WebElement getModalContent(){ return webDriver.findElement(By.cssSelector(modalContentCssLocator)); }
}
