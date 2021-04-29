package com.astebelev.trello.tests;

import com.astebelev.trello.framework.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public  void setUp(){
        app.init();
    }

    @AfterMethod
    public void tearDown(){
        app.stop();
    }



}