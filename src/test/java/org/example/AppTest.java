package org.example;

import org.junit.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
//    @Test
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }

    @Test(priority = 1)
    void setup(){
        System.out.println("Opening Browser");
    }
    @Test(priority = 2)
    void login(){
        System.out.println("This is login test");
    }

    @Test(priority = 3,enabled = false)
    void aearDown(){
        System.out.println("Closing Browser");
//        Assert.assertEquals(1,2);
    }
}
