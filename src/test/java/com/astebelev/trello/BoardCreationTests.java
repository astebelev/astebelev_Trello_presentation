package com.astebelev.trello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BoardCreationTests extends TestBase{
    @BeforeMethod
    public void preconditions() throws InterruptedException {
        clickLoginButton();
        fillLoginForm();
        confirmLogin();
    }


    @Test
    public void testAtlassianLogin() {
        initBoardCreationFromBoardsList();
        wd.findElement(By.xpath("//input[@data-test-id='create-board-title-input']")).click();
        wd.findElement(By.xpath("//input[@data-test-id='create-board-title-input']")).clear();
        wd.findElement(By.xpath("//input[@data-test-id='create-board-title-input']")).sendKeys("board1");

        wd.findElement(By.xpath("//*[@aria-label='DownIcon']/../..")).click();
        wd.findElement(By.xpath("//*[@aria-label='PublicIcon']/../..")).click();

        wd.findElement(By.cssSelector("._21upOlzpUQJcdT.gkv95EhjCrfcEU")).click();
        wd.findElement(By.cssSelector("[data-test-id='create-board-submit-button']")).click();


    }

    public void initBoardCreationFromBoardsList() {
        wd.findElement(By.xpath("//*[@data-test-id='create-board-tile']")).click();
    }

}

