package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JavaScriptAlertExample {

    ChromeDriver driver;

    @BeforeClass
    void setup(){

        WebDriverManager.chromedriver().setup();


        driver = new ChromeDriver();


        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
    }

    @Test
    void dropdownExample(){

        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
//        driver.findElement(By.xpath("//li[2]/button")).click();
    }
}
