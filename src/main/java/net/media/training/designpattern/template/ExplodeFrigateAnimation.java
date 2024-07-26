package net.media.training.designpattern.template;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 8:12:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExplodeFrigateAnimation implements Animation {
    public void render(Screen screen) {
        screen.show("Frigate is exploding.");
    }
}
