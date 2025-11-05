package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selectors.byText;

public class RegFormTests {

    @BeforeAll
    static void prepareEnvironment() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 3000;

    }

    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("Masha");
        $("#userEmail").setValue("test1@test2.com");
        $("#currentAddress").setValue("Samara, Lenina street");
        $("#permanentAddress").setValue("Lenina street");
        $("#submit").click();

        $("#output").$("#name").shouldHave(text("Masha"));
        $("#output").$("#email").shouldHave(text("test1@test2.com"));
        $("#output").$("#currentAddress").shouldHave(text("Samara, Lenina street"));
        $("#output").$("#permanentAddress").shouldHave(text("Lenina street"));
    }