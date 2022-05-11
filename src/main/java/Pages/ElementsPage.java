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

    /** Localizadores CSS de Text Box
     * .element-list.collapse.show > ul > #item-0 > span
     * .show > ul > #item-0 > span
     */
    //private String elementOptionCSSLocator =".show > ul > #item-0 > span";
    @FindBy(how = How.CSS, using = ".show > ul > #item-0 > span")
    private WebElement elementOption;

    @FindBy(how = How.CSS, using = ".show > ul > #item-0 > span")
    private List<WebElement> menuOption;

    //private String elementTextBoxOptionXpath = "//span[contains(text(),'Text Box')]";
    /** Localizador CSS de label Full Name en el form
     *  .col-md-3.col-sm-12>#userName-label
     */
    //private String elementFullNameFieldCSSLocator = ".col-md-3.col-sm-12>#userName-label";
    @FindBy(how = How.CSS, using =  ".col-md-3.col-sm-12>#userName-label")
    private WebElement userNameField;

    //private String labelFullNameXpath = "//label[@id='userName-label']";
    @FindBy(how = How.CSS, using = "//label[@id='userName-label']")
    private WebElement userNameLabel;

    /** Localizador CSS de label Email en el form
     * .col-md-3.col-sm-12>#userEmail-label
     */
    //private String elementEmailFieldCSSLocator = ".col-md-3.col-sm-12>#userEmail-label";
    @FindBy(how = How.CSS, using = ".col-md-3.col-sm-12>#userEmail-label")
    private WebElement elementEmailFieldCSSLocator;

    /** Localizador CSS de label Current Address en el form
     * .col-md-3.col-sm-12>#currentAddress-label
     */
    //private String elementCurrentAddressFieldCSSLocator = ".col-md-3.col-sm-12>#currentAddress-label";
    @FindBy(how = How.CSS, using = ".col-md-3.col-sm-12>#currentAddress-label")
    private WebElement currentAddressField;

    /** Localizador CSS de label Permanent Address en el form
     * .col-md-3.col-sm-12>#permanentAddress-label
     */
    //private String elementPermanentAddressFieldCSSLocator= ".col-md-3.col-sm-12>#permanentAddress-label";
    @FindBy(how = How.CSS, using = ".col-md-3.col-sm-12>#permanentAddress-label")
    private WebElement PermanentAddressField;

    /** Localizador CSS de boton Submit en el form
     * #submit
     */
    //private String elementSubmitButton = "#submit";
    @FindBy(how = How.ID, id = "submit")
    private WebElement elementSubmiButton;

    //private String dropDownColorsId = "oldSelectMenu";
    @FindBy(how = How.ID, id = "oldSelectMenu")
    private WebElement oldSelectMenu;

    public WebElement getElementOption () {
        return elementOption;
    }
    public List<WebElement> getMenuOptionsElements (){
        return menuOption;
    }

    public WebElement getElementFullName (){
        return userNameField;
    }

    public WebElement getElementEmail(){
        return elementEmailFieldCSSLocator;
    }

    public WebElement getElementCurrentAddress(){
        return currentAddressField;
    }

    public WebElement getElementPermanentAddress(){
        return PermanentAddressField;
    }

    public WebElement getElementSubmit(){
        return elementSubmiButton;
    }

    /** DropDown regresa un objeto Select
     */
    public Select getDropDownColors () {
        Select colorsDropDownSelect = new Select(oldSelectMenu);
        return colorsDropDownSelect;
    }

}
