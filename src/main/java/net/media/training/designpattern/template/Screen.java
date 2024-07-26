package net.media.training.designpattern.template;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 8:00:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Screen {
    private String s = "";

    public void show(String msg) {
        s += msg;
        s += "\n";
        s = s.trim();
    }

    public String getPrintedData() {
        return s;
    }
}
