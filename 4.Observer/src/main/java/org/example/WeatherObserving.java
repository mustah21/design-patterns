package org.example;

public class WeatherObserving implements Observer {

    private String name;
    WeatherStation weatherStation;

    public WeatherObserving(String name) {
        this.name = name;
    }

    @Override
    public void update(int temp) {
        System.out.println(name + " received temperature: " + temp);
    }


    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer obs1 = new WeatherObserving("Observer 1");
        Observer obs2 = new WeatherObserving("Observer 2");
        Observer obs3 = new WeatherObserving("Observer 3");
        Observer obs4 = new WeatherObserving("Observer 4");
        Observer obs5 = new WeatherObserving("Observer 5");
        Observer obs6 = new WeatherObserving("Observer 6");

        weatherStation.addObserver(obs1);
        weatherStation.addObserver(obs2);
        weatherStation.addObserver(obs3);
        weatherStation.addObserver(obs4);
        weatherStation.addObserver(obs5);
        weatherStation.addObserver(obs6);

        try {

            Thread weatherThread = new Thread(weatherStation);
            weatherThread.start();

            Thread.sleep(2000);
            weatherStation.removeObserver(obs1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}