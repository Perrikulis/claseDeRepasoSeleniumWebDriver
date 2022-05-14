package Pages;

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

    //  TITUTLOS
    private final String XPATHselector_international_title = "//*[@id='internationals']";
    private final String XPATHselector_soutamerica_title = "//*[@id='southAmerica']";

    //  ELEMENTOS o EQUIPOS
    private final String XPATHSElector_europe = "//h3[@id=\"europe\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2";
    private final String XPATHSElector_international = "//h3[@id=\"internationals\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2";
    private final String XPATHSElector_southAmerica = "//h3[@id=\"southAmerica\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2";

    private String XPATHselector_mexicoConcacaf = "//h3[@id=\"usaMexicoCONCACAF\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2";

    // Get elements with PageFactory
    @FindBy(how = How.XPATH, using = "//*[@id='usaMexicoCONCACAF']")
    private WebElement tittleMexicoConcacaf;

    @FindBy(how = How.XPATH, using = "//*[@id='europe']")
    private WebElement titleEurope;

    @FindBy(how = How.XPATH, using = "//*[@id='internationals']")
    private WebElement titleInternational;

    @FindBy(how = How.XPATH, using = "//*[@id='usaMexicoCONCACAF']")
    private WebElement titleMexicoConcacaf;

    @FindBy(how = How.XPATH, using = "//*[@id='southAmerica']")
    private WebElement titleSouthAmerica;

    @FindBy(how = How.XPATH, using = "//h3[@id=\"usaMexicoCONCACAF\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2")
    private List<WebElement> leaguesMexicoConcacaf;

    @FindBy(how = How.XPATH, using = "//h3[@id=\"europe\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2")
    private List<WebElement> leaguesEurope;

    @FindBy(how = How.XPATH, using = "//h3[@id=\"internationals\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2")
    private List<WebElement> leaguesInternational;

    @FindBy(how = How.XPATH, using = "//h3[@id=\"southAmerica\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2")
    private List<WebElement> leaguesSouthAmerica;

    // ========    TITULOS ==================
    public WebElement MexicoConcacaftitle(){ return tittleMexicoConcacaf; }

    public WebElement europaTitle(){ return titleEurope; }

    public WebElement internationalTitle(){ return titleInternational; }

    public WebElement soutAmericaTitle(){ return titleSouthAmerica; }

    //================    ELEMENTOS  =======================
    public List<WebElement> MexicoConcacafElements(){
        return leaguesMexicoConcacaf;
    }

    public List<WebElement> europeElements(){
        return leaguesEurope;
    }

    public List<WebElement> internationalElements(){
        return leaguesInternational;
    }

    public List<WebElement> southAmericaElements(){
        return leaguesSouthAmerica;
    }

}
