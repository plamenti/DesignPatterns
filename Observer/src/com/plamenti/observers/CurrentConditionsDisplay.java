package com.plamenti.observers;

import com.plamenti.interfaces.IDisplay;
import com.plamenti.interfaces.IObservable;
import com.plamenti.interfaces.IObserver;

public class CurrentConditionsDisplay implements IObserver, IDisplay{
    private float temperature;
    private float humidity;
    private float pressure;
    private IObservable observableSubjectWeatherData;

    public CurrentConditionsDisplay(IObservable observableSubjectWeatherData){
        this.observableSubjectWeatherData = observableSubjectWeatherData;
        this.observableSubjectWeatherData.registerObserver(this);
    }

    @Override
    public void display(){
        System.out.println("### Current weather conditions: ###");
        System.out.println("Temperature: " + this.temperature);
        System.out.println("Humidity: " + this.humidity);
        System.out.println("Pressure: " + this.pressure);
        System.out.println("#######");
    }

    @Override
    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
