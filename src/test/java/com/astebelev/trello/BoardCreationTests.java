package com.astebelev.trello;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreationTests extends TestBase {
    @BeforeMethod
    public void preconditions() throws InterruptedException {
        clickLoginButton();
        fillLoginForm("rochman.elena@gmail.com", "12345.com");
        confirmLogin();
    }


    @Test
    public void testBoardCreation() {
        initBoardCreationFromBoardsList();
        type(By.xpath("//input[@data-test-id='create-board-title-input']"), "board");

        selectBoardVisibility("PublicIcon");

        click(By.cssSelector("._21upOlzpUQJcdT.gkv95EhjCrfcEU"));
        click(By.cssSelector("[data-test-id='create-board-submit-button']"));


    }

    public void selectBoardVisibility(String visibility) {
        click(By.xpath("//*[@aria-label='DownIcon']/../.."));
        click(By.xpath("//*[@aria-label='" + visibility + "']/../.."));
    }

    public void initBoardCreationFromBoardsList() {
        click(By.xpath("//*[@data-test-id='create-board-tile']"));
    }

}