package Steps;

import org.openqa.selenium.WebDriver;
import Pages.LandingPage;

public class LandingsSteps extends BaseSteps {

    LandingPage landingPage = new LandingPage(webDriver);

    public LandingsSteps(WebDriver webDriver) {
        super(webDriver);
    }

    //Clic en el boton Elements
    public void clicOPtion(int option) {

        landingPage.getMenuOptions().get(option).click();
    }
}
