package Steps;

import org.openqa.selenium.WebDriver;
import Pages.ElementsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ElementSteps extends BaseSteps {
    ElementsPage elementsPage = new ElementsPage(webDriver);

    public ElementSteps(WebDriver webDriver) {
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

    //Seleccionar color favorito por texto visible
    public void selectFavoriteColor(String color) {
        Select dropDownColors = elementsPage.getDropDownColors();
        dropDownColors.selectByVisibleText(color);
    }

    //Seleccionar color favorito por indice
    public void selectFavoriteColorIndex(int index) {
        Select dropDownColors = elementsPage.getDropDownColors();
        dropDownColors.selectByIndex(index);
    }

    //Seleccionar color por valor (value="X")
    public void selectFavoriteColorValue(String value) {
        Select dropDownColors = elementsPage.getDropDownColors();
        dropDownColors.selectByValue(value);
    }

    //Regresar si el Select de colors es multiple
    public boolean isSelectMultiple(){
        Select dropDownColors = elementsPage.getDropDownColors();
        return dropDownColors.isMultiple();
    }

    //Obtener opcion seleccionada del Select color
    public String getSelectedColor() {
        Select dropDownColors = elementsPage.getDropDownColors();
        WebElement selectedOption = dropDownColors.getFirstSelectedOption();
        return selectedOption.getText();
    }

    //Obtener opcion seleccionada del Select color
    public List<String> getSelectedCarList() {
        List<String> getSelectedOptions = new ArrayList<>();
        Select dropDownColors = elementsPage.getDropDownColors();
        List<WebElement> selectedOptionList = dropDownColors.getAllSelectedOptions();
        //Llenando lista getSelectedOptions
        for (WebElement option: selectedOptionList
             ) {
            //Obteniendo .getText de cada opcion seleccionada
            getSelectedOptions.add(option.getText());
        }
        return getSelectedOptions;
    }
    public void selectCar(String car){
        Select dropDownCars = elementsPage.getDropDownCars();
        dropDownCars.selectByVisibleText(car);
    }
    /** DropDown selected by Index
     */
    public void selectCarByIndex(int index){
        Select dropDownCars = elementsPage.getDropDownCars();
        dropDownCars.selectByIndex(index);
    }
    /** DropDown selected by Value
     */
    public void selectCarByValue(String car){
        Select dropDownCars = elementsPage.getDropDownCars();
        dropDownCars.selectByValue(car);
    }
    /** DropDown validate if Select Multiple
     */
    public Boolean isSelectMultipleCars(){
        Select dropDownCars = elementsPage.getDropDownCars();
        return dropDownCars.isMultiple();
    }
    /** DropDown return option selected
     */
    public String getSelectedCar(){
        Select dropDownCars = elementsPage.getDropDownCars();
        WebElement selectedCarOption = dropDownCars.getFirstSelectedOption();
        return selectedCarOption.getText();
    }
}
