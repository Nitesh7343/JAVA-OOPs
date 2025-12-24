package com.Interfaces.ExtendIntefaces;

public class Main implements B{
    @Override
    public void greet() {
        System.out.println("Good luck for your future.");
    }

    @Override
    public void fun() {
        System.out.println("Have fun by keep learning");
    }

    public static void main(String[] args) {
        Main obj = new Main(); //work✅
        obj.fun();
        obj.greet();

        A obj1 = new Main();
        obj1.fun(); //work✅
//        obj1.greet(); //error❌

    }
}
