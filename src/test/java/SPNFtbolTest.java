import Steps.SPNFutbolSteps;
import org.testng.annotations.Test;

public class SPNFtbolTest extends BaseTest{

    SPNFutbolSteps spnFutbolSteps = new SPNFutbolSteps(webDriver);

    @Test
    public void getTextMexLeageTitle() {
        webDriver.get("https://www.espn.com.mx/futbol/torneos");
        System.out.println(spnFutbolSteps.getTextMexLeageTitle());
    }

}