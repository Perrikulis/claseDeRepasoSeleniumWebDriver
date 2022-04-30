package Steps;

import org.openqa.selenium.WebDriver;
import Pages.elementsPage;

public class elementSteps extends baseSteps{
    elementsPage elementsPage=new elementsPage(webDriver);

    public elementSteps(WebDriver webDriver) {
        super(webDriver);
    }
    //Validar que este la opcion Text Box
    public String getText(){
        String texto = elementsPage.getElementOption().getText();
        return texto;
    }
    //Dar clic en la opcion Text Box
    public void clickOptionTextBox(int option){
        elementsPage.getMenuOptionsElements().get(option).click();
    }
    //Validar que este el campo Full Name
    public String getTextFullName(){
        String texto = elementsPage.getElementFullName().getText();
        return texto;
    }
    //Validar que este el campo Email
    public String getTextEmail(){
        String texto = elementsPage.getElementEmail().getText();
        return texto;
    }
    //Validar que este el campo Current Address
    public String getTextCurrentAddress(){
        String texto = elementsPage.getElementCurrentAddress().getText();
        return texto;
    }
    //Validar que este el campo Permanent Address
    public String getTextPermanentAddress(){
        String texto = elementsPage.getElementPermanentAddress().getText();
        return texto;
    }
    //Validar que este el boton Submit
    public String getTextSubmit(){
        String texto = elementsPage.getElementSubmit().getText();
        return texto;
    }
}
