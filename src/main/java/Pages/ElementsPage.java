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
