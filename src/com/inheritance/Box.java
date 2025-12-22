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
        this.l = side;
        this.b = side;
        this.h = side;
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

    Box(Box box) {
        this.l = box.l;
        this.h = box.h;
        this.l = box.l;
    }

     public void info() {
        System.out.println("Length = "+l);
        System.out.println("Width = "+b);
        System.out.println("Height = "+h);
    }
}
