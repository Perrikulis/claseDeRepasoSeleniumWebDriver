package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    WebDriver webDriverHome;

    public LandingPage(WebDriver webDriverHome){
        this.webDriverHome = webDriverHome;
    }



    private final String userNameTextBox = ".col-md-9.col-sm-12 > #userName";
    private final String userMailTextBox = ".col-md-9.col-sm-12 > #userEmail";
    private final String currentAddressTextBox = ".col-md-9.col-sm-12 > #currentAddress";
    private final String permanentAddressTextBox = ".col-md-9.col-sm-12 > #permanentAddress";
    private final String button = ".text-right.col-md-2.col-sm-12 > button";

    public WebElement getUserNameTextBox(){
        return webDriverHome.findElement(By.cssSelector(userNameTextBox));
    }

    public WebElement getUserMailTextBox(){ return webDriverHome.findElement(By.cssSelector(userMailTextBox));  }

    public WebElement getcurrentAddressTextBox(){ return webDriverHome.findElement(By.cssSelector(currentAddressTextBox));}

    public WebElement getpermanentAddressTextBox(){ return webDriverHome.findElement(By.cssSelector(permanentAddressTextBox));}

    public WebElement getButton (){ return webDriverHome.findElement(By.cssSelector(button));

    }
}
