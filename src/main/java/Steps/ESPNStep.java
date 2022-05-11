package Steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Pages.ESPNPage;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class ESPNStep extends BaseSteps{
    ESPNPage page = PageFactory.initElements(webDriver, ESPNPage.class);

    public ESPNStep(WebDriver _webDriverBaseStep) {
        super(_webDriverBaseStep);
    }

    public String getMexicoConcacafElements(){
        WebElement paisesElement = page.MexicoConcacaftitle();
        return paisesElement.getText();
    }

    public String getEuropeTitle(){
        WebElement paisesElement = page.europaTitle();
        return paisesElement.getText();
    }
    public String getInternationalTitle(){
        WebElement paisesElement = page.internationalTitle();
        return paisesElement.getText();
    }
    public String getSoutAmericaTitle(){
        WebElement paisesElement = page.soutAmericaTitle();
        return paisesElement.getText();
    }

    public List<String> getElements(){
        return page.MexicoConcacafElements().stream().map(x -> x.getText()).collect(Collectors.toList());
    }
    public List<String> getElementsInternational(){
        return page.internationalElements().stream().map(x -> x.getText()).collect(Collectors.toList());
    }
    public List<String> getElementsEurope(){
        return page.europeElements().stream().map(x -> x.getText()).collect(Collectors.toList());
    }
    public List<String> getElementsSouthAmerica(){
        return page.southAmericaElements().stream().map(x -> x.getText()).collect(Collectors.toList());
    }
}

