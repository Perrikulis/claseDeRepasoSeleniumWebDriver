import Pages.ElementsPage;
import Steps.ElementSteps;
import Steps.LandingsSteps;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ElementTest extends BaseTest {

    ElementSteps elementStep = new ElementSteps(webDriver);
    LandingsSteps landingStep = new LandingsSteps(webDriver);
    ElementsPage elementsPage = new ElementsPage(webDriver);

    //Req 2--When Clicking option elements, Text Box option menu must be displayed on menu on left
    @Test(description = "Test form is present in TextBox menu option",groups = {"SmokeTests"})
    public void testFormElements() {
        landingStep.clicOPtion(0);
        elementStep.clickTextBoxOpt();
        System.out.println(elementStep.getTextFullName());
        Assert.assertEquals(elementStep.getTextFullName(), "Full Name");
        System.out.println(elementStep.getTextEmail());
        Assert.assertEquals(elementStep.getTextEmail(), "Email");
        System.out.println(elementStep.getTextCurrentAddress());
        Assert.assertEquals(elementStep.getTextCurrentAddress(), "Current Address");
        System.out.println(elementStep.getTextPermanentAddress());
        Assert.assertEquals(elementStep.getTextPermanentAddress(), "Permanent Address");
        System.out.println(elementStep.getTextSubmit());
        Assert.assertEquals(elementStep.getTextSubmit(), "Submit");
    }

    //Req 3--When invalid email is input in Text Box form and clicking sugmit button, form must no be submitted
    @Test(description = "Test form outcome is not present when user entered an invalid value for email", groups = {"SmokeTests"})
    public void testFormSubmitInvalidEmail() {
        Reporter.log("This Log es una prueba**********---- *********");
        Reporter.log("This Log es una prueba**********---- *********");
        landingStep.clicOPtion(0);
        elementStep.clickTextBoxOpt();
        elementsPage.getFielTBdFullName().sendKeys("Mario Veri");
        elementsPage.getFielTBdemail().sendKeys("mari123");
        elementsPage.getFielTBcurrentAddress().sendKeys("Cameli123456");
        elementsPage.getFielTBpermanentAddress().sendKeys("National789");
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,500)");
        elementStep.clickBtmSubmit();

        Assert.assertFalse(elementStep.getoutputPresent());
    }

    //Req 4--When valid mail is input in Text Box form, clicking submit button will display information form
    @Test(description = "Test form outcome is present correctly, when user entered an invalid value for email", groups = {"SmokeTests"})
    public void testFormSubmitValidEmail() {
        landingStep.clicOPtion(0);
        elementStep.clickTextBoxOpt();

        elementsPage.getFielTBdFullName().sendKeys("Mario Veriss");
        elementsPage.getFielTBdemail().sendKeys("123@ss.com");
        elementsPage.getFielTBcurrentAddress().sendKeys("Camelina 123");
        elementsPage.getFielTBpermanentAddress().sendKeys("Maximi 123");
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,500)");
        elementStep.clickBtmSubmit();

        Assert.assertTrue(elementStep.getoutputPresent());

        System.out.println(elementStep.getTextResultName());
        Assert.assertEquals(elementStep.getTextResultName(), "Name:Mario Veri");
        System.out.println(elementStep.getTextResultEmail());
        Assert.assertEquals(elementStep.getTextResultEmail(), "Email:123@ss.com");
        System.out.println(elementStep.getTextResultCurrentAddress());
        Assert.assertEquals(elementStep.getTextResultCurrentAddress(), "Current Address :Camelina 123");
        System.out.println(elementStep.getTextResultPermanAddress());
        Assert.assertEquals(elementStep.getTextResultPermanAddress(), "Permananet Address :Maximi 123");
    }

}
