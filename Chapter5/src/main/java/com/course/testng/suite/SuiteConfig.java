package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.print("before suite运行了");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.print("after suite运行了");
    }
}
