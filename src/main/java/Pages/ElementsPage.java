package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementsPage extends BasePage {

    //Constructor
    public ElementsPage(WebDriver webDriver) {
        super(webDriver);
    }

    /** Localizadores CSS de Text Box
     * .element-list.collapse.show > ul > #item-0 > span
     * .show > ul > #item-0 > span
     */
    private String elementOptionCSSLocator =".show > ul > #item-0 > span";
    private String elementTextBoxOptionXpath = "//span[contains(text(),'Text Box')]";
    /** Localizador CSS de label Full Name en el form
     *  .col-md-3.col-sm-12>#userName-label
     */
    private String elementFullNameFieldCSSLocator = ".col-md-3.col-sm-12>#userName-label";
    private String labelFullNameXpath = "//label[@id='userName-label']";
    /** Localizador CSS de label Email en el form
     * .col-md-3.col-sm-12>#userEmail-label
     */
    private String elementEmailFieldCSSLocator = ".col-md-3.col-sm-12>#userEmail-label";
    private String labelUserEmailXpath = "//label[@id='userEmail-label']";
    /** Localizador CSS de label Current Address en el form
     * .col-md-3.col-sm-12>#currentAddress-label
     */
    private String elementCurrentAddressFieldCSSLocator = ".col-md-3.col-sm-12>#currentAddress-label";
    /** Localizador CSS de label Permanent Address en el form
     * .col-md-3.col-sm-12>#permanentAddress-label
     */
    private String elementPermanentAddressFieldCSSLocator= ".col-md-3.col-sm-12>#permanentAddress-label";
    /** Localizador CSS de boton Submit en el form
     * #submit
     */
    private String elementSubmitButton = "#submit";
    private String dropDownColorsId = "oldSelectMenu";

    //Elements located by CSSLocator
    /*
    private By elementOptionXpath = By.cssSelector(".element-list.collapse.show > ul > #item-0 > span");
    private By fullNameInputCSSLocator = By.cssSelector("#userName");
    private By emailInputCSSLocator = By.cssSelector("#userEmail");
    private By currentAddressTextAreaCSSLocator = By.cssSelector("#currentAddress");
    private By permanentAddressTextAreaCSSLocator = By.cssSelector("#permanentAddress");
    private By submitButtonCSSLocator = By.cssSelector("#submit");
    private By emailResultCSSLocator = By.cssSelector("#output");
    */

    //Elements located by Xpath
    //private By elementOptionXpath = By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']");
    private By elementOptionXpath = By.xpath("//span[contains(text(),'Text Box')]");
    private By fullNameInputXpath = By.xpath("//form[@id='userForm']//input[@id='userName']");
    private By emailInputXpath = By.xpath("//form[@id='userForm']//input[@id='userEmail']");
    private By currentAddressTextAreaXpath = By.xpath("//form[@id='userForm']//textarea[@id='currentAddress']");
    private By permanentAddressTextAreaXpath = By.xpath("//form[@id='userForm']//textarea[@id='permanentAddress']");
    private By submitButtonXpath = By.xpath("//form[@id='userForm']//button[@id='submit']");
    private By emailResultXpath = By.xpath("//form[@id='userForm']//div[@id='output']");

    private By dropDownColorsId = By.id("oldSelectMenu");
    private By dropDownCarsId = By.id("cars");

    public WebElement getElementOption() {
        WebElement elementOption = webDriver.findElement(elementOptionXpath);
        return elementOption;
    }

    public WebElement getFullNameInput() {
        WebElement fullNameInput = webDriver.findElement(fullNameInputXpath);
        return fullNameInput;
    }

    public WebElement getEmailInput() {
        WebElement emailInput = webDriver.findElement(emailInputXpath);
        return emailInput;
    }

    public WebElement getCurrentAddressTextArea() {
        WebElement currentAddressTextArea = webDriver.findElement(currentAddressTextAreaXpath);
        return currentAddressTextArea;
    }

    public WebElement getPermanentAddressTextArea() {
        WebElement permanentAddressTextArea = webDriver.findElement(permanentAddressTextAreaXpath);
        return permanentAddressTextArea;
    }

    public WebElement getSubmitButton() {
        WebElement submitButton = webDriver.findElement(submitButtonXpath);
        return submitButton;
    }

    public WebElement getEmailResult() {
        return webDriver.findElement(emailResultXpath);
    }

    public Select getDropDownColors() {
        WebElement colorsDropDown = webDriver.findElement(dropDownColorsId);
        Select colorsDropDownSelect = new Select(colorsDropDown);
        return colorsDropDownSelect;
    }

    public Select getDropDownCars() {
        WebElement carsDropDown = webDriver.findElement(dropDownCarsId);
        Select carsDropDownSelect = new Select(carsDropDown);
        return carsDropDownSelect;
    }
}
