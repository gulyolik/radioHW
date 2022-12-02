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
    public void shouldSearchNewMaximumStation(){
        Radio radio = new Radio(20);
        int expected = 19;
        int actual = radio.getMaxStationNumber();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSkipToTheNextStationWithNewStationsAmount(){
        Radio radio = new Radio(250);
        radio.setCurrentStationNumber(64);
        radio.nextStationNumber();
        int expected = 65;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSkipToThePreviousStationWithNewStationsAmount(){
        Radio radio = new Radio(100);
        radio.setCurrentStationNumber(0);
        radio.prevStationNumber();
        int expected = 99;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldStayOnTheMaximumVolumeLevel(){
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStayOnTheMinimumVolumeLevel(){
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolumeLevel();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSkipToTheNextVolumeLevel(){
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(12);
        radio.increaseVolume();
        int expected = 13;
        int actual = radio.getCurrentVolumeLevel();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSkipToThePreviousVolumeLevel(){
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(89);
        radio.decreaseVolume();
        int expected = 88;
        int actual = radio.getCurrentVolumeLevel();
        Assertions.assertEquals(expected,actual);
    }
}
