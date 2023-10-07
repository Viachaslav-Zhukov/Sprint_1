import org.junit.Test;
import ru.yandex.praktikum.ElementsOfTheMainPagePartTwoPageObject;
import ru.yandex.praktikum.OrderFormPagePageObject;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;


public class ScooterOrderFormsTest {

    @Test
    public void completeTheScooterOrderOne() {
        //Configuration.browser = "chrome";
        //создай объект класса главной страницы
        //открыть страницу тестового приложения
        ElementsOfTheMainPagePartTwoPageObject orderScooter = open(ElementsOfTheMainPagePartTwoPageObject.URL, ElementsOfTheMainPagePartTwoPageObject.class);
        //вызываем метод "старта" заказа на главной странице
        orderScooter.startOrderingScooterTestOne();
        //создай объект класса страницы формы заказа самоката
        OrderFormPagePageObject orderFormPageOne = page(OrderFormPagePageObject.class);
        //присваиваем значения, для переменных полей ввода формы заказа
        final String name = "Иван";
        final String surname = "Иванов";
        final String address = "переулок Полевой 2-й";
        final String telephone = "+375296264335";
        final String comment = "Осторожно злая собака!";
        //вызываем метод заполнения и оформления заказа
        orderFormPageOne.fillOutTheScooterOrderForm(name, surname, address, telephone, comment);
    }

    @Test
    public void completeTheScooterOrderTwo() {
        ElementsOfTheMainPagePartTwoPageObject orderScooter = open(ElementsOfTheMainPagePartTwoPageObject.URL, ElementsOfTheMainPagePartTwoPageObject.class);
        orderScooter.startOrderingScooterTestTwo();
        OrderFormPagePageObject orderFormPageOne = page(OrderFormPagePageObject.class);
        final String name = "Петя";
        final String surname = "Петров";
        final String address = "проспект Ленина 51, кв. 18";
        final String telephone = "+795253523145";
        final String comment = "Звонить в домофон.";
        orderFormPageOne.fillOutTheScooterOrderFormTwo(name, surname, address, telephone, comment);
    }

}



