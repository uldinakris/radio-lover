package ru.netology.main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.decreaseVolume();

        int expected = 7;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(8);

        int expected = 8;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(10);

        int expected = 0;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentChannelLessZero() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-1);

        int expected = 0;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(4);
        radio.nextChannel();

        int expected = 5;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextChannelAfterNine() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.nextChannel();

        int expected = 0;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(4);
        radio.prevChannel();

        int expected = 3;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevChannelAfterZero() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.prevChannel();

        int expected = 9;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }
}