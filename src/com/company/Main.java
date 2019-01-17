package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);

        System.out.println("Please enter a positive integer to get that many fibonacci terms:");
        int num = kb.nextInt();
        int i = 1;

        while (fib.sequence(i) != num) {
            System.out.print(fib.sequence(i) + ", ");
            i++;
        }
        System.out.println(num);

    }
}


