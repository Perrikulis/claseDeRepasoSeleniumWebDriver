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

    //private String menuOptionsCSSLocator = "div.card.mt-4.top-card";
    //private String menuOptionsXpath = "//div[@class='card mt-4 top-card']//h5[contains(text(),'Elements')]";

    @FindBy(how = How.CSS, using = "div.card.mt-4.top-card")
    private List<WebElement> menuOptionsCSSLocator;

    public List<WebElement> getMenuOptions(){ return menuOptionsCSSLocator;}

    //private final String userNameTextBox = ".col-md-9.col-sm-12 > #userName";
    @FindBy(how = How.CSS, using = ".col-md-9.col-sm-12 > #userName")
    private WebElement userNameTextBox;

    //private final String userMailTextBox = ".col-md-9.col-sm-12 > #userEmail";
    @FindBy(how = How.CSS, using = ".col-md-9.col-sm-12 > #userEmail")
    private WebElement userMailTextBox;

    //private final String currentAddressTextBox = ".col-md-9.col-sm-12 > #currentAddress";
    @FindBy(how = How.CSS, using = ".col-md-9.col-sm-12 > #currentAddress")
    private WebElement currentAddressTextBox;

    //private final String permanentAddressTextBox = ".col-md-9.col-sm-12 > #permanentAddress";
    @FindBy(how = How.CSS, using = ".col-md-9.col-sm-12 > #permanentAddress")
    private WebElement permanentAddressTextBox;

    //private final String button = ".text-right.col-md-2.col-sm-12 > button";
    @FindBy(how = How.CSS, using = ".text-right.col-md-2.col-sm-12 > button")
    private WebElement button;


    public WebElement getUserNameTextBox(){ return userNameTextBox;}

    public WebElement getUserMailTextBox(){ return userMailTextBox;}

    public WebElement getcurrentAddressTextBox(){ return currentAddressTextBox;}

    public WebElement getpermanentAddressTextBox(){ return permanentAddressTextBox;}

    public WebElement getButton (){ return button;}


}// Fin de la Clase
