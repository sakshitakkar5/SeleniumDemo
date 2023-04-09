package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

//    @DataProvider(name = "loginData")
//    public Object[][] getData(){
//
//        Object[][] data = {{"abc","vbn","ghj"},{"tyu","iop" , null}};
//        return data;
//    }

    @Test(dataProvider = "loginData", dataProviderClass = CustomDataProvider.class)
    public void login(String email, String pwd, String city){
        System.out.println(email + " " + pwd + " " + city);
    }
}
