package com.astebelev.trello.tests;

import com.astebelev.trello.framework.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    protected static ApplicationManager app
            = new ApplicationManager(System.getProperty("browser",BrowserType.CHROME));

    @BeforeSuite
    public  void setUp(){
        app.init();
    }

    @AfterSuite
    public void tearDown(){
        app.stop();
    }



}