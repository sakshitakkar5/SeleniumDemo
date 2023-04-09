package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class CheckBoxExample {

    ChromeDriver driver;

    @BeforeClass
    void setup(){

        WebDriverManager.chromedriver().setup();


        driver = new ChromeDriver();


        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
    }

    @Test
    void checkBoxExample() throws InterruptedException {



        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        WebElement elem = driver.findElement(By.xpath("//label[text()='Sports']"));
        Thread.sleep(5000);

        System.out.println( new WebDriverWait(driver,Duration.ofMillis(50)).until(ExpectedConditions.elementToBeClickable(elem)).isDisplayed());
        new WebDriverWait(driver,Duration.ofMillis(50)).until(ExpectedConditions.elementToBeClickable(elem)).click();
    }


//    @AfterClass
//    void tearDown(){
//        driver.quit();
//    }

}
