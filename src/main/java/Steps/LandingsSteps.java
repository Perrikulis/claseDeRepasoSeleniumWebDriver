package Steps;

import Pages.LandingPage;
import org.openqa.selenium.WebDriver;

public class LandingsSteps extends BaseSteps {

    LandingPage landingPage = new LandingPage(webDriver);

    //Constructor
    public LandingsSteps(WebDriver webDriver) {
        super(webDriver);
    }

    //Dar click en la opción de Elements
    public void clickOption(int option) {
        landingPage.getMenuOptions().get(option).click();
    }
}
