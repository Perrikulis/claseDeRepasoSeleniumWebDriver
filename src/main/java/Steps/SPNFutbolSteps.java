package Steps;

import Pages.ElementsPage;
import Pages.LandingPage;
import Pages.SPNFutbolPage;
import org.openqa.selenium.WebDriver;

public class SPNFutbolSteps extends BaseSteps {

    ElementsPage elementsPage = new ElementsPage(webDriver);
    LandingPage landingPage = new LandingPage(webDriver);
    SPNFutbolPage spnFutbolPage = new SPNFutbolPage(webDriver);

    public SPNFutbolSteps(WebDriver webDriver) {
        super(webDriver);
    }
    public String getTextMexLeageTitle() {
        String texto =  spnFutbolPage.getMexLeageTitle().getText();
        return texto;
    }


}