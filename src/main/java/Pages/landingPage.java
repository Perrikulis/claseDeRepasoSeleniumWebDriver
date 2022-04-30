package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class landingPage extends basePage{
    //WebDriver webDriver;

    public landingPage(WebDriver webDriver) {
        super(webDriver);
    }

    private String menuOptionsCSSLocator = "div.card.mt-4.top-card";

    public List<WebElement> getMenuOptions(){
        List<WebElement> menuOptions = webDriver.findElements(By.cssSelector(menuOptionsCSSLocator));
        return menuOptions;
    }
}
