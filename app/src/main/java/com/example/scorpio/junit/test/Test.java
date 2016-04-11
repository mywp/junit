package com.example.scorpio.junit.test;

import android.test.AndroidTestCase;

import com.example.scorpio.junit.utils.MathUtils;

/**
 * Created by Scorpio on 16/1/9.
 */
public class Test extends AndroidTestCase{
    
    public void test(){
     //   System.out.println("test is calling!!");
        int result = MathUtils.incrment(9,10);
        //断言，断定某一个对象就是一个值
        assertEquals(19,result);
    }
}
