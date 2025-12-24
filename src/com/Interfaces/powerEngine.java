package com.Interfaces;

public class powerEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Power Engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine stopped");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine accelerates");
    }
}
