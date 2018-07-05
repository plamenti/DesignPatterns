package com.plamenti;

import com.plamenti.Observers.CurrentConditionsDisplay;
import com.plamenti.Subject.WeatherData;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(22, 75, 1024);
        weatherData.setMeasurements(23, 65, 1000);
        weatherData.setMeasurements(24, 70, 980);
    }
}
