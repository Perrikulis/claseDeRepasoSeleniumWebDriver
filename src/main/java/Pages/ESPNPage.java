package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import java.util.List;

public class ESPNPage {
    WebDriver webDriverHome;

    public ESPNPage(WebDriver webDriverHome) {
        this.webDriverHome = webDriverHome;
    }

    //  TITULOS
    // private final String XPATHselector_mexicoConcacaf_title = "//*[@id='usaMexicoCONCACAF']";
    // private final String XPATHselector_europe_title = "//*[@id='europe']";
    // private final String XPATHselector_international_title = "//*[@id='internationals']";
    // private final String XPATHselector_soutamerica_title = "//*[@id='southAmerica']";

    //  ELEMENTOS
    // private final String XPATHSElector_europe = "//h3[@id=\"europe\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2";
    // private final String XPATHSElector_international = "//h3[@id=\"internationals\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2";
    // private final String XPATHSElector_southAmerica = "//h3[@id=\"southAmerica\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2";
    // private String XPATHselector_mexicoConcacaf = "//h3[@id=\"usaMexicoCONCACAF\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2";

    //  TITULOS Ya se terminó de pasar
    @FindBy(how = How.XPATH, using = "//*[@id='usaMexicoCONCACAF']")
    private WebElement titleConcacaf;

    @FindBy(how = How.XPATH, using = "//*[@id='europe']")
    private WebElement titleEurope;

    @FindBy(how = How.XPATH, using = "//*[@id='internationals']")
    private WebElement titleInternational;

    @FindBy(how = How.XPATH, using = "//*[@id='southAmerica']")
    private WebElement titleSouthAmerica;


    //  ELEMENTOS Faltan 4 Elementos

    @FindBy(how = How.XPATH, using = "//h3[@id=\"europe\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2")
    private List<WebElement> selectorEurope;

    @FindBy(how = How.XPATH, using = "//h3[@id=\"internationals\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2")
    private List<WebElement> selectorInternational;

    @FindBy(how = How.XPATH, using = "//h3[@id=\"southAmerica\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2" )
    private List<WebElement> selectorSouthAmerica;

    @FindBy(how = How.XPATH, using = "//h3[@id=\"usaMexicoCONCACAF\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2")
    private List<WebElement> selectorConcacaf;


    // ======== TITULOS =================

    public WebElement MexicoConcacaftitle(){ return titleConcacaf;}

    public WebElement europaTitle(){ return titleEurope;}

    public WebElement internationalTitle(){return titleInternational;}

    public WebElement soutAmericaTitle(){return titleSouthAmerica; }

    //================    ELEMENTOS Faltan 4  =======================

    public List<WebElement> europeElements(){ return selectorEurope;}

    public List<WebElement> internationalElements(){ return selectorInternational; }

    public List<WebElement> southAmericaElements(){ return selectorSouthAmerica; }

    public List<WebElement> MexicoConcacafElements(){ return selectorConcacaf;}

}
