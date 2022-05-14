package Steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Pages.ESPNPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;
import java.util.stream.Collectors;

public class ESPNStep extends BaseSteps{

    ESPNPage page = PageFactory.initElements(webDriver,ESPNPage.class);

    public ESPNStep(WebDriver _webDriverBaseStep) {
        super(_webDriverBaseStep);
    }

    public String getMexicoConcacafElements(){
        WebElement paisesElement = page.MexicoConcacaftitle();
        Reporter.log("Step: Obteniendo valores de " + paisesElement.getText() + "<br>");
        return paisesElement.getText();
    }

    public String getEuropeTitle(){
        WebElement paisesElement = page.europaTitle();
        Reporter.log("Step: Obteniendo valores de " + paisesElement.getText() + "<br>");
        return paisesElement.getText();
    }
    public String getInternationalTitle(){
        WebElement paisesElement = page.internationalTitle();
        Reporter.log("Step: Obteniendo valores de " + paisesElement.getText() + "<br>");
        return paisesElement.getText();
    }
    public String getSoutAmericaTitle(){
        WebElement paisesElement = page.soutAmericaTitle();
        Reporter.log("Step: Obteniendo valores de " + paisesElement.getText() + "<br>");
        return paisesElement.getText();
    }

    public List<String> getElements(){
        Reporter.log("Step: Obteniendo lista de elementos de Mexico CONCACAF<br>");
        return page.MexicoConcacafElements().stream().map(x -> x.getText()).collect(Collectors.toList());
    }
    public List<String> getElementsInternational(){
        Reporter.log("Step: Obteniendo lista de elementos de International<br>");
        return page.internationalElements().stream().map(x -> x.getText()).collect(Collectors.toList());
    }
    public List<String> getElementsEurope(){
        Reporter.log("Step: Obteniendo lista de elementos de europe<br>");
        return page.europeElements().stream().map(x -> x.getText()).collect(Collectors.toList());
    }
    public List<String> getElementsSouthAmerica(){
        Reporter.log("Step: Obteniendo lista de elementos de South America<br>");
        return page.southAmericaElements().stream().map(x -> x.getText()).collect(Collectors.toList());
    }
}

