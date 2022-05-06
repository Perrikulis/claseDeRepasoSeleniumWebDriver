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

    private String elementOptionCSSLocator = ".element-list.collapse.show > ul > #item-0 > span";
    private String elementOptTBXpathLocator = "(//span[contains(@class,\"text\")])[1]";

    //span[contains(text(),"Text Box")]
    private String fUllNameXpathLocator = "//label[@id=\"userName-label\"]";
    private String emailXpathLocator = "//label[@id=\"userEmail-label\"]";
    private String currentAddressXpathLocator = "//label[@id=\"currentAddress-label\"]";
    private String permanentAddressXpathLocator = "//label[@id=\"permanentAddress-label\"]";
    private String submitBtnXpathLocator = "//button[@id=\"submit\"]";

    private String fUllNameTBXpathLocator = "//input[@id=\"userName\"]";
    private String emailXTBpathLocator = "//input[@id=\"userEmail\"]";
    private String currentAddressTBXpathLocator = "//textarea[@id=\"currentAddress\"]";
    private String permanentAddressTBXpathLocator = "//textarea[@id=\"permanentAddress\"]";
    private String submitBtnTBXpathLocator = "//button[@id=\"submit\"]";

    //Results fields
    private String resultFormNameXpathLocator = "//p[@id=\"name\"]";
    private String resultFormEmailXpathLocator = "//p[@id=\"email\"]";
    private String resultFormCurrentAddressXpathLocator = "//p[@id=\"currentAddress\"]";
    private String resultFormPermanentAddressXpathLocator = "//p[@id=\"permanentAddress\"]";

    private String resultFormXpathLocator = "//div[@id=\"output\"]";

    //obtener output value
    public WebElement getOutPut() {
        WebElement OutPutValue = webDriver.findElement(By.xpath(resultFormXpathLocator));
        return OutPutValue;
    }

    //obtener el texto de los resultados
    public WebElement getResultName() {
        WebElement textResultName = webDriver.findElement(By.xpath(resultFormNameXpathLocator));
        return textResultName;
    }

    public WebElement getResultEmail() {
        WebElement textResultEmail = webDriver.findElement(By.xpath(resultFormEmailXpathLocator));
        return textResultEmail;
    }

    public WebElement getResultcurrentAddress() {
        WebElement textResultCurrentAddress = webDriver.findElement(By.xpath(resultFormCurrentAddressXpathLocator));
        return textResultCurrentAddress;
    }

    public WebElement getResultpermanAddress() {
        WebElement textResultPermanAddres = webDriver.findElement(By.xpath(resultFormPermanentAddressXpathLocator));
        return textResultPermanAddres;
    }

    //optener los campos de TB
    public WebElement getFielTBdFullName() {
        WebElement elementOptTBFullName = webDriver.findElement(By.xpath(fUllNameTBXpathLocator));
        return elementOptTBFullName;
    }

    public WebElement getFielTBdemail() {
        WebElement elementOptTBemail = webDriver.findElement(By.xpath(emailXTBpathLocator));
        return elementOptTBemail;
    }

    public WebElement getFielTBcurrentAddress() {
        WebElement elementOptTBcurrentAddress = webDriver.findElement(By.xpath(currentAddressTBXpathLocator));
        return elementOptTBcurrentAddress;
    }

    public WebElement getFielTBpermanentAddress() {
        WebElement elementOptTBpermanentAddress = webDriver.findElement(By.xpath(permanentAddressTBXpathLocator));
        return elementOptTBpermanentAddress;
    }

    public WebElement getBtnSubmit() {
        WebElement elementOptBtnSubmit = webDriver.findElement(By.xpath(submitBtnTBXpathLocator));
        return elementOptBtnSubmit;
    }

    public WebElement getElementOption() {
        WebElement elementOption = webDriver.findElement(By.cssSelector(elementOptionCSSLocator));
        return elementOption;
    }

    public WebElement getElementTBOpt() {
        WebElement elementTBOpt = webDriver.findElement(By.xpath(elementOptTBXpathLocator));
        return elementTBOpt;
    }

    //Obtener los campos existentes:
    public WebElement getFieldFullName() {
        WebElement elementOptionFullName = webDriver.findElement(By.xpath(fUllNameXpathLocator));
        return elementOptionFullName;
    }

    public WebElement getFieldEmail() {
        WebElement elementEmail = webDriver.findElement(By.xpath(emailXpathLocator));
        return elementEmail;
    }

    public WebElement getFieldCurrentAddress() {
        WebElement elementCurrentAddress = webDriver.findElement(By.xpath(currentAddressXpathLocator));
        return elementCurrentAddress;
    }

    public WebElement getFieldPermanentAddress() {
        WebElement elementPermanentAddress = webDriver.findElement(By.xpath(permanentAddressXpathLocator));
        return elementPermanentAddress;
    }

    public WebElement getButtonSubmit() {
        WebElement elementSubmit = webDriver.findElement(By.xpath(submitBtnXpathLocator));
        return elementSubmit;
    }


}