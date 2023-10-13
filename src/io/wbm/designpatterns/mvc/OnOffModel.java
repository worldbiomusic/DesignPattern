package io.wbm.designpatterns.mvc;

public interface OnOffModel extends Observable{
    void on();
    void off();
    boolean state();
}
