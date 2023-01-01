package com.toy.chapter02_observer.weather;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        float temperature = this.weatherData.getTemperature();

        this.tempSum += temperature;
        this.numReadings++;

        if (temperature > this.maxTemp) {
            this.maxTemp = temperature;
        }

        if (temperature < this.minTemp) {
            this.minTemp = temperature;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("평균/최고/최저 온도 = " + (this.tempSum / this.numReadings) + "/" + this.maxTemp + "/" + this.minTemp);
    }
}
