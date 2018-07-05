package com.plamenti.Observers;

import com.plamenti.Interfaces.IDisplay;
import com.plamenti.Interfaces.IObservable;
import com.plamenti.Interfaces.IObserver;

public class ForecastDisplay implements IObserver, IDisplay{
    private float temperature;
    private float humidity;
    private float lastHumidity;
    private float pressure;
    private float lastPressure;
    private IObservable observableSubjectWeatherData;

    public ForecastDisplay(IObservable observableSubjectWeatherData){
        this.observableSubjectWeatherData = observableSubjectWeatherData;
        this.observableSubjectWeatherData.registerObserver(this);
        this.humidity = 75;
        this.pressure = 1000;
    }

    @Override
    public void display(){
        System.out.println( "### Weather forecast: ###");
        if(lastHumidity > humidity && lastPressure < pressure){
            System.out.println("The weather is going to be bad!");
        } else if(lastHumidity == humidity && lastPressure == pressure){
            System.out.println("The weather is going to be the same!");
        } else if(lastHumidity < humidity && lastPressure > pressure){
            System.out.println("The weather is going to be better!");
        } else{
            System.out.println("The weather is going to be the same but watch out for possible changes!");
            System.out.println("Just keep an eye on our forecast service!");
        }

        System.out.println("#######");
    }

    @Override
    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.lastHumidity = humidity;
        this.lastPressure = pressure;
        display();
    }
}
