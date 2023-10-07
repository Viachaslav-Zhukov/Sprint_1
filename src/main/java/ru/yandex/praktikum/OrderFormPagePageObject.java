package ru.yandex.praktikum;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.text;

public class OrderFormPagePageObject {
    //локатор поля ввода имя
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Имя']")
    public SelenideElement nameField;
    //локатор поля ввода фамилия
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Фамилия']")
    public SelenideElement surnameField;
    //локатор поля ввода адрес
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Адрес: куда привезти заказ']")
    public SelenideElement addressField;
    //локатор поля метро
    @FindBy(how = How.XPATH, using = ".//input[@class='select-search__input']")
    public SelenideElement metroField;
    //локатор поля ввода телефон
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Телефон: на него позвонит курьер']")
    public SelenideElement telephoneField;
    //локатор кнопки Далее
    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    public SelenideElement nextButton;
    //локатор станции метро
    @FindBy(how = How.XPATH, using = ".//*[text()='Сокольники']")
    public SelenideElement metroStation;
    //локатор поля календаря
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Когда привезти самокат']")
    public SelenideElement calendarField;
    //локатор даты заказа
    @FindBy(how = How.XPATH, using = ".//*[text()='29']")
    public SelenideElement orderDate;
    //локатор поля срок аренды
    @FindBy(how = How.CLASS_NAME, using = "Dropdown-placeholder")
    public SelenideElement rentalPeriodField;
    //локатор количества дней аренды
    @FindBy(how = How.XPATH, using = ".//*[text()='сутки']")
    public SelenideElement optionRentalPeriod;
    //локатор количество дней аренды №2
    @FindBy(how = How.XPATH, using = ".//*[text()='двое суток']")
    public SelenideElement optionRentalPeriodTwo;
    //локатор цвета самоката
    @FindBy(how = How.ID, using = "black")
    public SelenideElement scooterColor;
    //локатор цвета самоката №2
    @FindBy(how = How.ID, using = "grey")
    public SelenideElement scooterColorGray;
    //локатор поля комментарий
    @FindBy(how = How.XPATH, using = ".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']")
    public SelenideElement commentField;
    //локатор кнопки Заказать
    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    public SelenideElement orderButtonBelow;
    //локатор кнопки Да
    @FindBy(how = How.XPATH, using = ".//button[text()='Да']")
    public SelenideElement yesButton;
    //локатор всплывающего окна оформленного заказа
    @FindBy(how = How.XPATH, using = ".//div[@class='Order_ModalHeader__3FDaJ']")
    public SelenideElement orderHeader;

    //метод ввода имя
    public void setNameField(String name) {
        nameField.setValue(name);
    }

    //метод ввода фамилии
    public void setSurnameField(String surname) {
        surnameField.setValue(surname);
    }

    //метод ввода адреса
    public void setAddressField(String address) {
        addressField.setValue(address);
    }

    //метод ввода телефона
    public void setTelephoneField(String telephone) {
        telephoneField.setValue(telephone);
    }

    //метод ввода комментария
    public void setCommentField(String comment) {
        commentField.setValue(comment);
    }

    //метод выбора станции метро
    public void clickMetroField() {
        metroField.click();
        metroStation.click();
    }

    //метод клика на кнопку Далее
    public void clickNextButton() {
        nextButton.click();
    }

    //метод выбора даты заказа
    public void clickOrderData() {
        calendarField.click();
        orderDate.click();
    }

    //метод выбора срока аренды
    public void clickRentalPeriodField() {
        rentalPeriodField.click();
        optionRentalPeriod.click();
    }

    //метод выбора срока аренды№2
    public void clickRentalPeriodFieldTwo() {
        rentalPeriodField.click();
        optionRentalPeriodTwo.click();
    }

    //метод выбора цвета самоката
    public void clickScooterColor() {
        scooterColor.click();
    }

    //метод выбора цвета самоката №2
    public void clickScooterColorGrey() {
        scooterColorGray.click();
    }

    //метод клика на кнопку Заказать
    public void clickOrderButtonBelow() {
        orderButtonBelow.click();
    }

    //метод клика на кнопку Да
    public void clickYesButton() {
        yesButton.click();
    }

    //метод проверки текста успешного оформления заказа
    public void textOrderHeader() {
        orderHeader.shouldHave(text("Заказ оформлен"));
    }

    //метод заполнения и оформления заказа
    public void fillOutTheScooterOrderForm(String name, String surname, String address, String telephone, String comment) {
        setNameField(name);
        setSurnameField(surname);
        setAddressField(address);
        clickMetroField();
        setTelephoneField(telephone);
        clickNextButton();
        clickOrderData();
        clickRentalPeriodField();
        clickScooterColor();
        setCommentField(comment);
        clickOrderButtonBelow();
        clickYesButton();
        textOrderHeader();
    }

    //метод заполнения и оформления заказа №2
    public void fillOutTheScooterOrderFormTwo(String name, String surname, String address, String telephone, String comment) {
        setNameField(name);
        setSurnameField(surname);
        setAddressField(address);
        clickMetroField();
        setTelephoneField(telephone);
        clickNextButton();
        clickOrderData();
        clickRentalPeriodFieldTwo();
        clickScooterColorGrey();
        setCommentField(comment);
        clickOrderButtonBelow();
        clickYesButton();
        textOrderHeader();
    }


}
