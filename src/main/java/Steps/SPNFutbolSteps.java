package Steps;

import Pages.ElementsPage;
import Pages.LandingPage;
import Pages.SPNFutbolPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;
import java.util.stream.Collectors;

public class SPNFutbolSteps extends BaseSteps {

    SPNFutbolPage spnFutbolPage = PageFactory.initElements(webDriver, SPNFutbolPage.class);

    LandingPage landingPage = new LandingPage(webDriver);


    public SPNFutbolSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public String MexicoConcacafElements() {
        Reporter.log("This Log es una prueba**********---- *********");
        WebElement paisesElement = spnFutbolPage.MexicoConcacaftitle();
        return paisesElement.getText();
    }

    public String getEuropeTitle() {
        WebElement paisesElement = spnFutbolPage.europaTitle();
        return paisesElement.getText();
    }

    public String getInternationalTitle() {
        WebElement paisesElement = spnFutbolPage.internationalTitle();
        return paisesElement.getText();
    }

    public String getSoutAmericaTitle() {
        WebElement paisesElement = spnFutbolPage.soutAmericaTitle();
        return paisesElement.getText();
    }

    public List<String> getElements() {
        return spnFutbolPage.MexicoConcacafElements().stream().map(x -> x.getText()).collect(Collectors.toList());
    }

    public List<String> getElementsInternational() {
        return spnFutbolPage.internationalElements().stream().map(x -> x.getText()).collect(Collectors.toList());
    }

    public List<String> getElementsEurope() {
        return spnFutbolPage.europeElements().stream().map(x -> x.getText()).collect(Collectors.toList());
    }

    public List<String> getElementsSouthAmerica() {
        return spnFutbolPage.southAmericaElements().stream().map(x -> x.getText()).collect(Collectors.toList());
    }
}
