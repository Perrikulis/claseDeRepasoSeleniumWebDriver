package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ElementsPage extends BasePage {
    public ElementsPage(WebDriver webDriver) {
        super(webDriver);
    }


    @FindBy(how = How.CSS, using = "element-list.collapse.show > ul > #item-0 > span\"")
    private WebElement elementOptionCSSLocator;
    @FindBy(how = How.CSS, using = "(//span[contains(@class,\"text\")])[1]")
    private WebElement elementOptTBXpathLocator;


    @FindBy(how = How.XPATH, using = "//label[@id=\"userName-label\"]")
    private WebElement fUllNameXpathLocator;
    @FindBy(how = How.XPATH, using = "//label[@id=\"userEmail-label\"]")
    private WebElement emailXpathLocator;
    @FindBy(how = How.XPATH, using = "//label[@id=\"currentAddress-label\"]")
    private WebElement currentAddressXpathLocator;
    @FindBy(how = How.XPATH, using = "//label[@id=\"permanentAddress-label\"]")
    private WebElement permanentAddressXpathLocator;
    @FindBy(how = How.XPATH, using = "//button[@id=\"submit\"]")
    private WebElement submitBtnXpathLocator;


    @FindBy(how = How.XPATH, using = "//input[@id=\"userName\"]")
    private WebElement fUllNameTBXpathLocator;
    @FindBy(how = How.XPATH, using = "//input[@id=\"userEmail\"]")
    private WebElement emailXTBpathLocator;
    @FindBy(how = How.XPATH, using = "//textarea[@id=\"currentAddress\"]")
    private WebElement currentAddressTBXpathLocator;
    @FindBy(how = How.XPATH, using = "//textarea[@id=\"permanentAddress\"]")
    private WebElement permanentAddressTBXpathLocator;
    @FindBy(how = How.XPATH, using = "//button[@id=\"submit\"]")
    private WebElement submitBtnTBXpathLocator;

    //Results fields


    @FindBy(how = How.XPATH, using = "//p[@id=\"name\"]")
    private WebElement resultFormNameXpathLocator;
    @FindBy(how = How.XPATH, using = "//p[@id=\"email\"]")
    private WebElement resultFormEmailXpathLocator;
    @FindBy(how = How.XPATH, using = "//p[@id=\"currentAddress\"]")
    private WebElement resultFormCurrentAddressXpathLocator;
    @FindBy(how = How.XPATH, using = "//p[@id=\"permanentAddress\"]")
    private WebElement resultFormPermanentAddressXpathLocator;
    @FindBy(how = How.XPATH, using = "//div[@id=\"output\"]")
    private WebElement resultFormXpathLocator;

    //obtener output value
    public WebElement getOutPut() {

        return resultFormXpathLocator;
    }

    //obtener el texto de los resultados
    public WebElement getResultName() {

        return resultFormNameXpathLocator;
    }

    public WebElement getResultEmail() {

        return resultFormEmailXpathLocator;
    }

    public WebElement getResultcurrentAddress() {

        return resultFormCurrentAddressXpathLocator;
    }

    public WebElement getResultpermanAddress() {

        return resultFormPermanentAddressXpathLocator;
    }

    //optener los campos de TB
    public WebElement getFielTBdFullName() {

        return fUllNameTBXpathLocator;
    }

    public WebElement getFielTBdemail() {

        return emailXTBpathLocator;
    }

    public WebElement getFielTBcurrentAddress() {

        return currentAddressTBXpathLocator;
    }

    public WebElement getFielTBpermanentAddress() {

        return permanentAddressTBXpathLocator;
    }

    public WebElement getBtnSubmit() {

        return submitBtnTBXpathLocator;
    }

    public WebElement getElementOption() {

        return elementOptionCSSLocator;
    }

    public WebElement getElementTBOpt() {

        return elementOptTBXpathLocator;
    }

    //Obtener los campos existentes:
    public WebElement getFieldFullName() {

        return fUllNameXpathLocator;
    }

    public WebElement getFieldEmail() {

        return emailXpathLocator;
    }

    public WebElement getFieldCurrentAddress() {

        return currentAddressXpathLocator;
    }

    public WebElement getFieldPermanentAddress() {

        return permanentAddressXpathLocator;
    }

    public WebElement getButtonSubmit() {

        return submitBtnXpathLocator;
    }


}