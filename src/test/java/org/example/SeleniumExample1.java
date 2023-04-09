package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumExample1 {


    ChromeDriver driver;

    @BeforeClass
    void setup(){

        WebDriverManager.chromedriver().setup();


        driver = new ChromeDriver();


        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }




    @Test
    void getTitle() throws InterruptedException {

//        driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");
//        driver.findElement(By.cssSelector("input.inputtext")).sendKeys("abc@gmail.com");

//        driver.findElement(By.cssSelector("input[name=email]")).sendKeys("Hey");

        driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("abc");

        driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("pass");






    }

    @AfterClass
    void tearDown(){



        driver.quit();
    }
}
