package org.example;

import org.testng.annotations.*;

public class TC2 {

    @BeforeSuite
    void beforeSuite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    void afterSuite(){

        System.out.println("after Suite");
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("Will execute before every class");
    }

    @AfterClass
    void afterClass(){

        System.out.println("Will execute after every class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("Will execute before every method");
    }


    @AfterMethod
    void afterMethod(){

        System.out.println("Will execute after every method");
    }
    @Test
    public void test3(){
        System.out.println("test3");
    }

    @Test
    public void test4(){
        System.out.println("test4");
    }
}
