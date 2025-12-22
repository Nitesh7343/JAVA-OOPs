package com.inheritance;

public class BoxWeight extends Box {
    int weight = -1;

    BoxWeight() {
        super();
        this.weight = weight;
    }

    BoxWeight(Box box) {
        super(box);
        this.weight = weight;
    }

    BoxWeight(Box box,int weight) {
        super(box);
        this.weight = weight;
    }

    BoxWeight(int l, int b, int h, int weight) {
        super(l,b,h);
        this.weight = weight;
    }

    BoxWeight(int side, int weight) {
        super(side);
        this.weight = weight;
    }
}
