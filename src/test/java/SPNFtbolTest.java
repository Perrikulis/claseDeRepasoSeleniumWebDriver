import Steps.SPNFutbolSteps;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SPNFtbolTest extends BaseTest {

    SPNFutbolSteps spnFutbolSteps = new SPNFutbolSteps(webDriver);

    @Test(description = "Testing teams in each tournament in espn.com.mx", groups = {"ESPNTests"})
    public void getTextMexLeageTitle() {
        Reporter.log("This Log es una prueba**********---- *********");
        Reporter.log("This Log es una prueba**********---- *********");
        webDriver.get("https://www.espn.com.mx/futbol/torneos");
        Reporter.log(spnFutbolSteps.MexicoConcacafElements());
        System.out.println(spnFutbolSteps.MexicoConcacafElements());
        System.out.println(spnFutbolSteps.getElements().size() + " Elementos");
        System.out.println(spnFutbolSteps.getElements());
        for (String team : spnFutbolSteps.getElements()) {
            Reporter.log(team);
        }
        Reporter.log(" =============    =============");
        System.out.println(" =============    =============");
        Reporter.log(spnFutbolSteps.MexicoConcacafElements());
        System.out.println(spnFutbolSteps.getEuropeTitle());
        System.out.println(spnFutbolSteps.getElementsEurope().size() + " Elementos");
        for (String team : spnFutbolSteps.getElementsEurope()) {
            Reporter.log(team);
        }
        Reporter.log(" =============    =============");
        System.out.println(spnFutbolSteps.getElementsEurope());
        System.out.println(" =============    =============");
        Reporter.log(spnFutbolSteps.getInternationalTitle());
        System.out.println(spnFutbolSteps.getInternationalTitle());
        System.out.println(spnFutbolSteps.getElementsInternational().size() + " Elementos");
        for (String team : spnFutbolSteps.getElementsInternational()) {
            Reporter.log(team);
        }
        System.out.println(spnFutbolSteps.getElementsInternational());
        Reporter.log(" =============    =============");
        System.out.println(" =============    =============");
        System.out.println(spnFutbolSteps.getSoutAmericaTitle());
        System.out.println(spnFutbolSteps.getElementsSouthAmerica().size() + " Elementos");
        for (String team : spnFutbolSteps.getElementsSouthAmerica()) {
            Reporter.log(team);
        }
        System.out.println(spnFutbolSteps.getElementsSouthAmerica());

    }
}