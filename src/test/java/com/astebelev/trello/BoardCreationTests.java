package com.astebelev.trello;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BoardCreationTests extends TestBase {
    @BeforeMethod
    public void preconditions() throws InterruptedException {
        clickLoginButton();
      // fillLoginForm(new User("rochman.elena@gmail.com", "12345.com"));
        confirmLogin();
    }


    @Test
    public void testBoardCreation() {
        initBoardCreationFromBoardsList();
        fillBoardCreationBoard(new Board("board" + TimeUnit.SECONDS, "PublicIcon"));

        click(By.cssSelector("._21upOlzpUQJcdT.gkv95EhjCrfcEU"));
        click(By.cssSelector("[data-test-id='create-board-submit-button']"));


    }

    public void fillBoardCreationBoard(Board board) {
        type(By.xpath("//input[@data-test-id='create-board-title-input']"), board.getBoardName());

        selectBoardVisibility(board.getVisibility());
    }

    public void selectBoardVisibility(String visibility) {
        click(By.xpath("//*[@aria-label='DownIcon']/../.."));
        click(By.xpath("//*[@aria-label='" + visibility + "']/../.."));
    }

    public void initBoardCreationFromBoardsList() {
        click(By.xpath("//*[@data-test-id='create-board-tile']"));
    }

}