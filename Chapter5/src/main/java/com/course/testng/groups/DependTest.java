package com.course.testng.groups;

import org.testng.annotations.Test;

public class DependTest {
    @Test
    public void test1(){
        System.out.print("test1 runing");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.print("test2 runing");
    }
}
