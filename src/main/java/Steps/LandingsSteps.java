package Steps;

import org.openqa.selenium.WebDriver;
import Pages.LandingPage;
import org.openqa.selenium.support.PageFactory;

public class LandingsSteps extends BaseSteps{
    LandingPage landingPage = PageFactory.initElements(webDriver, LandingPage.class);

    public LandingsSteps(WebDriver webDriver) {
        super(webDriver);
    }
    //Dar click en la opcion Elements
    public void clickOption (int option){
        landingPage.getMenuOptions().get(option).click();
    }
}
