package Pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

    WebDriver webDriver;

    //Constructor
    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
