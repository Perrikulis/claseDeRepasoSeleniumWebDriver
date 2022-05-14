import Steps.ElementSteps;
import Steps.LandingsSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ElementTest extends BaseTest{
    ElementSteps elementSteps = new ElementSteps(webDriver);
    LandingsSteps landingsSteps =new LandingsSteps(webDriver);

    @Test(description = "Test form is present in Text Box menu option in demoqa.com site")
    public void testFormElements() {
        landingsSteps.clickOption(0);
        elementSteps.clickOptionTextBox(0);
        System.out.println(elementSteps.getTextFullName());
        Assert.assertEquals(elementSteps.getTextFullName(), "Full Name");
    }

    @Test(description = "Testing Color drop down in demoqa.com site")
    public void testDropDown() throws IOException {
        String url = getPropertyValue("URL_TEST_DROP_DOWN");
        webDriver.get(url);
        // Select by visibleText: Aqua -> Aqua
        elementSteps.selectFavoriteColor("Aqua");
        System.out.println("Selected option is: " + elementSteps.getSelectedColor());
        //Select by index: 3 -> Yellow
        elementSteps.selectFavoriteColorIndex(3);
        System.out.println("Selected option is: " + elementSteps.getSelectedColor());
        //Select by value: 9 -> Magenta
        elementSteps.selectFavoriteColorValue("9");
        System.out.println("Selected option is: " + elementSteps.getSelectedColor());
        Assert.assertEquals(elementSteps.getSelectedColor(), getPropertyValue("DROP_DOWN_EXPECTED_COLOR"));
        //Print if Select object is multiple
        System.out.println("Is Select multiple? " + elementSteps.isSelectMultiple());
    }

    /** Test que valida el Drop Down para la selección de carros
     */
    @Test (description = "Test Drop Down (Select) from Cars", groups = "DropDownTest")
    public void dropDownCarTest(){
        webDriver.get("https://demoqa.com/select-menu");
        elementSteps.selectCar("Audi");
        System.out.println("El carro seleccionado es: " + elementSteps.getSelectedCar());
        //Select by index: 3
        elementSteps.selectCarByIndex(2);
        System.out.println("El carro seleccionado es: " + elementSteps.getSelectedCar());
        //Select by value: 9
        elementSteps.selectCarByValue("saab");
        System.out.println("El carro seleccionado es: " + elementSteps.getSelectedCar());
        //Print if Select object is multiple
        System.out.println("Is Select multiple? " + elementSteps.isSelectMultipleCars());
    }
}
