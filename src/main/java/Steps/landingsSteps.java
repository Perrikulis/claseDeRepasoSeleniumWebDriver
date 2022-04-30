package Steps;

import org.openqa.selenium.WebDriver;
import Pages.landingPage;

public class landingsSteps extends baseSteps{
    landingPage landingPage = new landingPage(webDriver);

    public landingsSteps(WebDriver webDriver) {
        super(webDriver);
    }
    //Dar click en la opcion Elements
    public void clickOption (int option){
        landingPage.getMenuOptions().get(option).click();
    }
}
