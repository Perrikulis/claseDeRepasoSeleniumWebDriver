import Steps.ESPNStep;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ESPNTest extends BaseTest{

    ESPNStep ESPNStep = new ESPNStep(this.webDriver);

    @Test(description = "Testing teams in each tournaments in espn.com.mx", groups = {"ESPNTests", "SmokeTest"})

    public void testFutbolCategory() {
        webDriver.get("https://www.espn.com.mx/futbol/torneos");
        Reporter.log(ESPNStep.getMexicoConcacafElements());
        System.out.println(ESPNStep.getMexicoConcacafElements());
        Reporter.log(ESPNStep.getElements().size() + " Elementos");
        System.out.println(ESPNStep.getElements().size() + " Elementos");
        for (String team:ESPNStep.getElements()){
            Reporter.log(team);
        }
        System.out.println(ESPNStep.getElements());
        Reporter.log(" =============    =============");
        System.out.println(" =============    =============");
        for (String team:ESPNStep.getElements()
             ) {
            Reporter.log(team);
        }
        Reporter.log("=============    =============");
        System.out.println("=============    =============");
        Reporter.log(ESPNStep.getEuropeTitle());
        System.out.println(ESPNStep.getEuropeTitle());
        Reporter.log(ESPNStep.getElementsEurope().size() + " Elementos");
        System.out.println(ESPNStep.getElementsEurope().size() + " Elementos");
        for (String team:ESPNStep.getElementsEurope()){
            Reporter.log(team);
        }
        System.out.println(ESPNStep.getElementsEurope());
        Reporter.log(" =============    =============");
        System.out.println(" =============    =============");
        for (String team: ESPNStep.getElementsEurope()
             ) {
            Reporter.log(team);
        }
        System.out.println(ESPNStep.getElementsEurope());
        Reporter.log("=============    =============");
        System.out.println("=============    =============");
        Reporter.log(ESPNStep.getInternationalTitle());
        System.out.println(ESPNStep.getInternationalTitle());
        Reporter.log(ESPNStep.getElementsInternational().size() + " Elementos");
        System.out.println(ESPNStep.getElementsInternational().size() + " Elementos");
        for (String team:ESPNStep.getElementsInternational()){
            Reporter.log(team);
        }
        System.out.println(ESPNStep.getElementsInternational());
        Reporter.log(" =============    =============");
        System.out.println(" =============    =============");
        for (String team : ESPNStep.getElementsInternational()
             ) {
            Reporter.log(team);
        }
        System.out.println(ESPNStep.getElementsInternational());
        Reporter.log("=============    =============");
        System.out.println("=============    =============");
        Reporter.log(ESPNStep.getSoutAmericaTitle());
        System.out.println(ESPNStep.getSoutAmericaTitle());
        Reporter.log(ESPNStep.getElementsSouthAmerica().size() + " Elementos");
        System.out.println(ESPNStep.getElementsSouthAmerica().size() + " Elementos");
        for (String team : ESPNStep.getElementsSouthAmerica()
             ) {
            Reporter.log(team);
        }
        System.out.println(ESPNStep.getElementsSouthAmerica());
    }
}
