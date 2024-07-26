package net.media.training.designpattern.abstractfactory;

public class AndroidPhoneFactory implements PhoneFactory{

    @Override
    public MotherBoard createMotherBoard() {
        AndroidMotherBoard androidMotherBoard= new AndroidMotherBoard();
        androidMotherBoard.attachBattery(new Battery());
        androidMotherBoard.attachProcessor(new AndroidProcessor());
        return androidMotherBoard;
    }

    @Override
    public Screen createScreen() {
        return new AndroidScreen();
    }

    @Override
    public Case createCase() {
        return new AndroidCase();
    }
}
