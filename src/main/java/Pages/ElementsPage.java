package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactoryFinder;
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

    /**
    * Se agrega el uso de PageFactory
     */
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Text Box')]")
    private WebElement elementOption;

    @FindBy(how = How.CSS, using = ".show > ul > #item-0 > span")
    private List<WebElement> menuOptionElements;

    @FindBy(how = How.XPATH, using = "//label[@id='userName-label']")
    private WebElement labelFullName;

    @FindBy(how = How.XPATH, using = "//label[@id='userEmail-label']")
    private WebElement labelUserEmail;

    @FindBy(how = How.CSS, using = ".col-md-3.col-sm-12>#currentAddress-label")
    private WebElement elementCurrentAddressField;

    @FindBy(how = How.CSS, using = ".col-md-3.col-sm-12>#permanentAddress-label")
    private WebElement elementPermanentAddressField;

    @FindBy(how = How.XPATH, using = "//button[@id='submit']")
    private WebElement submitButton;

    @FindBy(how = How.XPATH, using = "//select[@id='oldSelectMenu']")
    private WebElement dropDownColors;

    @FindBy(how = How.XPATH, using = "//select[@id='cars']")
    private WebElement dropDownCars;

    public WebElement getElementOption () {
        return elementOption;
    }
    public List<WebElement> getMenuOptionsElements (){
        return menuOptionElements;
    }

    public WebElement getElementFullName (){
        return labelFullName;
    }

    public WebElement getElementEmail(){
        return labelUserEmail;
    }

    public WebElement getElementCurrentAddress(){
        return elementCurrentAddressField;
    }

    public WebElement getElementPermanentAddress(){
        return elementPermanentAddressField;
    }

    public WebElement getElementSubmit(){
        return submitButton;
    }

    /** DropDown regresa un objeto Select para Colors
     */
    public Select getDropDownColors () {
        Select colorsDropDownSelect = new Select(dropDownColors);
        return colorsDropDownSelect;
    }
    /** DrowDown regresa un objeto Select para Cars
     */
    public Select getDropDownCars(){
        Select carsDropDownSelect = new Select(dropDownCars);
        return carsDropDownSelect;
    }
}
