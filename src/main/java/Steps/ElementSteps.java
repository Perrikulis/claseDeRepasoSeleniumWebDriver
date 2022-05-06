package Steps;

import Pages.LandingPage;
import org.openqa.selenium.WebDriver;
import Pages.ElementsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ElementSteps extends BaseSteps {

    ElementsPage elementsPage = new ElementsPage(webDriver);
    LandingPage landingPage = new LandingPage(webDriver);

    public ElementSteps(WebDriver webDriver) {
        super(webDriver);
    }

    //Validar que la opcion de TextBox este disponible.
    public String getText() {
        String texto = elementsPage.getElementOption().getText();
        return texto;
    }

    public void clickTextBoxOpt() {
        elementsPage.getElementTBOpt().click();
    }

    //obtener los textos de los resultados
    public String getTextResultName() {
        String texto = elementsPage.getResultName().getText();
        return texto;
    }

    public String getTextResultEmail() {
        String texto = elementsPage.getResultEmail().getText();
        return texto;
    }

    public String getTextResultCurrentAddress() {
        String texto = elementsPage.getResultcurrentAddress().getText();
        return texto;
    }

    public String getTextResultPermanAddress() {
        String texto = elementsPage.getResultpermanAddress().getText();
        return texto;
    }

    //Validar que este el campo Full Name
    public String getTextFullName() {
        String texto = elementsPage.getFieldFullName().getText();
        return texto;
    }

    //Validar que este el campo Email
    public String getTextEmail() {
        String texto = elementsPage.getFieldEmail().getText();
        return texto;
    }

    //Validar que este el campo Current Address
    public String getTextCurrentAddress() {
        String texto = elementsPage.getFieldCurrentAddress().getText();
        return texto;
    }

    //Validar que este el campo Permanent Address
    public String getTextPermanentAddress() {
        String texto = elementsPage.getFieldPermanentAddress().getText();
        return texto;
    }

    public String getTextSubmit() {
        String texto = elementsPage.getButtonSubmit().getText();
        return texto;
    }

    public void clickBtmSubmit() {
        elementsPage.getBtnSubmit().click();
    }

    //optener output value del resultado Requ 3 y 4
    public boolean getoutputPresent() {
        boolean present = elementsPage.getOutPut().isDisplayed();
        return present;
    }
}