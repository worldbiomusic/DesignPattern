package io.wbm.designpatterns.mvc;

public class MVCMain {
    public static void main(String[] args) {
        System.out.println("start");

        OnOffModel m = new LightOnOffModel();
        OnOffController c = new LightController(m);
    }
}
