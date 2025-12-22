package com.inheritance;

public class BoxPrice extends BoxWeight{
    int price;

    BoxPrice() {
        super();
        this.price = price;

    }

    BoxPrice(int l, int b, int h, int weight , int price) {
        super(l,b,h,weight);
        this.price = price;
    }

    BoxPrice(BoxPrice box ,int price) {
        super(box);
        this.price = price;
    }

    BoxPrice(int side ,int weight ,int price) {
        super(side,weight);
        this.price = price;
    }

}
