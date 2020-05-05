package com.course.testng.suite;

import org.testng.annotations.Test;

public class ignoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1在执行");
    }
    @Test(enabled = true)
    public void ignore2(){
        System.out.println("ignore2在执行");
    }
}
