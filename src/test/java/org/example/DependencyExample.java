package org.example;


import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {

    @Test
    public void login(){
        System.out.println("Login");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"login"})
    public void homePage(){
        System.out.println("Home page");
    }


    @Test (dependsOnMethods = {"login","homePage"})
    public void LMS(){
        System.out.println("LMS");
    }
}
