package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleJunitTest {
    @Test
    void successfulSearchTest() {
        // Открыть google
        open("https://www.google.com/");

        //Согласится с политикой приватности
      //  $("[id=L2AGLb]").click();

        //Ввести Selenide в поиск
        $("[name=q]").setValue("selenide").pressEnter();

        //Проверить, что селенид появился в результатах поиска
        $("[id=search]").shouldHave(text("https://selenide.org"));
    }
}
