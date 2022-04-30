package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class elementsPage extends basePage{
    public elementsPage(WebDriver webDriver) {
        super(webDriver);
    }
    /** Localizadores CSS de Text Box
     * .element-list.collapse.show > ul > #item-0 > span
     * .show > ul > #item-0 > span
     */
    private String elementOptionCSSLocator =".show > ul > #item-0 > span";

    public WebElement getElementOption () {
        WebElement elementOption = webDriver.findElement(By.cssSelector(elementOptionCSSLocator));
        return elementOption;
    }
    public List<WebElement> getMenuOptionsElements (){
        List<WebElement> menuOptionsElements = webDriver.findElements(By.cssSelector(elementOptionCSSLocator));
        return menuOptionsElements;
    }

    /** Localizador CSS de label Full Name en el form
     *  .col-md-3.col-sm-12>#userName-label
     */
    private String elementFullNameFieldCSSLocator = ".col-md-3.col-sm-12>#userName-label";

    public WebElement getElementFullName (){
        WebElement elementOptionFullName = webDriver.findElement(By.cssSelector(elementFullNameFieldCSSLocator));
        return elementOptionFullName;
    }
    /** Localizador CSS de label Email en el form
     * .col-md-3.col-sm-12>#userEmail-label
     */
    private String elementEmailFieldCSSLocator = ".col-md-3.col-sm-12>#userEmail-label";
    public WebElement getElementEmail(){
        WebElement elementEmail = webDriver.findElement(By.cssSelector(elementEmailFieldCSSLocator));
        return elementEmail;
    }
    /** Localizador CSS de label Current Address en el form
     * .col-md-3.col-sm-12>#currentAddress-label
     */
    private String elementCurrentAddressFieldCSSLocator = ".col-md-3.col-sm-12>#currentAddress-label";
    public WebElement getElementCurrentAddress(){
        WebElement elementCurrentAddress = webDriver.findElement(By.cssSelector(elementCurrentAddressFieldCSSLocator));
        return elementCurrentAddress;
    }
    /** Localizador CSS de label Permanent Address en el form
     * .col-md-3.col-sm-12>#permanentAddress-label
     */
    private String elementPermanentAddressFieldCSSLocator= ".col-md-3.col-sm-12>#permanentAddress-label";
    public WebElement getElementPermanentAddress(){
        WebElement elementPermanentAddress = webDriver.findElement(By.cssSelector(elementPermanentAddressFieldCSSLocator));
        return elementPermanentAddress;
    }
    /** Localizador CSS de boton Submit en el form
     * #submit
     */
    private String elementSubmitButton = "#submit";
    public WebElement getElementSubmit(){
        WebElement elementSubmit = webDriver.findElement(By.cssSelector(elementSubmitButton));
        return elementSubmit;
    }

}
