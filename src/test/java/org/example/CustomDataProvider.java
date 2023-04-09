package org.example;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {

    @DataProvider(name = "loginData")
    public Object[][] getData(){

        Object[][] data = {{"abc","vbn","ghj"},{"tyu","iop" , null}};
        return data;
    }
}
