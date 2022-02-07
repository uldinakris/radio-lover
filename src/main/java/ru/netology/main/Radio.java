package ru.netology.main;

public class Radio {
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int volume) {
        currentVolume = volume;
    }

    public void increaseVolume() {
        if (currentVolume >= 100) {
            return;
        }

        currentVolume = currentVolume + 1;
    }

    public void decreaseVolume() {
        if (currentVolume <= 0) {
            return;
        }

        currentVolume = currentVolume - 1;
    }

    private int currentChannel;

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel < 0 || newCurrentChannel > channelAmount) {
            return;
        }

        currentChannel = newCurrentChannel;
    }

    public void nextChannel() {
        if (currentChannel < channelAmount) {
            currentChannel = currentChannel + 1;
        } else {
            currentChannel = 0;
        }
    }

    public void prevChannel() {
        if (currentChannel > 0) {
            currentChannel = currentChannel - 1;
        } else {
            currentChannel = channelAmount;
        }
    }

    private int channelAmount;

    public Radio(int channelAmount) {
        this.channelAmount =  channelAmount - 1;
    }

    public Radio() {
        this.channelAmount = 9;
    }
}
