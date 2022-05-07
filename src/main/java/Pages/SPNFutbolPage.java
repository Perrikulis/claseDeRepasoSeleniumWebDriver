package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SPNFutbolPage extends BasePage {

    public SPNFutbolPage(WebDriver webDriver) {
        super(webDriver);
    }

    private String mexicoLeageTitleXpath = "//h3[@id=\"usaMexicoCONCACAF\"]";
    private String listMexLeageXpath = "//h3[@id=\"usaMexicoCONCACAF\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2";

    public WebElement getMexLeageTitle() {
        WebElement mexLeageTitle = webDriver.findElement(By.xpath(mexicoLeageTitleXpath));
        return mexLeageTitle;
    }

    public List<WebElement> getMexLeageTitleOpt() {
        List<WebElement> listMexLeageOpts = webDriver.findElements(By.xpath(listMexLeageXpath));
        return listMexLeageOpts;

    }}