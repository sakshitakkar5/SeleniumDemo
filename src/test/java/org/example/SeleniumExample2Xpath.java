package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumExample2Xpath {


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

        //By Relative Path
//        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
//        driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();


        //By Absolute Path

//        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("standard_user");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");
//        Thread.sleep(1000);

        //By xpath with or

        driver.findElement(By.xpath("//input[@id='user-name' or name='user-name']")).sendKeys("standard_user");






    }

    @AfterClass
    void tearDown(){



        driver.quit();
    }
}
