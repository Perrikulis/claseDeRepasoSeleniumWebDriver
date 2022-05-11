package Steps;

import Pages.ElementsPage;
import org.openqa.selenium.WebDriver;
import Pages.LandingPage;
import org.openqa.selenium.support.PageFactory;

public class LandingsSteps extends BaseSteps {


    LandingPage landingPage = PageFactory.initElements(webDriver, LandingPage.class);

    public LandingsSteps(WebDriver webDriver) {
        super(webDriver);
    }

    //Clic en el boton Elements
    public void clicOPtion(int option) {

        landingPage.getMenuOptions().get(option).click();
    }
}
