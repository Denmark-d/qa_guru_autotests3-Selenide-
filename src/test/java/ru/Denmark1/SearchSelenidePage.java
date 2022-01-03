package ru.Denmark1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenidePage {
    @Test
    void SearchSelenideInGithub(){
        //открыть страницу github.com
        open("https://github.com/");
        //в поле поиска ввести selenide и нажать Enter
        $("[data-test-selector=nav-search-input]").setValue("Selenide").pressEnter();
        //выбираем первый линк
        $$("ul.repo-list").first().$("a").click();
        //проверяем в заголовке selenide/selenide
        $("h1").shouldHave(text("selenide / selenide"));
        //перешли в раздел в Wiki
        //$("#wiki-repo-tab-count").click();
        $("[data-content=Wiki]").click();
        //кликнули на show more
        $ (".js-wiki-more-pages-link").scrollTo().click();

        $("[data-filterable-for='wiki-pages-filter']").shouldHave(text("SoftAssertions"));
        //коикнули на SoftAssertions
        $("[data-filterable-for='wiki-pages-filter']").click();

        //Проверяем, что внутри есть пример кода для JUnit
        $(".markdown-body").shouldBe(visible);
        //$(".markdown-body").shouldHave(text("Using JUnit5 extend test class:")).shouldBe(visible);

    }
}
