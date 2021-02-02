package com.worldbiomusic.designpatten.observer.weather;

import java.util.ArrayList;
import java.util.List;

import com.worldbiomusic.designpatten.observer.Observer;
import com.worldbiomusic.designpatten.observer.Subject;

public class WeatherData implements Subject, Observer {
    private List<Observer> observers;
    private double temperature, humidity, pressure;
    private boolean changed;
    
    public WeatherData() {
	this.observers = new ArrayList<>();
    }

    public double getTemperature() {
	return temperature;
    }

    public double getHumidity() {
	return humidity;
    }

    public double getPressure() {
	return pressure;
    }

    @Override
    public void registerObserver(Observer obs) {
	this.observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
	this.observers.remove(obs);
    }

    @Override
    public void notifyObservers(Object data) {
	this.observers.forEach((obs) -> obs.update(this, data));
    }
    
    private void measurementsChanged(Subject sub, Object data) {
	if(sub instanceof CollectingStation) {
	    CollectingStation station = (CollectingStation) sub;
	    this.temperature = station.getTemperature();
	    this.humidity = station.getHumidity();
	    this.pressure = station.getPressure();
	    
	    // station에서 변경된 알림이 왔으므로 하위 Display들에게 알리기
	    this.notifyObservers(data);
	}
    }

    @Override
    public void update(Subject sub, Object data) {
	this.measurementsChanged(sub, data);
    }

}
