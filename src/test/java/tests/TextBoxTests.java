package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TextBoxTests {

    @BeforeAll
    static void beforAll() {
       Configuration.baseUrl = "https://demoqa.com";
       Configuration.browserSize = "1920x1080";
       Configuration.pageLoadStrategy = "eager";
       Configuration.holdBrowserOpen = true;
       Configuration.timeout = 5000; //default 4000

    }

    @Test
    void fillFormTest() {
       open("/text-box");
       $("#userName").setValue("Art");
       $("#userEmail").setValue("art@artem.com");
       $("#currentAddress").setValue("Bohnsdorferweg");
       $("#permanentAddress").setValue("Salieristrasse 1");
        $("#submit").click();

/*       $("#output").$("#name").shouldHave(text("Art"));
        $("#output").$("#imail").shouldHave(text("art@artem.com"));
        $("#output").$("#currentAddress").shouldHave(text("Bohnsdorferweg"));
        $("#output").$("#permanentAdress").shouldHave(text("Salieristrasse 1")); */ //the same as bottom

        $("#output #name").shouldHave(text("Art"));
        $("#output #email").shouldHave(text("art@artem.com"));
        $("#output #currentAddress").shouldHave(text("Bohnsdorferweg"));
        $("#output #permanentAddress").shouldHave(text("Salieristrasse 1"));

    }
}
