package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionExample {

    ChromeDriver driver;

    @BeforeClass
    void setup(){

        WebDriverManager.chromedriver().setup();


       driver = new ChromeDriver();


        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }

    @Test
    void getTitle() throws InterruptedException {

        driver.findElement(By.name("q")).sendKeys("Mobile");
        Thread.sleep(1000);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(1000);

        Assert.assertEquals(driver.getTitle(), "Mobile - Google Search");

    }

    @AfterClass
    void tearDown(){



        driver.quit();
    }
}
