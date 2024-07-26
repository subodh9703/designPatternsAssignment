package net.media.training.designpattern.abstractfactory;

public interface PhoneFactory {
    MotherBoard createMotherBoard();
    Screen createScreen();
    Case createCase();
}
