package Steps;

import Pages.ElementsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ElementSteps extends BaseSteps {

    ElementsPage elementsPage = new ElementsPage(webDriver);

    //Constructor
    public ElementSteps(WebDriver webDriver) {
        super(webDriver);
    }

    //Validar que esté presente la opción TextBox
    public String getElementText() {
        String elementText = elementsPage.getElementOption().getText();
        return elementText;
    }

    public void clickTextBoxOption() {
        elementsPage.getElementOption().click();
    }

    public Boolean fullNameInputIsDisplayed() {
        Boolean fullNameInput = elementsPage.getFullNameInput().isDisplayed();
        return  fullNameInput;
    }

    public Boolean emailInputIsDisplayed() {
        Boolean emailInput = elementsPage.getEmailInput().isDisplayed();
        return emailInput;
    }

    public Boolean currentAddressTextAreaIsDisplayed() {
        Boolean currentAddressTextArea = elementsPage.getCurrentAddressTextArea().isDisplayed();
        return currentAddressTextArea;
    }

    public Boolean permanentAddressTextAreaIsDisplayed() {
        Boolean permanentAddressTextArea = elementsPage.getPermanentAddressTextArea().isDisplayed();
        return permanentAddressTextArea;
    }

    public Boolean submitButtonIsDisplayed() {
        Boolean submitButton = elementsPage.getSubmitButton().isDisplayed();
        return submitButton;
    }

    public void fillFullNameInput(String name) {
        elementsPage.getFullNameInput().sendKeys(name);
    }

    public void fillEmailInput(String email) {
        elementsPage.getEmailInput().sendKeys(email);
    }

    public void fillCurrentAddressTextArea(String address) {
        elementsPage.getCurrentAddressTextArea().sendKeys(address);
    }

    public void fillPermanentAddressTextArea(String address) {
        elementsPage.getPermanentAddressTextArea().sendKeys(address);
    }

    public void clickSubmitButton() {
        elementsPage.getSubmitButton().click();
    }

    public Boolean emailResultIsDisplayed() {
        return elementsPage.getEmailResult().isDisplayed();
    }

    public void selectFavoriteColorByVisibleText(String color) {
        Select dropDownColors = elementsPage.getDropDownColors();
        dropDownColors.selectByVisibleText(color);
    }

    public void selectFavoriteColorByIndex(Integer index) {
        Select dropDownColors = elementsPage.getDropDownColors();
        dropDownColors.selectByIndex(index);
    }

    public void selectFavoriteColorByValue(String value) {
        Select dropDownColors = elementsPage.getDropDownColors();
        dropDownColors.selectByValue(value);
    }

    public boolean isColorSelectMultiple() {
        Select dropDownColors = elementsPage.getDropDownColors();
        return dropDownColors.isMultiple();
    }

    public String getSelectedColor() {
        Select dropDownColors = elementsPage.getDropDownColors();
        WebElement selectedOption = dropDownColors.getFirstSelectedOption();
        return selectedOption.getText();
    }

    public void selectFavoriteCarByVisibleText(String brand) {
        Select dropDownCars = elementsPage.getDropDownCars();
        dropDownCars.selectByVisibleText(brand);
    }

    public void selectFavoriteCarByIndex(Integer index) {
        Select dropDownCars = elementsPage.getDropDownCars();
        dropDownCars.selectByIndex(index);
    }

    public void selectFavoriteCarByValue(String value) {
        Select dropDownCars = elementsPage.getDropDownCars();
        dropDownCars.selectByValue(value);
    }

    public boolean isCarSelectMultiple() {
        Select dropDownCars = elementsPage.getDropDownCars();
        return dropDownCars.isMultiple();
    }

    public List<String> getSelectedCar() {
        List<String> getSelectedOptions = new ArrayList<>();
        Select dropDownCars = elementsPage.getDropDownCars();
        List<WebElement> selectedOptionList = dropDownCars.getAllSelectedOptions();
        //Llenando lista getSelectedOptions
        for (WebElement option: selectedOptionList) {
            getSelectedOptions.add(option.getText());
        }

        return getSelectedOptions;
    }
}
