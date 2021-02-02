package com.worldbiomusic.designpatten.observer.weather;

import com.worldbiomusic.designpatten.observer.Observer;
import com.worldbiomusic.designpatten.observer.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private double temperature, humidity, pressure;
    
    public CurrentConditionDisplay() {
    }

    @Override
    public void display() {
	System.out.println("==========================");
	System.out.println("CurrentConditionDisplay");
	System.out.println("temperature: " + temperature);
	System.out.println("humidity: " + humidity);
	System.out.println("pressure: " + pressure);
	System.out.println("==========================");
    }

    @Override
    public void update(Subject sub, Object data) {
	if (sub instanceof WeatherData) {
	    WeatherData weatherData = (WeatherData) sub;
	    this.temperature = weatherData.getTemperature();
	    this.humidity = weatherData.getHumidity();
	    this.pressure = weatherData.getPressure();
	    
	    // 업데이트 됬으니 display로 변경 알리기
	    this.display();
	}
    }

}
