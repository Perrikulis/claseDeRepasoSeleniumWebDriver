import Steps.ESPNStep;
import org.testng.annotations.Test;

public class ESPNTest extends BaseTest{

    Steps.ESPNStep ESPNStep = new ESPNStep(this.webDriver);

    @Test
    public void testFutbolCategory() {
        webDriver.get("https://www.espn.com.mx/futbol/torneos");
        System.out.println(ESPNStep.getMexicoConcacafElements());
        System.out.println(ESPNStep.getElements().size() + " Elementos");
        System.out.println(ESPNStep.getElements());
        System.out.println(" =============    =============");
        System.out.println(ESPNStep.getEuropeTitle());
        System.out.println(ESPNStep.getElementsEurope().size() + " Elementos");
        System.out.println(ESPNStep.getElementsEurope());
        System.out.println(" =============    =============");
        System.out.println(ESPNStep.getInternationalTitle());
        System.out.println(ESPNStep.getElementsInternational().size() + " Elementos");
        System.out.println(ESPNStep.getElementsInternational());
        System.out.println(" =============    =============");
        System.out.println(ESPNStep.getSoutAmericaTitle());
        System.out.println(ESPNStep.getElementsSouthAmerica().size() + " Elementos");
        System.out.println(ESPNStep.getElementsSouthAmerica());


    }
}
