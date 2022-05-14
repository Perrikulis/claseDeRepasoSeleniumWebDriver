import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {
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

    public String getPropertyValue(String nameOfProperty) throws IOException {
        Properties demoQAProperties = new Properties();
        InputStream propertiesFilePath = new FileInputStream("demoqa-values.properties");
        demoQAProperties.load(propertiesFilePath);
        String propertyValue = demoQAProperties.getProperty(nameOfProperty);
        propertiesFilePath.close();
        return propertyValue;
    }

    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        webDriver.get("https://demoqa.com/");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        System.out.println("Before test");
    }

    @AfterMethod(alwaysRun = true)
    public void afterTest() {
        webDriver.quit();
    }

}
