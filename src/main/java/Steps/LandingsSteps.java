package Steps;

import org.openqa.selenium.WebDriver;
import Pages.LandingPage;

public class LandingsSteps extends BaseSteps{
    LandingPage landingPage = new LandingPage(webDriver);

    public LandingsSteps(WebDriver webDriver) {
        super(webDriver);
    }
    //Dar click en la opcion Elements
    public void clickOption (int option){
        landingPage.getMenuOptions().get(option).click();
    }
}
