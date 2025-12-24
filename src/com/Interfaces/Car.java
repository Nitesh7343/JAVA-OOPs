package com.Interfaces;

public class Car implements Brake,Engine,Media{

    @Override
    public void brake() {
        System.out.println("Car : Break : True");
    }

    @Override
    public void start() {
        System.out.println("Car : Start : True , Stop : False");
    }

    @Override
    public void stop() {
        System.out.println("Car : Start : False , Stop : True");
    }

    @Override
    public void acc() {
        System.out.println("Car : Speed : Up");
    }
}
