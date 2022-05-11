package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import java.util.List;
public class PracticePage {
    WebDriver webDriverHome;

    public PracticePage(WebDriver webDriverHome) {
        this.webDriverHome = webDriverHome;
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"firstName\"]")
    private WebElement textboxFirstName;

    public WebElement TextBoxFirstNameElement() {
        return textboxFirstName;
    }
}
