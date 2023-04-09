package org.example;

import org.testng.annotations.Test;

public class GroupingExample {

    @Test(groups = {"regression"})
    void test1(){
        System.out.println("Test1");
    }

    @Test(groups = {"critical"})
    void test2(){

        System.out.println("Test2");
    }


    @Test(groups={"regression"})
    void test3(){

        System.out.println("Test3");
    }


    @Test(groups={"critical"})
    void test4(){

        System.out.println("Test4");
    }


    @Test(groups = {"critical","regression"})
    void test5(){

        System.out.println("Test5");
    }
}
