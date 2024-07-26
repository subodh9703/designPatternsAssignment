package net.media.training.designpattern.template;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 7:59:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Ship {
    private final Screen screen;
    private final Game game;
    private final ShipType shipType;
    private double health = 100;
    private int armor = 5;
    private int engineHealth = 5;
    private int reactorHealth = 5;

    public Ship(Screen screen, Game game, ShipType shipType) {
        this.screen = screen;
        this.game = game;
        this.shipType = shipType;
    }

    public ShipType getShipType() {
        return shipType;
    }

    public void onHit(int impact) {
        if (shipType == ShipType.Frigate) {
            health -= (armor > 0 ? 1 : impact * 2.5);
            if (impact > 5 && armor <= 0)
                engineHealth -= 1;
            if (armor > 0)
                armor -= 1;

            Animation animation = null;

            if (health <= 0 || engineHealth <= 0) {
                animation = new SinkFrigateAnimation();
                game.notifyShipLost(shipType);
            } else {
                animation = new ExplodeFrigateAnimation();
            }

            animation.render(screen);
        } else if (shipType == ShipType.Destroyer) {
            health -= impact * 1.2;
            if (impact > 15)
                reactorHealth -= 1;

            Animation animation = null;

            if (health <= 0 || reactorHealth <= 0) {
                animation = new SinkDestroyerAnimation();
                game.notifyShipLost(shipType);
            } else {
                animation = new ExplodeDestroyerAnimation();
            }

            animation.render(screen);
        }
    }
}
