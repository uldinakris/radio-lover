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
        if (currentVolume >= 10) {
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
        if (newCurrentChannel < 0 || newCurrentChannel > 9) {
            return;
        }

        currentChannel = newCurrentChannel;
    }

    public void nextChannel() {
        if (currentChannel < 9) {
            currentChannel = currentChannel + 1;
        } else {
            currentChannel = 0;
        }
    }

    public void prevChannel() {
        if (currentChannel > 0) {
            currentChannel = currentChannel - 1;
        } else {
            currentChannel = 9;
        }
    }
}
