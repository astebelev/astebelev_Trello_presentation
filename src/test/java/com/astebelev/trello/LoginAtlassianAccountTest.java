package com.astebelev.trello;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAtlassianAccountTest extends TestBase{
    /*1. click login button
     * 2. fill login form (hhh@hhh.com / 12345)
     * 3. confirm login
     *
     * expected result: user logged in, on the header avatar present,
     * logOut button available*/
    @Test
    public void testloginAtlassian() throws InterruptedException {
        clickLoginButton();

        fillLoginForm(new User().withEmail("rochman.elena@gmail.com").withPassword("12345.com"));
        confirmLogin();

        Assert.assertTrue(
                wd.findElements(By.cssSelector("[data-test-id=header-member-menu-button]")).size()>0);

        Assert.assertEquals(wd.findElement(By.cssSelector("[data-test-id=header-member-menu-button]")).getAttribute("title"),"rochman.elena (rochmanelena)");

    }

    @Test
    public void negativeTestLogin() throws InterruptedException {
        clickLoginButton();
        fillLoginForm(new User().withEmail("rochman.elena@gmail.com").withPassword("12345.cOm"));
        confirmLogin();

    }

}