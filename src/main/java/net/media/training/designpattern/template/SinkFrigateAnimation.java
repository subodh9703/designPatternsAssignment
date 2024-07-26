package net.media.training.designpattern.template;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 8:08:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class SinkFrigateAnimation implements Animation {
    public void render(Screen screen) {
        screen.show("Frigate is sinking.");
    }
}

