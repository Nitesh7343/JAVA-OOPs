package com.Interfaces;

public class electricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine stopped");
    }

    @Override
    public void acc() {
        System.out.println("Electric Engine accelerates");
    }
}
