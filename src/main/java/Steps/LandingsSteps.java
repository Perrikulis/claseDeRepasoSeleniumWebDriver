package Steps;

import org.openqa.selenium.WebDriver;
import Pages.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LandingsSteps extends BaseSteps{
    //LandingPage landingPage = new LandingPage(webDriver);
    LandingPage landingPage = PageFactory.initElements(webDriver, LandingPage.class);

    public LandingsSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean userNameTextBoxIsDisplayed(){
        return landingPage.getUserNameTextBox().isDisplayed();

    }

    public boolean userMailTextBoxIsDisplayed(){
        return landingPage.getUserMailTextBox().isDisplayed();

    }

    public boolean currentAddressTextBoxIsDisplayed(){
        return landingPage.getcurrentAddressTextBox().isDisplayed();

    }


    public boolean permanentAddressTextBoxisDisplayed(){
        return landingPage.getpermanentAddressTextBox().isDisplayed();

    }

    public boolean buttonIsDisplayed(){
        return landingPage.getButton().isDisplayed();

    }

    //Dar click en la opcion Elements
    public void clickOption (int option){
        landingPage.getMenuOptions().get(option).click();
    }
}
