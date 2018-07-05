package com.plamenti.observers;

import com.plamenti.interfaces.IDisplay;
import com.plamenti.interfaces.IObservable;
import com.plamenti.interfaces.IObserver;

public class StatisticsDisplay implements IObserver, IDisplay{
    private float maxTemperature = Float.MIN_VALUE;
    private float minTemperature = Float.MAX_VALUE;
    private float maxHumidity = Float.MIN_VALUE;
    private float minHumidity = Float.MAX_VALUE;
    private float maxPressure = Float.MIN_VALUE;
    private float minPressure = Float.MAX_VALUE;
    private IObservable observableSubjectWeatherData;

    public StatisticsDisplay(IObservable observableSubjectWeatherData){
        this.observableSubjectWeatherData = observableSubjectWeatherData;
        this.observableSubjectWeatherData.registerObserver(this);
    }

    @Override
    public void display(){
        System.out.println( "### Weather statistics: ###");
        System.out.println("Max temperature: " + maxTemperature);
        System.out.println("Min temperature: " + minTemperature);
        System.out.println("Max humidity: " + maxHumidity);
        System.out.println("Min humidity: " + minHumidity);
        System.out.println("Max pressure: " + maxPressure);
        System.out.println("Min pressure: " + minPressure);
        System.out.println("#######");
    }

    @Override
    public void update(float temperature, float humidity, float pressure){
        if(temperature < minTemperature){
            minTemperature = temperature;
        }

        if(temperature > maxTemperature){
            maxTemperature = temperature;
        }

        if(humidity < minHumidity){
            minHumidity = humidity;
        }

        if(humidity > maxHumidity){
            maxHumidity = humidity;
        }

        if(pressure < minPressure){
            minPressure = pressure;
        }

        if(pressure > maxPressure){
            maxPressure = pressure;
        }

        display();
    }
}
