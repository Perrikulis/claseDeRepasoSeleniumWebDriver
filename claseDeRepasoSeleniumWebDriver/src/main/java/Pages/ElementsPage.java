package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ElementsPage extends BasePage {
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
     *
     * Se agregan además localizadores xpath
     */
    private String elementSubmitButton = "#submit";
    private String elementSubmitButtonXpath = "//button[@id='submit']";
    private String dropDownColorsId = "oldSelectMenu";
    private String dropDownColorsXpath = "//select[@id='oldSelectMenu']";
    public final String dropDownCarsId = "cars";
    public final String dropDownCarsXpath = "//select[@id='cars']";

    public WebElement getElementOption () {
        WebElement elementOption = webDriver.findElement(By.cssSelector(elementOptionCSSLocator));
        return elementOption;
    }
    public List<WebElement> getMenuOptionsElements (){
        List<WebElement> menuOptionsElements = webDriver.findElements(By.cssSelector(elementOptionCSSLocator));
        return menuOptionsElements;
    }

    public WebElement getElementFullName (){
        WebElement elementOptionFullName = webDriver.findElement(By.cssSelector(elementFullNameFieldCSSLocator));
        return elementOptionFullName;
    }

    public WebElement getElementEmail(){
        WebElement elementEmail = webDriver.findElement(By.cssSelector(elementEmailFieldCSSLocator));
        return elementEmail;
    }

    public WebElement getElementCurrentAddress(){
        WebElement elementCurrentAddress = webDriver.findElement(By.cssSelector(elementCurrentAddressFieldCSSLocator));
        return elementCurrentAddress;
    }

    public WebElement getElementPermanentAddress(){
        WebElement elementPermanentAddress = webDriver.findElement(By.cssSelector(elementPermanentAddressFieldCSSLocator));
        return elementPermanentAddress;
    }

    public WebElement getElementSubmit(){
        WebElement elementSubmit = webDriver.findElement(By.cssSelector(elementSubmitButton));
        return elementSubmit;
    }

    /** DropDown regresa un objeto Select para Colors
     */
    public Select getDropDownColors () {
        WebElement colorsDropDown = webDriver.findElement(By.id(dropDownColorsId));
        Select colorsDropDownSelect = new Select(colorsDropDown);
        return colorsDropDownSelect;
    }
    /** DrowDown regresa un objeto Select para Cars
     */
    public Select getDropDownCars(){
        WebElement carsDropDown = webDriver.findElement(By.id(dropDownCarsId));
        Select carsDropDownSelect = new Select(carsDropDown);
        return carsDropDownSelect;
    }
}
