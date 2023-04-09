package org.example;

import org.testng.annotations.*;

public class TC1 {


    @BeforeTest
    void beforeTest(){
        System.out.println("Before Test");
    }

    @AfterTest
    void afterTest(){

        System.out.println("After Test");
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
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }
}
