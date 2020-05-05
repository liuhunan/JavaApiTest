package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;


public class DataProvideTest {
    @Test(dataProvider = "datas")
    public void add(int a,int b){
        int sum;
        sum=a+b;
        System.out.print("Sum Of a And b Is : "+sum );

    }
    @DataProvider(name="datas")
    public Object[][] providerData(){
        Object[][] o=new Object[][]{
                {1, 2},
                {3, 4},
                {5, 6}
        };
        return o;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.print("test1方法 name="+name+";age="+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.print("test2方法 name="+name+";age="+age);
    }
    @DataProvider(name="methodData")
    public Object[][]  methodDataTest(Method method){
        Object[][] result=null;
        if (method.getName().equals("test1")){
            result=new Object[][]{
                    {"zhangsan",20},
                    {"lisi",25}
            };

        }else if(method.getName().equals("test2")){
            result=new Object[][]{
                    {"wangwu",50},
                    {"zhaoliu",60}};


        }
        return result;
    }
        }

