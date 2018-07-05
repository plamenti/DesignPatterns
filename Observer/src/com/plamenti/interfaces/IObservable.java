package com.plamenti.interfaces;

public interface IObservable{
    void registerObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers();
}
