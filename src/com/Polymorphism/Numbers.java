package com.Polymorphism;

public class Numbers {
//    example for Compile time polymorphism i.e methode overloading.

    void sum(int a , int b) {
        System.out.println(a+b);
    }

    void sum(int a , int b, int c) {
        System.out.println(a+b+c);
    }

    void sum(String s , int a) {
        System.out.println(s+a);
    }

    void sum(int a, String s) {
        System.out.println(a+s);
    }

    int sum(int a , String s, int b) {
        return 0;
    }

    int sum(int a , int b , String s) {
        return 0;
    }

//    as here we're using many functions of same name just by changing the args passed in it.
//    So it's known as methode overloading.

    public static void main(String[] args) {
        Numbers num = new Numbers();

        num.sum(1,2);
        num.sum(1,2,4);
        num.sum("a",2);
        num.sum(1,"2");
        System.out.println(num.sum(1,"2",3));
        System.out.println(num.sum(1,2,"3"));

    }

}
