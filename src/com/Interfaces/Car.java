package com.Interfaces;

public class Car implements Brake,Engine{

    @Override
    public void brake() {
        System.out.println("Break : True");
    }

    @Override
    public void start() {
        System.out.println("Start : True , Stop : False");
    }

    @Override
    public void stop() {
        System.out.println("Start : False , Stop : True");
    }

    @Override
    public void acc() {
        System.out.println("UP : True");
    }
}
