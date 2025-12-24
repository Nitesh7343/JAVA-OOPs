package com.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.start();
//        myCar.acc();
//        myCar.brake();
//        myCar.stop();

//        Media myPlayer = new Car();
//        myPlayer.stop(); //problem solved by using diff-diff classes.

        niceCar car = new niceCar();

        car.start();
        car.accelerate();
        car.startMedia();
        car.brake();
        car.stopMedia();
        car.stop();
        Engine newEngine = new electricEngine();
        car.upgradeEngine(newEngine);
        car.start();
        car.accelerate();
        car.startMedia();
        car.brake();
        car.stopMedia();
        car.stop();

    }
}
