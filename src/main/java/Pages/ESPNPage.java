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


    // XPATH  TITULOS
    @FindBy(how = How.XPATH, using = "//*[@id='usaMexicoCONCACAF']")
    private WebElement titleMexicoConcacaf;

    @FindBy(how = How.XPATH, using = "//*[@id='europe']")
    private WebElement titleEurope;

    @FindBy(how = How.XPATH, using = "//*[@id='internationals']")
    private WebElement titleInternational;

    @FindBy(how = How.XPATH, using = "//*[@id='southAmerica']")
    private WebElement titleSouthAmerica;



    //  ELEMENTOS
    @FindBy(how = How.XPATH, using = "//h3[@id=\"usaMexicoCONCACAF\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2")
    private List<WebElement> mexicoConcacaf_elements;

    @FindBy(how = How.XPATH, using = "//h3[@id=\"europe\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2")
    private List<WebElement> europe_elements;

    @FindBy(how = How.XPATH, using = "//h3[@id=\"internationals\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2")
    private List<WebElement> international_elements;

    @FindBy(how = How.XPATH, using = "//h3[@id=\"southAmerica\"]/following-sibling::div[@class=\"layout is-split\"][1]//h2")
    private List<WebElement> soutAmerica_elements;





    // ========    TITULOS ==================
    public WebElement MexicoConcacaftitle(){
        return titleMexicoConcacaf;
    }

    public WebElement europaTitle(){
        return titleEurope;
    }

    public WebElement internationalTitle(){
        return titleInternational;
    }

    public WebElement soutAmericaTitle(){
        return titleSouthAmerica;
    }



    //================    ELEMENTOS  =======================
    public List<WebElement> MexicoConcacafElements(){
        return mexicoConcacaf_elements;
    }

    public List<WebElement> europeElements(){
        return europe_elements;
    }

    public List<WebElement> internationalElements(){
        return international_elements;
    }

    public List<WebElement> southAmericaElements(){
        return soutAmerica_elements;
    }



}
