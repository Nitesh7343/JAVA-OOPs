package com.inheritance;

public class Box {
    int l;
    int b;
    int h;

    Box() {
        l = -1;
        b = -1;
        h = -1;
    }

    Box(int side) {
        int l = side;
        int b = side;
        int h = side;
    }

    Box(int l, int b) {
        this.l = l;
        this.b = b;
        this.h = -1;
    }

    Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

     public void info() {
        System.out.println("Length = "+l);
        System.out.println("Width = "+b);
        System.out.println("Height = "+h);
    }
}
