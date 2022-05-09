package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ESPNPage {
    WebDriver webDriverHome;

    public ESPNPage(WebDriver webDriverHome) {
        this.webDriverHome = webDriverHome;
    }

    //  TITUTLOS
    private final String XPATHselector_mexicoConcacaf_title = "//*[@id='usaMexicoCONCACAF']";
    private final String XPATHselector_europe_title = "//*[@id='europe']";
    private final String XPATHselector_international_title = "//*[@id='internationals']";
    private final String XPATHselector_soutamerica_title = "//*[@id='southAmerica']";

    //  ELEMENTOS
    private final String XPATHSElector_europe = "//h3[@id=\"europe\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2";
    private final String XPATHSElector_international = "//h3[@id=\"internationals\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2";
    private final String XPATHSElector_southAmerica = "//h3[@id=\"southAmerica\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2";

    private String XPATHselector_mexicoConcacaf = "//h3[@id=\"usaMexicoCONCACAF\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2";


    // ========    TITULOS ==================
    public WebElement MexicoConcacaftitle(){
        return webDriverHome.findElement(By.xpath(XPATHselector_mexicoConcacaf_title));
    }

    public WebElement europaTitle(){
        return webDriverHome.findElement(By.xpath(XPATHselector_europe_title));
    }

    public WebElement internationalTitle(){
        return webDriverHome.findElement(By.xpath(XPATHselector_international_title));
    }

    public WebElement soutAmericaTitle(){
        return webDriverHome.findElement(By.xpath(XPATHselector_soutamerica_title));
    }



    //================    ELEMENTOS  =======================
    public List<WebElement> MexicoConcacafElements(){
        return webDriverHome.findElements(By.xpath(XPATHselector_mexicoConcacaf));
    }

    public List<WebElement> europeElements(){
        return webDriverHome.findElements(By.xpath(XPATHSElector_europe));
    }

    public List<WebElement> internationalElements(){
        return webDriverHome.findElements(By.xpath(XPATHSElector_international));
    }

    public List<WebElement> southAmericaElements(){
        return webDriverHome.findElements(By.xpath(XPATHSElector_southAmerica));
    }



}
