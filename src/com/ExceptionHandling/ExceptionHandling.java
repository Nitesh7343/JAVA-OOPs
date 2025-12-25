package com.ExceptionHandling;

import java.util.*;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            divide(a,b);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally { // always run either exception occurs or not....
            System.out.println("Runs always");
        }
    }
    static int divide(int a , int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Don't divide by zero");
        }
        return a/b;
    }
}
