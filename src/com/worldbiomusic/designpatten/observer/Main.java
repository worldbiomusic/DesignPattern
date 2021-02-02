package com.worldbiomusic.designpatten.observer;

import com.worldbiomusic.designpatten.observer.weather.CollectingStation;
import com.worldbiomusic.designpatten.observer.weather.CurrentConditionDisplay;
import com.worldbiomusic.designpatten.observer.weather.WeatherData;

public class Main {
    public static void main(String[] args) {
	System.out.println("START");
	// 객체 생성
	CollectingStation station = new CollectingStation();
	
	WeatherData weatherData = new WeatherData();
	
	CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
	
	// 옵저버 등록
	station.registerObserver(weatherData);
	weatherData.registerObserver(currentConditionDisplay);
	
	// station collect 시작
	station.startCollecting(5);
    }
}
