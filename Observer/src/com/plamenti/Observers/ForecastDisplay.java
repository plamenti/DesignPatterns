package com.plamenti.Observers;

import com.plamenti.Interfaces.IDisplay;
import com.plamenti.Interfaces.IObservable;
import com.plamenti.Interfaces.IObserver;

public class ForecastDisplay implements IObserver, IDisplay{
    private float temperature;
    private float lastTemperature;
    private float humidity;
    private float lastHumidity;
    private float pressure;
    private float lastPressure;
    private IObservable observableSubjectWeatherData;

    public ForecastDisplay(IObservable observableSubjectWeatherData){
        this.observableSubjectWeatherData = observableSubjectWeatherData;
        this.observableSubjectWeatherData.registerObserver(this);
        this.temperature = 20;
        this.humidity = 75;
        this.pressure = 1000;
    }

    @Override
    public void display(){
        System.out.println( "### Weather forecast: ###");
        if(lastHumidity > humidity && lastPressure < pressure){
            System.out.println("The weather is going to be bad!");
            System.out.println("Expected temperature: " + (this.temperature - 2));
            updateMeasurements();
        } else if(lastHumidity == humidity && lastPressure == pressure){
            System.out.println("The weather is going to be the same!");
            System.out.println("Expected temperature: " + this.temperature);
        } else if(lastHumidity < humidity && lastPressure > pressure){
            System.out.println("The weather is going to be better!");
            System.out.println("Expected temperature: " + (this.temperature + 2));
            updateMeasurements();
        } else{
            System.out.println("The weather is going to be the same but watch out for possible changes!");
            System.out.println("Just keep an eye on our forecast service!");
            updateMeasurements();
        }

        System.out.println("#######");
    }

    private void updateMeasurements(){
        this.temperature = lastTemperature;
        this.humidity = lastHumidity;
        this.pressure = lastPressure;
    }

    @Override
    public void update(float temperature, float humidity, float pressure){
        this.lastTemperature = temperature;
        this.lastHumidity = humidity;
        this.lastPressure = pressure;
        display();
    }
}
