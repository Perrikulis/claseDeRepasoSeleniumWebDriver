package Steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Pages.ESPNPage;

import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class ESPNStep extends BaseSteps{
    //ESPNPage page = new ESPNPage(this.webDriver);

    ESPNPage espnPage = PageFactory.initElements(webDriver, ESPNPage.class);

    public ESPNStep(WebDriver _webDriverBaseStep) {
        super(_webDriverBaseStep);
    }

    public String getMexicoConcacafElements(){
        WebElement paisesElement = espnPage.MexicoConcacaftitle();
        return paisesElement.getText();
    }

    public String getEuropeTitle(){
        WebElement paisesElement = espnPage.europaTitle();
        return paisesElement.getText();
    }

    public String getInternationalTitle(){
        WebElement paisesElement = espnPage.internationalTitle();
        return paisesElement.getText();
    }

    public String getSoutAmericaTitle(){
        WebElement paisesElement = espnPage.soutAmericaTitle();
        return paisesElement.getText();
    }

    public List<String> getElements(){
        return espnPage.MexicoConcacafElements().stream().map(x -> x.getText()).collect(Collectors.toList());
    }

    public List<String> getElementsInternational(){
        return espnPage.internationalElements().stream().map(x -> x.getText()).collect(Collectors.toList());
    }

    public List<String> getElementsEurope(){
        return espnPage.europeElements().stream().map(x -> x.getText()).collect(Collectors.toList());
    }

    public List<String> getElementsSouthAmerica(){
        return espnPage.southAmericaElements().stream().map(x -> x.getText()).collect(Collectors.toList());
    }
}

