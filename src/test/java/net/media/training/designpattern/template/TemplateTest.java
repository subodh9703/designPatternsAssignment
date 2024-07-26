package net.media.training.designpattern.template;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 8:33:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class TemplateTest {
    @Test
    public void BasicStuffWorks() {
        Screen screen = new Screen();
        Game game = new Game(screen);

        Ship frigate = new Ship(screen, game, ShipType.Frigate);
        Ship destroyer = new Ship(screen, game, ShipType.Destroyer);

        frigate.onHit(50);
        destroyer.onHit(50);
        frigate.onHit(50);
        destroyer.onHit(50);

        String printedData = "Frigate is exploding.Destroyer is exploding.Frigate is exploding.Destroyer lost.Destroyer is sinking.";
        assertEquals("Screen should contain expected data", printedData, screen.getPrintedData());
    }
}
