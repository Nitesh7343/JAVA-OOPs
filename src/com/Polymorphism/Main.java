package com.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes s1 = new Shapes();
        Circle ci = new Circle();
        Square sq = new Square();
        Triangle tri1 = new Triangle();
        Shapes tri2 = new Triangle();

        tri1.area();
        tri1.area();
        sq.area();


    }
}
