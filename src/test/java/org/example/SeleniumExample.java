package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumExample {

    ChromeDriver driver;

    @BeforeClass
    void setup(){

        WebDriverManager.chromedriver().setup();


        driver = new ChromeDriver();


        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }




    @Test
    void getTitle() throws InterruptedException {

//        driver.findElement(By.name("q")).sendKeys("Mobile");
//        Thread.sleep(1000);
//        driver.findElement(By.name("btnK")).click();
//        Thread.sleep(1000);
//
//        Assert.assertEquals(driver.getTitle(), "Mobile - Google Search");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.name("login-button")).click();
        Thread.sleep(1000);
//        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
//        Assert.assertEquals(driver.getTitle(),"Swag Labs");

//        driver.findElement(By.linkText("Sauce Labs Backpack")).click();

//        driver.findElement(By.partialLinkText("Sauce Labs")).click();
//        Thread.sleep(1000);

        List<WebElement> list = driver.findElements(By.partialLinkText("Sauce Labs"));

        list.get(1).click();

        Thread.sleep(1000);

        //By class

//       List<WebElement> images = driver.findElements(By.className("inventory_item"));
//       int im = images.size();
//        System.out.println(im);

//        driver.findElement(By.className("btn")).click();

//        int buttons = driver.findElements(By.className("btn")).size();
//        System.out.println(buttons);


        //By tag name


//        int links = driver.findElements(By.tagName("a")).size();
//        System.out.println(links);


    }

    @AfterClass
    void tearDown(){



        driver.quit();
    }
}
