import Steps.ESPNStep;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ESPNTest extends BaseTest{

    ESPNStep ESPNStep = new ESPNStep(this.webDriver);

    @Test(description = "Testing teams in each tournaments in espn.com.mx", groups = {"ESPNTests", "SmokeTest"})
    public void testFutbolCategory() {
        Reporter.log("Opening: https://www.espn.com.mx/futbol/torneos <br>");
        webDriver.get("https://www.espn.com.mx/futbol/torneos");
        Reporter.log("Category: " + ESPNStep.getMexicoConcacafElements() + "<br>");
        System.out.println(ESPNStep.getMexicoConcacafElements());
        Reporter.log("Numero de elementos en esta lista: " + ESPNStep.getElements().size() + "<br>");
        System.out.println(ESPNStep.getElements().size() + " Elementos");
        for (String team:ESPNStep.getElements()){
            Reporter.log(team + "<br>");
        }
        System.out.println(ESPNStep.getElements());
        Reporter.log(" =============    =============<br>");
        System.out.println(" =============    =============");

        Reporter.log("Categoria: " + ESPNStep.getEuropeTitle() + "<br>");
        System.out.println(ESPNStep.getEuropeTitle());
        Reporter.log("Numero de elementos en esta lista: " + ESPNStep.getElementsEurope().size() + "<br>");
        System.out.println(ESPNStep.getElementsEurope().size() + " Elementos");
        for (String team:ESPNStep.getElementsEurope()){
            Reporter.log(team + "<br>");
        }
        System.out.println(ESPNStep.getElementsEurope());
        Reporter.log("=============    =============<br>");
        System.out.println("=============    =============");

        Reporter.log("Categoria: " + ESPNStep.getInternationalTitle() + "<br>");
        System.out.println(ESPNStep.getInternationalTitle());
        Reporter.log("Numero de elementos de esta categoria: " + ESPNStep.getElementsInternational().size() + "<br>");
        System.out.println(ESPNStep.getElementsInternational().size() + " Elementos");
        for (String team:ESPNStep.getElementsInternational()){
            Reporter.log(team + "<br>");
        }
        System.out.println(ESPNStep.getElementsInternational());
        Reporter.log(" =============    =============<br>");
        System.out.println(" =============    =============");

        Reporter.log("Categoria: " + ESPNStep.getSoutAmericaTitle() + "<br>");
        System.out.println(ESPNStep.getSoutAmericaTitle());
        Reporter.log("Numero de elementos en categoria: " + ESPNStep.getElementsSouthAmerica().size() + "<br>");
        System.out.println(ESPNStep.getElementsSouthAmerica().size() + " Elementos");
        for (String team : ESPNStep.getElementsSouthAmerica()
             ) {
            Reporter.log(team + "<br>");
        }
        System.out.println(ESPNStep.getElementsSouthAmerica());
    }
}
