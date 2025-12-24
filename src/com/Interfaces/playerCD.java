package com.Interfaces;

public class playerCD implements Media{
    @Override
    public void start() {
        System.out.println("Music Playing");
    }

    @Override
    public void stop() {
        System.out.println("Music Paused");
    }
}
