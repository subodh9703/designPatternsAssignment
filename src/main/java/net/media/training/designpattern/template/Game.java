package net.media.training.designpattern.template;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 8:01:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Game {
    private final Screen screen;

    public Game(Screen screen) {
        this.screen = screen;
    }

    public void notifyShipLost(ShipType shipType) {
        screen.show(shipType.toString() + " lost.");
    }
}
