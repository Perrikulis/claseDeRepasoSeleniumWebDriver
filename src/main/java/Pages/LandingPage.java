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

    //private String menuOptionsCSSLocator = "div.card.mt-4.top-card";
    @FindBy(how = How.CSS, using = "div.card.mt-4.top-card")
    private List<WebElement> menuOptions;

    public List<WebElement> getMenuOptions(){
        return menuOptions;
    }
}
