package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver webDriver) {
        super(webDriver);
    }

    //localizador de una lista con CSSLocator de clase
    private String menuOptionsCSSLocator = "div.card.mt-4.top-card";
    private String menuOptionsXpath = "//div[@class=\"card-body\"]";

    //metodo public para obtener la lista
    public List<WebElement> getMenuOptions() {
        List<WebElement> menuOptions = webDriver.findElements(By.xpath(menuOptionsXpath));
        return menuOptions;

    }

    public WebElement getTexBoxOption() {
        WebElement textBoxOption = webDriver.findElement(By.xpath(menuOptionsXpath));
        return textBoxOption;
    }

}

