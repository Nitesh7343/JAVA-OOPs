package com.Interfaces;

public class niceCar implements Brake {
    private Engine engine;
    private Media player = new playerCD();

    niceCar() {
        engine = new powerEngine();
    }

    niceCar(Engine engine) {
        this.engine = engine;
    }

    void start() {
        engine.start();
    }

    void stop() {
        engine.stop();
    }

    void accelerate() {
        engine.acc();
    }

    void startMedia() {
        player.start();
    }

    void stopMedia() {
        player.stop();
    }

    public void upgradeEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void brake() {
        System.out.println("Brake");
    }
}
