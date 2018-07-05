package com.plamenti;

import com.plamenti.observers.CurrentConditionsDisplay;
import com.plamenti.observers.ForecastDisplay;
import com.plamenti.observers.StatisticsDisplay;
import com.plamenti.subject.WeatherData;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(22, 75, 1024);
        weatherData.setMeasurements(23, 65, 1000);
        weatherData.setMeasurements(24, 80, 980);
        weatherData.setMeasurements(23, 65, 1000);
    }
}
