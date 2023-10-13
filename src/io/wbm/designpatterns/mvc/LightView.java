package io.wbm.designpatterns.mvc;

public class LightView implements Observer {
    OnOffController controller;
    boolean light;

    public LightView(OnOffController controller) {
        this.controller = controller;
    }

    public void pressSwitcher() {
        this.controller.press();
    }

    @Override
    public void update(String msg) {
        if (msg.equals("true")) {
            this.light = true;
        } else if (msg.equals("false")) {
            this.light = false;
        }
    }

    @Override
    public String toString() {
        return "LightView{" +
                "light=" + light +
                '}';
    }
}
