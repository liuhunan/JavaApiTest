package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test   //最基本的注解，用来把方法标记为测试的一部分
    public void  testCase1(){
        System.out.print("这是测试用例1");

    }
    @Test   //最基本的注解，用来把方法标记为测试的一部分
    public void  testCase2(){
        System.out.print("这是测试用例2");

    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.print("BeforeMethod这个是在测试方法前运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.print("AfterMethod这个是在测试方法后运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.print("BeforeClass这个是在类运行前运行的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.print("AfterClass这个是在类运行后运行的方法");
    }
    @BeforeSuite
    public void beforesuite(){
        System.out.print("BeforeSuite这个是在套件运行前运行的方法");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.print("AfterSuite这个是在套件运行后运行的方法");
    }
}
