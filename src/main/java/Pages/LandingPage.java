package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver webDriver) {
        super(webDriver);
    }

    //CSS and XPath locators
    private String menuOptionsCSSLocator = "div.card.mt-4.top-card";
    private String menuOptionsXpath = "//div[@class='card mt-4 top-card']//h5[contains(text(),'Elements')]";
    private final String userNameTextBox = ".col-md-9.col-sm-12 > #userName";
    private final String userMailTextBox = ".col-md-9.col-sm-12 > #userEmail";
    private final String currentAddressTextBox = ".col-md-9.col-sm-12 > #currentAddress";
    private final String permanentAddressTextBox = ".col-md-9.col-sm-12 > #permanentAddress";
    private final String button = ".text-right.col-md-2.col-sm-12 > button";

    //Use of PageFactory
    @FindBy(how = How.CSS, using = "div.card.mt-4.top-card")
    private List<WebElement> menuOptions;

    @FindBy(how = How.CSS, using = ".col-md-9.col-sm-12 > #userName")
    private WebElement userNameTextBoxCSS;

    @FindBy(how = How.CSS, using = ".col-md-9.col-sm-12 > #userEmail")
    private WebElement userMailTextBoxCSS;

    @FindBy(how = How.CSS, using = ".col-md-9.col-sm-12 > #currentAddress")
    private WebElement currentAddressTextBoxCSS;

    @FindBy(how = How.CSS, using = ".col-md-9.col-sm-12 > #permanentAddress")
    private WebElement permanentAddressTextBoxCSS;

    @FindBy(how = How.CSS, using = ".col-md-9.col-sm-12 > button")
    private WebElement buttonCSS;

    public List<WebElement> getMenuOptions(){
        return menuOptions;
    }

    public WebElement getUserNameTextBox(){ return userNameTextBoxCSS; }

    public WebElement getUserMailTextBox(){ return userMailTextBoxCSS; }

    public WebElement getcurrentAddressTextBox(){ return currentAddressTextBoxCSS; }

    public WebElement getpermanentAddressTextBox(){ return permanentAddressTextBoxCSS; }

    public WebElement getButton (){ return buttonCSS; }
}
