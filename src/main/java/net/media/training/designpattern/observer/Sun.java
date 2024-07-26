package net.media.training.designpattern.observer;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 20, 2011
 * Time: 9:12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sun {
    private boolean isUp;
    private final Robot robot;
    private final Person person;
    private final Dog dog;
    private final Cat cat;

    public Sun(Robot robot, Person person, Dog dog, Cat cat) {
        this.robot = robot;
        this.person = person;
        this.dog = dog;
        this.cat = cat;
    }

    public boolean isUp() {
        return isUp;
    }

    public void set() {
        isUp = false;

        if (robot.isOutdoors()) {
            robot.notifySunSet();
        }

        if (person.isOutdoors()) {
            person.notifySunSet();
        }

        if (dog.isOutdoors()) {
            dog.notifySunSet();
        }

        if (cat.isOutdoors()) {
            cat.notifySunSet();
        }
    }

    public void rise() {
        isUp = true;

        if (robot.isOutdoors()) {
            robot.notifySunRose();
        }

        if (person.isOutdoors()) {
            person.notifySunRose();
        }

        if (dog.isOutdoors()) {
            dog.notifySunRose();
        }

        if (cat.isOutdoors()) {
            cat.notifySunRose();
        }
    }
}