package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumExample3 {

    ChromeDriver driver;

    @BeforeClass
    void setup(){

        WebDriverManager.chromedriver().setup();


        driver = new ChromeDriver();


        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();
    }

    @Test
    void getTitle() throws InterruptedException {








    }

    @AfterClass
    void tearDown(){



        driver.quit();
    }


}
