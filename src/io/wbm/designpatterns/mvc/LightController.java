package io.wbm.designpatterns.mvc;

public class LightController implements OnOffController {
    LightView view;
    OnOffModel model;

    public LightController(OnOffModel model) {
        this.view = new LightView(this);
        this.model = model;
        this.model.registerObserver(this.view);

        System.out.println(this.view);
        this.view.pressSwitcher();
        System.out.println(this.view);
    }

    @Override
    public void press() {
        if (this.model.state() == true) {
            this.model.off();
        } else {
            this.model.on();
        }
    }
}
