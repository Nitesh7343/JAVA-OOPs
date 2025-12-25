package com;

import java.util.ArrayList;

public class LamdaExpression {
    public static void main(String[] args) {
//        ArrayList<Integer> lst = new ArrayList<>(0);
//        for(int i = 0 ;i < 10;i++) {
//            lst.add(i);
//        }
//        lst.forEach((item)-> System.out.println(item*2));

        Operation sum = (a,b)->a+b;
        Operation sub = (a,b)->a-b;
        Operation pro = (a,b)->a*b;
        Operation div = (a,b)->a/b;
        Operation rem = (a,b)->a%b;
        Operation pow = (a,b)->{
            if(b == 0) return 1;
            int i = 1;
            int temp = a;
            while(i != b) {
                a *= temp;
                i++;
            }
            return a;
        };

        LamdaExpression myCalc = new LamdaExpression();
        int ans = myCalc.operate(2,2,pow);

        System.out.println(ans);

    }

    private static int operate(int a, int b , Operation op) {
        return op.operation(a,b);
    }
}

interface Operation {
    public int operation(int a , int b);
}
