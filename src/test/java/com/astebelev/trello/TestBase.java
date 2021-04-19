package com.astebelev.trello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    //1
    @BeforeMethod
    public void setUp(){

        //4.1 инициаллиз. переменную
        wd = new ChromeDriver();

        //4.2 устанавливаем Timeouts
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //4.3 растягиваем на весь экран
        wd.manage().window().maximize();

        //4.4 передаем открытие сайта
        wd.navigate().to("https://trello.com/");

    }
    @AfterMethod
    public void tearDown(){
        wd.quit();

    }
    //_______________________________________________________________________________________________

    //меняем на public
    public void confirmLogin() {
        //4.9.1 нужно кликнуть на Log in
        wd.findElement(By.cssSelector("#login-submit")).click();
    }

    public void fillLoginForm() throws InterruptedException {
        //4.8 прописуем метод
        wd.findElement(By.cssSelector("#user")).click();
        //Ctrl D
        //4.8.1 clear
        wd.findElement(By.cssSelector("#user")).clear();
        //4.8.2 sendKeys
        wd.findElement(By.cssSelector("#user")).sendKeys("rochman.elena@gmail.com");
        //кинуть паузу
        //4.9.2
        Thread.sleep(2000);// Alt Enter
        //4.8.3 Log in with Atlassian
        wd.findElement(By.cssSelector("#login")).click();


        //4.8.4 повторяем действия меняя локатор
        wd.findElement(By.cssSelector("#password")).click();
        wd.findElement(By.cssSelector("#password")).clear();
        wd.findElement(By.cssSelector("#password")).sendKeys("12345.com");

    }

    public void clickLoginButton() {
        //4.6                            инспектируем Log In и в [ ' ' ]вставляем
        wd.findElement(By.cssSelector("[href='/login']")).click();

    }

}
