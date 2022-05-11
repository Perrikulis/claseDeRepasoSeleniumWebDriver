package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class PracticeFormPage extends BasePage{

    public PracticeFormPage (WebDriver webDriver) {
        super(webDriver);
    }

    //Definición Xpath & CSS Locators usando PageFactory
    @FindBy(how = How.XPATH, using = "//input[@id=\"firstName\"]")
    private WebElement inputFirstName;

    @FindBy(how = How.XPATH, using = "//input[@id=\"lastName\"]")
    private WebElement inputLastName;

    @FindBy(how = How.XPATH, using = "//input[@id=\"userNumber\"]")
    private WebElement inputUserNumber;

    @FindBy(how = How.XPATH, using = "//input[@name=\"gender\"]")
    private List<WebElement> radioOption;

    @FindBy(how = How.XPATH, using = "//button[@id=\"submit\"]")
    private WebElement buttonSubmit;

    //Métodos para obtener los Web Elements
    public WebElement getInputFirstName(){
        return inputFirstName;
    }

    public WebElement getInputLastName(){
        return inputLastName;
    }

    public WebElement getInputUserNumber(){
        return inputUserNumber;
    }

    public List<WebElement> getRadioOption(){
        return radioOption;
    }

    public WebElement getButtonSubmit(){
        return buttonSubmit;
    }
}
