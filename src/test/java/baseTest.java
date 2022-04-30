import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseTest {
    private String pathToChromeDriver = "/Users/jxr20920/Downloads/chromedriver";

    public WebDriver webDriver = getChromeWebDriver();

    private WebDriver getChromeWebDriver() {
        System.setProperty("webdriver.chrome.driver",pathToChromeDriver);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        DesiredCapabilities desiredCapabilities= new DesiredCapabilities();
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY,chromeOptions);
        chromeOptions.merge(desiredCapabilities);
        return new ChromeDriver(chromeOptions);
    }

    @BeforeClass
    public void beforeClass() {
        webDriver.get("https://demoqa.com/");
        webDriver.manage().window().maximize();
    }

    @AfterClass
    public void afterClass() {
        webDriver.quit();
    }
}
