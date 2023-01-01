package com.toy.chapter02_observer.weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = this.weatherData.getTemperature();
        this.humidity = this.weatherData.getHumidity();
        this.display();
    }

    @Override
    public void display() {
        System.out.println("현태 상태: 온도 " + temperature + "F, 습도 " + humidity + "%");
    }
}
