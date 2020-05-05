package com.course.testng.groups;

import org.testng.annotations.Test;

public class ExpectedException {
    /***
     * 什么时候会用到异常测试
     * 在我们期望结果为某一个异常的时候
     * 比如：我们传入了某些不合法的参数，程序抛出了异常
     * 也就是说我的语气结果就是这个异常
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.print("这个方法runtime异常");
        throw new RuntimeException();

    }
}
