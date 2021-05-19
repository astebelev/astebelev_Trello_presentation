package com.astebelev.trello.tests;

import com.astebelev.trello.model.Board;
import com.astebelev.trello.model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BoardCreationTests extends TestBase {
    @BeforeMethod
    public void preconditions() throws InterruptedException {

            app.getUser().clickLoginButton();
            app.getUser().fillLoginForm(new User().withEmail("rochman.elena@gmail.com").withPassword("12345.com"));
            app.getUser().confirmLogin();
            Thread.sleep(3000);
            Assert.assertTrue(app.getUser().isAvatarPresent());
        }



    @Test
    public void testBoardCreation() {
        app.getBoard().initBoardCreationFromBoardsList();
        app.getBoard().fillBoardCreationBoard(new Board("board" + TimeUnit.SECONDS, "PublicIcon"));

        app.getBoard().submitBoardCreationForm();


    }




}