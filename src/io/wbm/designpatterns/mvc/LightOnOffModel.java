package io.wbm.designpatterns.mvc;

import java.util.ArrayList;
import java.util.List;

public class LightOnOffModel implements OnOffModel {
    List<Observer> observers;
    boolean active;

    public LightOnOffModel() {
        this.observers = new ArrayList<>();
        this.active = false;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(o -> o.update(this.active + ""));
    }

    @Override
    public void on() {
        this.active = true;
        notifyObservers();
    }

    @Override
    public void off() {
        this.active = false;
        notifyObservers();
    }

    @Override
    public boolean state() {
        return this.active;
    }
}
