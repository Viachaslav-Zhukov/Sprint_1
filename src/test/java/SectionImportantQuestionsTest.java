import org.junit.Test;
import ru.yandex.praktikum.ElementsOfTheMainPagePartTwoPageObject;

import static com.codeborne.selenide.Selenide.open;

// создать класс запуска тестов для блока "Важные вопросы"
public class SectionImportantQuestionsTest {
    //написать отдельный тест на каждый вопрос
    @Test
    public void checkingTextTheAnswerQuestionOneTest() {
        //Configuration.browser = "chrome";
        //создай объект класса главной страницы для проверки текста ответа на вопрос
        //открыть страницу тестового приложения
        ElementsOfTheMainPagePartTwoPageObject importantQuestionOne =
                open(ElementsOfTheMainPagePartTwoPageObject.URL, ElementsOfTheMainPagePartTwoPageObject.class);
        //вызвать метод проверки текста на вопрос
        importantQuestionOne.checkingTheTextTheAnswerQuestionOne();
    }

    @Test
    public void checkingTextTheAnswerQuestionTwoTest() {
        ElementsOfTheMainPagePartTwoPageObject importantQuestionTwo =
                open(ElementsOfTheMainPagePartTwoPageObject.URL, ElementsOfTheMainPagePartTwoPageObject.class);
        importantQuestionTwo.checkingTheTextTheAnswerQuestionTwo();
    }

    @Test
    public void checkingTextTheAnswerQuestionThreeTest() {
        ElementsOfTheMainPagePartTwoPageObject importantQuestionThree =
                open(ElementsOfTheMainPagePartTwoPageObject.URL, ElementsOfTheMainPagePartTwoPageObject.class);
        importantQuestionThree.checkingTheTextTheAnswerQuestionThree();
    }

    @Test
    public void checkingTextTheAnswerQuestionFourTest() {
        ElementsOfTheMainPagePartTwoPageObject importantQuestionFour =
                open(ElementsOfTheMainPagePartTwoPageObject.URL, ElementsOfTheMainPagePartTwoPageObject.class);
        importantQuestionFour.checkingTheTextTheAnswerQuestionFour();
    }

    @Test
    public void checkingTextTheAnswerQuestionFiveTest() {
        ElementsOfTheMainPagePartTwoPageObject importantQuestionFive =
                open(ElementsOfTheMainPagePartTwoPageObject.URL, ElementsOfTheMainPagePartTwoPageObject.class);
        importantQuestionFive.checkingTheTextTheAnswerQuestionFive();
    }

    @Test
    public void checkingTextTheAnswerQuestionSixTest() {
        ElementsOfTheMainPagePartTwoPageObject importantQuestionSix =
                open(ElementsOfTheMainPagePartTwoPageObject.URL, ElementsOfTheMainPagePartTwoPageObject.class);
        importantQuestionSix.checkingTheTextTheAnswerQuestionSix();
    }

    @Test
    public void checkingTextTheAnswerQuestionSevenTest() {
        ElementsOfTheMainPagePartTwoPageObject importantQuestionSeven =
                open(ElementsOfTheMainPagePartTwoPageObject.URL, ElementsOfTheMainPagePartTwoPageObject.class);
        importantQuestionSeven.checkingTheTextTheAnswerQuestionSeven();
    }

    @Test
    public void checkingTextTheAnswerQuestionEightTest() {
        ElementsOfTheMainPagePartTwoPageObject importantQuestionEight =
                open(ElementsOfTheMainPagePartTwoPageObject.URL, ElementsOfTheMainPagePartTwoPageObject.class);
        importantQuestionEight.checkingTheTextTheAnswerQuestionEight();
    }
}

