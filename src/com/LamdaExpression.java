package com;

import java.util.ArrayList;

public class LamdaExpression {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        ArrayList<Integer> lst = new ArrayList<>(0);
        for(int i = 0 ;i < 10;i++) {
            lst.add(i);
        }
        lst.forEach((item)-> System.out.println(item*2));
    }
}

interface Operation {
    public int sum(int a , int b);
    public int sub(int a, int b);
}
