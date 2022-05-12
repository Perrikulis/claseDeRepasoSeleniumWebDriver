package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AutomationPracticePage extends BasePage{

    public AutomationPracticePage (WebDriver webDriver) {
        super (webDriver);
    }

    @FindBy(how = How.XPATH, using = "//input[@id='firstName']")
    private WebElement inputName;

    public WebElement getInputFirstName(){
        return inputName;
    }

}
