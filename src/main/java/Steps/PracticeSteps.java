package Steps;
import Pages.PracticePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Pages.ESPNPage;

import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;


public class PracticeSteps extends BaseSteps{

    PracticePage practicePage = PageFactory.initElements(webDriver, PracticePage.class);

    public PracticeSteps(WebDriver _webDriverBaseStep) {
        super(_webDriverBaseStep);
    }


    public boolean getTextFirstNameElement(){
        WebElement firstNameElement = practicePage.TextBoxFirstNameElement();
        return firstNameElement.isDisplayed();
    }

}
