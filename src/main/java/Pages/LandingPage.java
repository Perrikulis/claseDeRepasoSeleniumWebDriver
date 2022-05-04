package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver webDriver) {
        super(webDriver);
    }

    private String menuOptionsCSSLocator = "div.card.mt-4.top-card";
    private String menuOptionsXpath = "//div[@class='card mt-4 top-card']//h5[contains(text(),'Elements')]";

    public List<WebElement> getMenuOptions(){
        List<WebElement> menuOptions = webDriver.findElements(By.cssSelector(menuOptionsCSSLocator));
        return menuOptions;
    }
}
