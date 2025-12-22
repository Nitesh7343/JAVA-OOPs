package com.inheritance;

public class BoxWeight extends Box {
    int w = -1;

    BoxWeight() {
        this.l = l;
        this.b = b;
        this.h = h;
        this.w = w;
    }

    BoxWeight(Box box,int w) {
        this.l = box.l;
        this.b = box.b;
        this.h = box.h;
        this.w = w;
    }

    BoxWeight(int l, int b, int h, int w) {
        super(l,b,h);
        this.w = w;
    }
}
