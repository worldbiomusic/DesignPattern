package com.worldbiomusic.designpatten.observer.weather;

import com.worldbiomusic.designpatten.observer.Observer;
import com.worldbiomusic.designpatten.observer.Subject;

public class ThirdPartyDisplay implements Observer, DisplayElement{
    private WeatherData weatherData;
    public ThirdPartyDisplay() {
    }

    @Override
    public void display() {
    }

    @Override
    public void update(Subject sub, Object data) {
	if (sub instanceof WeatherData) {
	    WeatherData weatherData = (WeatherData) sub;
	    // 업데이트 됬으니 display로 변경 알리기
	    this.display();
	}
    }
}
