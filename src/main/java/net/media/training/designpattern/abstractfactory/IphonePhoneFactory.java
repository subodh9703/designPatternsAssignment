package net.media.training.designpattern.abstractfactory;

public class IphonePhoneFactory implements PhoneFactory{
    @Override
    public MotherBoard createMotherBoard() {
        IphoneMotherBoard iphoneMotherBoard= new IphoneMotherBoard();
        iphoneMotherBoard.attachBattery(new Battery());
        iphoneMotherBoard.attachProcessor(new IphoneProcessor());
        return iphoneMotherBoard;
    }

    @Override
    public Screen createScreen() {
        return new IphoneScreen();
    }

    @Override
    public Case createCase() {
        return new IphoneCase();
    }
}
