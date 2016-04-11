package com.example.scorpio.junit.utils;

import android.util.Log;

/**
 * 加法运算
 */
public class MathUtils {
    public static int incrment(int x, int y){
        System.out.println(x+"+"+y+"="+(x+y));
        System.err.println(x + "+" + y + "=" + (x + y));
        Log.v("MathUtils", "黑色：" + x + "+" + y + "=" + (x + y));
        Log.d("MathUtils", "蓝色：" + x + "+" + y + "=" + (x + y));
        Log.i("MathUtils", "绿色："+x + "+" + y + "=" + (x + y));
        Log.w("MathUtils", "黄色："+x + "+" + y + "=" + (x + y));
        Log.e("MathUtils", "红色："+x + "+" + y + "=" + (x + y));
        return x+y;
        
    }
    public static void main(String[] args){
        MathUtils m=new MathUtils();
        int result=m.incrment(1,10);
        System.out.println(result);
    }
}
