package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FrameExample {

    ChromeDriver driver;

    @BeforeClass
    void setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tinymce");
        driver.manage().window().maximize();
    }

    @Test
    void frameExample(){

//        driver.switchTo().frame("mce_0_ifr");
//        WebElement input=  driver.findElement(By.id("tinymce"));
//        input.clear();
//        input.sendKeys("Today is a good day");

        driver.switchTo().frame("mce_0_ifr");
        WebElement in = driver.findElement(By.id("tinymce"));
        in.clear();
        in.sendKeys("Hello");

    }
}
