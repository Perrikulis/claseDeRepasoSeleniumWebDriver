package Steps;

import org.openqa.selenium.WebDriver;

public class BaseSteps {

    WebDriver webDriver;

    //Constructor
    public BaseSteps(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
