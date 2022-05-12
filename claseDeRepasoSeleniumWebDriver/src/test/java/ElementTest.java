import Steps.ElementSteps;
import Steps.LandingsSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementTest extends BaseTest{
    ElementSteps elementSteps = new ElementSteps(webDriver);
    LandingsSteps landingsSteps =new LandingsSteps(webDriver);

    @Test
    public void testFormElements() {
        landingsSteps.clickOption(0);
        elementSteps.clickOptionTextBox(0);
        System.out.println(elementSteps.getTextFullName());
        Assert.assertEquals(elementSteps.getTextFullName(), "Full Name");
    }

    @Test
    public void testDropDown() {
        webDriver.get("https://demoqa.com/select-menu");
        // Select by visibleText: Aqua -> Aqua
        elementSteps.selectFavoriteColor("Aqua");
        System.out.println("Selected option is: " + elementSteps.getSelectedColor());
        //Select by index: 3 -> Yellow
        elementSteps.selectFavoriteColorIndex(3);
        System.out.println("Selected option is: " + elementSteps.getSelectedColor());
        //Select by value: 9 -> Magenta
        elementSteps.selectFavoriteColorValue("9");
        System.out.println("Selected option is: " + elementSteps.getSelectedColor());
        //Print if Select object is multiple
        System.out.println("Is Select multiple? " + elementSteps.isSelectMultiple());
    }

    /** Test que valida el Drop Down para la selección de carros
     */
    @Test
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
