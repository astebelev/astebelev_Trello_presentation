package com.astebelev.trello.framework;

import com.astebelev.trello.model.Board;
import com.astebelev.trello.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserHelper extends HelperBase {

    public UserHelper(WebDriver wd) {
        super(wd);
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

    public void submitBoardCreationForm() {
        click(By.cssSelector("._21upOlzpUQJcdT.gkv95EhjCrfcEU"));
        click(By.cssSelector("[data-test-id='create-board-submit-button']"));
    }
    public void confirmLogin() {
        click(By.cssSelector("#login-submit"));
    }

    public void fillLoginForm(User user) throws InterruptedException {
        type(By.cssSelector("#user"), user.getEmail());
        Thread.sleep(2000);
        click(By.cssSelector("#login"));
        type(By.cssSelector("#password"), user.getPassword());
    }

    public void clickLoginButton() {
        click(By.cssSelector("[href='/login']"));
    }

    public boolean isAvatarPresent() {
        By avatar = By.cssSelector("[data-test-id=header-member-menu-button]");
        return isElementPresentWait(avatar);
    }

    public void logout() {
        //click on avatar
        //click logout
        //confirm logout
    }
}
