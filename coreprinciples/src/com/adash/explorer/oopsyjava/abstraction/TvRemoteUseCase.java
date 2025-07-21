package com.adash.explorer.oopsyjava.abstraction;

abstract class TvRemote {

    // Does defining variables makes sense here ? public & private
    public String channel;
    public int volume;

    public TvRemote() {
        System.out.println("This is default / non-parameterized constructor");
    }

    // What is the use of args constructor here ?
    public TvRemote(String channel, int volume) {
        this.channel = channel;
        this.volume = volume;
        System.out.println("Channel is :" + channel + " and volume is : " + volume);
    }

    public abstract void switchOn();

    public abstract void switchOff();

    public void defaultChannel() {
        System.out.println("Default channel is always Tarang TV+");
    }

}

class LgTvRemote extends TvRemote {

    @Override
    public void switchOn() {
        System.out.println("Switching on LG Tv remote");
    }

    @Override
    public void switchOff() {
        System.out.println("Switching off LG Tv remote");
    }
}

class SonyTvRemote extends TvRemote {

    @Override
    public void switchOn() {
        System.out.println("Switching on Sony Tv remote");
    }

    @Override
    public void switchOff() {
        System.out.println("Switching off Sony Tv remote");
    }
}

public class TvRemoteUseCase {

    public static void main(String...args) {

        TvRemote tvRemote = new LgTvRemote();
        tvRemote.switchOn();
        tvRemote.switchOff();
        tvRemote.defaultChannel();

    }
}
