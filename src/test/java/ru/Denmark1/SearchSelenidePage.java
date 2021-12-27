package ru.Denmark1;

import org.junit.jupiter.api.Test;

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
        $("[data-filterable-for=wiki-pages-filter]").$(byText("SoftAssertions")).shouldBe(visible).click();
        //$(".js-wiki-sidebar-toggle-display").shouldHave(text("SoftAssertions"));
        //$$("ul.[data-filterable-for=wiki-pages-filter]").findBy(exactText("SoftAssertions")).click();
        //$("#wiki-pages-box").shouldHave(text("Soft assertions")).shouldBe(visible);

    }
}
