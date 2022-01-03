package ru.Denmark1;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @Test
    void DragAndDropMoveElement(){
        //Открыть страницу
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //dragAndDropTo
        $("#column-a").dragAndDropTo($("#column-b"));
        //Check
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
        // moveToElement--C actions у меня не работает,перетаскиевает в другое место!
        //SelenideElement elementA = $("#column-a");
        //SelenideElement elementB = $("#column-b");
        //actions().clickAndHold(elementA).moveToElement(elementB).build().perform();
        //$("#column-a").shouldHave(text("B"));
        //$("#column-b").shouldHave(text("A"));

    }
}
