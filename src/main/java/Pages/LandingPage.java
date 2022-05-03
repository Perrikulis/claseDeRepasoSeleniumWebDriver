package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPage extends BasePage {

    //Constructor
    public LandingPage(WebDriver webDriver) {
        super(webDriver);
    }

    //private By menuOptionsCSSLocator = By.cssSelector("div.card.mt-4.top-card");
    private By menuOptionsXpath = By.xpath("//div[@class='card mt-4 top-card']");

    public List<WebElement> getMenuOptions() {
        List<WebElement> menuOptions = webDriver.findElements(menuOptionsXpath);
        return menuOptions;
    }
}
