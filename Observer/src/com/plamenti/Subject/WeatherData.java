package com.plamenti.Subject;

import com.plamenti.Interfaces.IObservable;
import com.plamenti.Interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements IObservable{
    List<IObserver> observers;
    float temperature;
    float humidity;
    float pressure;

    public WeatherData(){
        this.observers = new ArrayList<IObserver>();
    }

    public float getTemperature(){
        return temperature;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged(){
        // Here could be added some logic to decide if to notify observers
        // E.g. if some delta is reached - temperature delta is > than 0.5 and etc
        notifyObservers();
    }

    @Override
    public void addObserver(IObserver observer){
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer){
        int observerIndex = this.observers.indexOf(observer);

        if(observerIndex > -1){
            this.observers.remove(observerIndex);
        }
    }

    @Override
    public void notifyObservers(){
        for(IObserver observer:
            this.observers){
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }
}
