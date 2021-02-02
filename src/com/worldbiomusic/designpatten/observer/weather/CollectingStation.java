package com.worldbiomusic.designpatten.observer.weather;

import java.util.ArrayList;
import java.util.List;

import com.worldbiomusic.designpatten.observer.Observer;
import com.worldbiomusic.designpatten.observer.Subject;

public class CollectingStation implements Subject {
    private List<Observer> observers;
    private double temperature, humidity, pressure;
    private double dust, wind, co1, co2;

    public CollectingStation() {
	this.observers = new ArrayList<>();
    }

    public void startCollecting(int repeatDelay) {
	new Thread(new Runnable() {

	    @Override
	    public void run() {
		while (true) {
		    collectData();
		    try {
			Thread.sleep(1000 * repeatDelay);
		    } catch (Exception e) {
			e.printStackTrace();
		    }
		}
	    }
	}).start();
    }

    private void collectData() {
	// 랜덤값으로 값 collect
	this.temperature = (int) (Math.random() * 100);
	this.humidity = (int) (Math.random() * 100);
	this.pressure = (int) (Math.random() * 100);
	this.dust = (int) (Math.random() * 100);
	this.wind = (int) (Math.random() * 100);
	this.co1 = (int) (Math.random() * 100);
	this.co2 = (int) (Math.random() * 100);

	// 수집했으므로 알리기
	this.notifyObservers(null);
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

    public double getDust() {
	return dust;
    }

    public double getWind() {
	return wind;
    }

    public double getCo1() {
	return co1;
    }

    public double getCo2() {
	return co2;
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

}
