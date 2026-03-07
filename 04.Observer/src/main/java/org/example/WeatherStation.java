package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation implements Runnable {
    private List<Observer> observers = new ArrayList<>();
    private int temperature;
    private static final int MIN_TEMP = -50;
    private static final int MAX_TEMP = 50;
    private Random random = new Random();

    public WeatherStation() {
        this.temperature = random.nextInt(101) - MAX_TEMP;   // * (MAX_TEMP - MIN_TEMP) + MIN_TEMP; // default temp
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    @Override
    public void run() {
        while (true) {
            int change = random.nextBoolean() ? 1 : -1;
            temperature += change;

            if (temperature < MIN_TEMP) temperature = MIN_TEMP;
            if (temperature > MAX_TEMP) temperature = MAX_TEMP;

            notifyObservers();

            try {
                Thread.sleep((random.nextInt(3) + 1) * 1000);
            } catch (InterruptedException e) {
                break;
            }

        }
    }
}
