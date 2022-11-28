package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSkipToTheNextStation(){
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.nextStationNumber();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldSkipToThePreviousStation(){
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.prevStationNumber();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSkipToTheNextVolumeLevel(){
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(10);
        radio.increaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSkipToThePreviousVolumeLevel(){
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(0);
        radio.decreaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolumeLevel();
        Assertions.assertEquals(expected,actual);
    }
}
