package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class SPNFutbolPage extends BasePage {

    public SPNFutbolPage(WebDriver webDriver) {
        super(webDriver);
    }

    //  TITUTLOS
    @FindBy(how = How.XPATH, using = "//*[@id='usaMexicoCONCACAF']")
    private WebElement XPATHselector_mexicoConcacaf_title;
    @FindBy(how = How.XPATH, using = "//*[@id='europe']")
    private WebElement XPATHselector_europe_title;
    @FindBy(how = How.XPATH, using = "//*[@id='internationals']")
    private WebElement XPATHselector_international_title;
    @FindBy(how = How.XPATH, using = "//*[@id='southAmerica']")
    private WebElement XPATHselector_soutamerica_title;


    //  ELEMENTOS
    @FindBy(how = How.XPATH, using = "//h3[@id=\"europe\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2")
    private WebElement XPATHSElector_europe;
    @FindBy(how = How.XPATH, using = "//h3[@id=\"internationals\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2")
    private WebElement XPATHSElector_international;
    @FindBy(how = How.XPATH, using = "//h3[@id=\"southAmerica\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2")
    private WebElement XPATHSElector_southAmerica;
    @FindBy(how = How.XPATH, using = "//h3[@id=\"usaMexicoCONCACAF\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2")
    private WebElement XPATHselector_mexicoConcacaf;

    // ========    TITULOS ==================
    public WebElement MexicoConcacaftitle(){
        //return webDriver.findElement(By.xpath(XPATHselector_mexicoConcacaf_title));
        return XPATHselector_mexicoConcacaf_title;
    }

    public WebElement europaTitle(){
        //return webDriver.findElement(By.xpath(XPATHselector_europe_title));
        return XPATHselector_europe_title;
    }

    public WebElement internationalTitle(){
        //return webDriver.findElement(By.xpath(XPATHselector_international_title));
        return XPATHselector_international_title;
    }

    public WebElement soutAmericaTitle(){
        //return webDriver.findElement(By.xpath(XPATHselector_soutamerica_title));
        return XPATHselector_soutamerica_title;
    }

    //================    ELEMENTOS  =======================
    public List<WebElement> MexicoConcacafElements(){
        //return webDriver.findElements(By.xpath(XPATHselector_mexicoConcacaf));
        return (List<WebElement>) XPATHselector_mexicoConcacaf;
    }

    public List<WebElement> europeElements(){
       // return webDriver.findElements(By.xpath(XPATHSElector_europe));
        return (List<WebElement>) XPATHSElector_europe;
    }

    public List<WebElement> internationalElements(){
       // return webDriver.findElements(By.xpath(XPATHSElector_international));
        return (List<WebElement>) XPATHSElector_international;
    }

    public List<WebElement> southAmericaElements(){
        //return webDriver.findElements(By.xpath(XPATHSElector_southAmerica));
        return (List<WebElement>) XPATHSElector_southAmerica;
    }



}