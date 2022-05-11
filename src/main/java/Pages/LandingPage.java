package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver webDriver) {
        super(webDriver);
    }

    //localizador de una lista con CSSLocator de clase
    @FindBy(how = How.XPATH, using = "div.card.mt-4.top-card")
    private WebElement menuOptionsCSSLocator;
    @FindBy(how = How.XPATH, using = "//div[@class=\"card-body\"]")
    private WebElement menuOptionsXpath;


    //metodo public para obtener la lista
    public List<WebElement> getMenuOptions() {

        return (List<WebElement>) menuOptionsXpath;

    }

    public WebElement getTexBoxOption() {

        return menuOptionsXpath;
    }

}

