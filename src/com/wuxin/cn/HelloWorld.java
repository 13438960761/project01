package com.wuxin.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class HelloWorld {
    public static final int nu1 = 3;


    public static void main(String[] args) {
        ArrayList rr2 = new ArrayList();// shift + enter, alter+enter
        System.out.println("hello world2");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("HelloWorld.main");
        Date DATE = new Date();
        System.out.println("DATE = " + DATE);
        rr2.add(1);
        System.out.println(rr2);
        me2(4);
        if (rr2 == null) {

        }
        if (DATE != null) {
            
        }
        if (rr2 == null) {

        }


        for (int i = 0; i < 100; i++) {
            me2(3);
            System.out.println(i);
        }



    }


    public static void me2(int a) {
        System.out.println("nihao");
            System.out.println(a);
    }
}
