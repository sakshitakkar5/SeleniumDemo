package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownExampleSelenium {

    ChromeDriver driver;

    @BeforeClass
    void setup(){

        WebDriverManager.chromedriver().setup();


        driver = new ChromeDriver();


        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();
    }

    @Test
    void dropdownExample(){

//        Select select = new Select(driver.findElement(By.id("dropdown")));
//        select.selectByIndex(1);
//        select.selectByValue("1");
//        select.selectByVisibleText("Option 2");

//        List<WebElement> list = select.getOptions();
//        for (WebElement element : list
//        ) {
//            // element.getAttribute("value");
//            System.out.println(element.getText());
//        }

        Select select = new Select(driver.findElement(By.id("dropdown")));
        //select.selectByIndex(1);
        //select.selectByValue("2");
        select.selectByVisibleText("Option 1");

        List<WebElement> list = select.getOptions();
        for(WebElement elem : list){
            System.out.println(elem.getText());
        }

    }


//    @AfterClass
//    void tearDown(){
//        driver.quit();
//    }

}
