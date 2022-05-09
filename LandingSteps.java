package Steps;

import Pages.LandingPage;
import org.openqa.selenium.WebDriver;



public class LandingSteps extends BaseSteps {

    LandingPage textBoxPage = new LandingPage(_webDriverBaseStep);

    public LandingSteps(WebDriver webDriverStep){
        super(webDriverStep);
    }

    public boolean userNameTextBoxIsDisplayed(){
        return textBoxPage.getUserNameTextBox().isDisplayed();

    }

    public boolean userMailTextBoxIsDisplayed(){
        return textBoxPage.getUserMailTextBox().isDisplayed();

    }

    public boolean currentAddressTextBoxIsDisplayed(){
        return textBoxPage.getcurrentAddressTextBox().isDisplayed();

    }


    public boolean permanentAddressTextBoxisDisplayed(){
        return textBoxPage.getpermanentAddressTextBox().isDisplayed();

    }

    public boolean buttonIsDisplayed(){
        return textBoxPage.getButton().isDisplayed();

    }

}
