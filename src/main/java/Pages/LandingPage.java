package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver webDriver) {
        super(webDriver);
    }

    private String menuOptionsCSSLocator = "div.card.mt-4.top-card";
    private String menuOptionsXpath = "//div[@class='card mt-4 top-card']//h5[contains(text(),'Elements')]";

    public List<WebElement> getMenuOptions(){
        List<WebElement> menuOptions = webDriver.findElements(By.cssSelector(menuOptionsCSSLocator));
        return menuOptions;
    }

    private final String userNameTextBox = ".col-md-9.col-sm-12 > #userName";
    private final String userMailTextBox = ".col-md-9.col-sm-12 > #userEmail";
    private final String currentAddressTextBox = ".col-md-9.col-sm-12 > #currentAddress";
    private final String permanentAddressTextBox = ".col-md-9.col-sm-12 > #permanentAddress";
    private final String button = ".text-right.col-md-2.col-sm-12 > button";

    public WebElement getUserNameTextBox(){
        return webDriver.findElement(By.cssSelector(userNameTextBox));
    }

    public WebElement getUserMailTextBox(){ return webDriver.findElement(By.cssSelector(userMailTextBox));  }

    public WebElement getcurrentAddressTextBox(){ return webDriver.findElement(By.cssSelector(currentAddressTextBox));}

    public WebElement getpermanentAddressTextBox(){ return webDriver.findElement(By.cssSelector(permanentAddressTextBox));}

    public WebElement getButton (){ return webDriver.findElement(By.cssSelector(button));}
}
