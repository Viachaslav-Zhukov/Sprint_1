package ru.yandex.praktikum;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.exactText;

public class ElementsOfTheMainPagePartTwoPageObject {
    //сохраняем URL главной страницы
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";
    //локатор кнопки куки
    @FindBy(how = How.ID, using = "rcc-confirm-button")
    public SelenideElement cookieButton;
    //лого "Яндекс" в шапке
    @FindBy(how = How.XPATH, using = ".//img[@alt='Yandex']")
    private SelenideElement yandexLogo;
    //лого "Самокат" в шапке
    @FindBy(how = How.XPATH, using = ".//img[@alt='Scooter']")
    private SelenideElement scooterLogo;
    //кнопка "Заказать" в шапке
    @FindBy(how = How.CLASS_NAME, using = "Button_Button__ra12g")
    private SelenideElement orderFirstButton;
    //кнопка "Статус заказа" в шапке
    @FindBy(how = How.XPATH, using = ".//button[text()='Статус заказа']")
    private SelenideElement orderStatusButton;
    //заголовок, блок "Самокат на пару дней"
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_Header__iJKdX']")
    private SelenideElement blockHeaderOne;
    //изображение самоката, блок "Самокат на пару дней"
    @FindBy(how = How.XPATH, using = ".//img[@alt='Scooter blueprint']")
    private SelenideElement scooterImage;
    //заголовок, блок "Как это работает"
    @FindBy(how = How.XPATH, using = ".//div[text()='Как это работает']")
    private SelenideElement titleOfBlockTwo;
    //блок "Как это работает", круг статуса "1"
    @FindBy(how = How.XPATH, using = ".//div[text()='1']")
    private SelenideElement circleStatus_1;
    //блок "Как это работает", название статуса "1"
    @FindBy(how = How.XPATH, using = ".//div[text()='Заказываете самокат']")
    private SelenideElement orderScooterStatus;
    //блок "Как это работает", описание статуса "1"
    @FindBy(how = How.CSS, using = ".Home_StatusDescription__3WGl5")
    private SelenideElement descriptionOfStatus_1;
    //блок "Как это работает", круг статуса "2"
    @FindBy(how = How.XPATH, using = ".//div[text()='2']")
    private SelenideElement circleStatus_2;
    //блок "Как это работает", название статуса "2"
    @FindBy(how = How.XPATH, using = ".//div[text()='Курьер привозит самокат']")
    private SelenideElement StatusCourierBringsScooter;
    //блок "Как это работает", описание статуса "2"
    @FindBy(how = How.XPATH, using = ".//div[text()='А вы — оплачиваете аренду']")
    private SelenideElement descriptionOfStatus_2;
    //блок "Как это работает", круг статуса "3"
    @FindBy(how = How.XPATH, using = ".//div[text()='3']")
    private SelenideElement circleStatus_3;
    //блок "Как это работает", название статуса "3"
    @FindBy(how = How.XPATH, using = ".//div[text()='Катаетесь']")
    private SelenideElement rideOrderStatus;
    //блок "Как это работает", описание статуса "3"
    @FindBy(how = How.XPATH, using = ".//div[text()='Сколько часов аренды осталось — видно на сайте']")
    private SelenideElement descriptionOfStatus_3;
    //блок "Как это работает", круг статуса "4"
    @FindBy(how = How.XPATH, using = ".//div[text()='4']")
    private SelenideElement circleStatus_4;
    //блок "Как это работает", название статуса "4"
    @FindBy(how = How.XPATH, using = ".//div[text()='Курьер забирает самокат']")
    private SelenideElement OrderStatusPickScooter;
    //блок "Как это работает", описание статуса "4"
    @FindBy(how = How.XPATH, using = ".//div[text()='Когда аренда заканчивается']")
    private SelenideElement descriptionOfStatus_4;
    //заголовок, блок "Вопросы о важном"
    @FindBy(how = How.CLASS_NAME, using = "Home_SubHeader__zwi_E")
    private SelenideElement importantQuestionBlock;
    //локатор 1-ого важного вопроса
    @FindBy(how = How.ID, using = "accordion__heading-0")
    public SelenideElement importantQuestion_1;
    //локатор ответа на 1-й вопрос
    @FindBy(how = How.ID, using = "accordion__panel-0")
    public SelenideElement answerTheQuestion_1;
    //локатор 2-ого важного вопроса
    @FindBy(how = How.ID, using = "accordion__heading-1")
    public SelenideElement importantQuestion_2;
    //локатор ответа на 2-й вопрос
    @FindBy(how = How.ID, using = "accordion__panel-1")
    public SelenideElement answerTheQuestion_2;
    //локатор 3-ого важного вопроса
    @FindBy(how = How.ID, using = "accordion__heading-2")
    public SelenideElement importantQuestion_3;
    //локатор ответа на 3-й вопрос
    @FindBy(how = How.ID, using = "accordion__panel-2")
    public SelenideElement answerTheQuestion_3;
    //локатор 4-ого важного вопроса
    @FindBy(how = How.ID, using = "accordion__heading-3")
    public SelenideElement importantQuestion_4;
    //локатор ответа на 4-й вопрос
    @FindBy(how = How.ID, using = "accordion__panel-3")
    public SelenideElement answerTheQuestion_4;
    //локатор 5-ого важного вопроса
    @FindBy(how = How.ID, using = "accordion__heading-4")
    public SelenideElement importantQuestion_5;
    //локатор ответа на 5-й вопрос
    @FindBy(how = How.ID, using = "accordion__panel-4")
    public SelenideElement answerTheQuestion_5;
    //локатор 6-ого важного вопроса
    @FindBy(how = How.ID, using = "accordion__heading-5")
    public SelenideElement importantQuestion_6;
    //локатор ответа на 6-й вопрос
    @FindBy(how = How.ID, using = "accordion__panel-5")
    public SelenideElement answerTheQuestion_6;
    //локатор 7-ого важного вопроса
    @FindBy(how = How.ID, using = "accordion__heading-6")
    public SelenideElement importantQuestion_7;
    //локатор ответа на 7-й вопрос
    @FindBy(how = How.ID, using = "accordion__panel-6")
    public SelenideElement answerTheQuestion_7;
    //локатор 8-ого важного вопроса
    @FindBy(how = How.ID, using = "accordion__heading-7")
    public SelenideElement importantQuestion_8;
    //локатор ответа на 8-й вопрос
    @FindBy(how = How.ID, using = "accordion__panel-7")
    public SelenideElement answerTheQuestion_8;
    //локатор кнопки заказать нижней
    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    public SelenideElement orderButton;

    //метод "старта" заказа на главной странице
    public void startOrderingScooterTestOne() {
        cookieButton.click();
        orderButton.click();
    }

    //метод "старта" заказа №2 на главной странице
    public void startOrderingScooterTestTwo() {
        orderButton.click();
    }

    //метод проверки текста ответа на первый вопрос
    public void checkingTheTextTheAnswerQuestionOne() {
        importantQuestion_1.scrollTo();
        importantQuestion_1.click();
        answerTheQuestion_1.shouldHave(exactText("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
    }

    //метод проверки текста ответа на второй вопрос
    public void checkingTheTextTheAnswerQuestionTwo() {
        importantQuestion_2.scrollTo();
        importantQuestion_2.click();
        answerTheQuestion_2.shouldHave(exactText("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
    }

    //метод проверки текста ответа на третий вопрос
    public void checkingTheTextTheAnswerQuestionThree() {
        importantQuestion_3.scrollTo();
        importantQuestion_3.click();
        answerTheQuestion_3.shouldHave(exactText("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
    }

    //метод проверки текста ответа на четвертый вопрос
    public void checkingTheTextTheAnswerQuestionFour() {
        importantQuestion_4.scrollTo();
        importantQuestion_4.click();
        answerTheQuestion_4.shouldHave(exactText("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
    }

    //метод проверки текста ответа на пятый вопрос
    public void checkingTheTextTheAnswerQuestionFive() {
        importantQuestion_5.scrollTo();
        importantQuestion_5.click();
        answerTheQuestion_5.shouldHave(exactText("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));
    }

    //метод проверки текста ответа на шестой вопрос
    public void checkingTheTextTheAnswerQuestionSix() {
        importantQuestion_6.scrollTo();
        importantQuestion_6.click();
        answerTheQuestion_6.shouldHave(exactText("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
    }

    //метод проверки текста ответа на седьмой вопрос
    public void checkingTheTextTheAnswerQuestionSeven() {
        importantQuestion_7.scrollTo();
        importantQuestion_7.click();
        answerTheQuestion_7.shouldHave(exactText("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));
    }

    //метод проверки текста ответа на восьмой вопрос
    public void checkingTheTextTheAnswerQuestionEight() {
        importantQuestion_8.scrollTo();
        importantQuestion_8.click();
        answerTheQuestion_8.shouldHave(exactText("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
    }

}
