package com.company;

/**
 * Created by eg913 on 1/17/19.
 */
public class fib {
    public static int b = 1;
    public static int a = 0;
    public static int c = 0;
    public static int sequence (int n) {
        
        while (b <= n) {
            c = b;
            b = a + b;
            a = c;

       }
        return b;
    }

}

