package ru.netology;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Radio {

    private int minStationNumber = 0;
    private int currentStationNumber;
    private int stationsAmount = 10;
    private int maxStationNumber = stationsAmount - 1;

    private int minVolumeLevel = 0;
    private int maxVolumeLevel = 100;
    private int currentVolumeLevel;

    public Radio(int stationsAmount) {
        this.maxStationNumber = stationsAmount - 1;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber < 0) {
            return;
        }
        if (newCurrentStationNumber > maxStationNumber) {
            return;
        }
        this.currentStationNumber = newCurrentStationNumber;
    }

    public void nextStationNumber() {
        if (currentStationNumber < maxStationNumber) {
            currentStationNumber++;
        } else {
            currentStationNumber = minStationNumber;
        }

    }

    public void prevStationNumber() {
        if (currentStationNumber > 0) {
            currentStationNumber--;
        } else {
            currentStationNumber = maxStationNumber;
        }

    }

    public void setCurrentVolumeLevel(int currentVolumeLevel) {
        if (currentVolumeLevel < 0) {
            return;
        }
        if (currentVolumeLevel > 100) {
            return;
        }
        this.currentVolumeLevel = currentVolumeLevel;
    }

    public void increaseVolume() {
        if (currentVolumeLevel < 100) {
            currentVolumeLevel++;
        } else {
            currentVolumeLevel = maxVolumeLevel;
        }
    }

    public void decreaseVolume() {
        if (currentVolumeLevel > 0) {
            currentVolumeLevel = currentVolumeLevel - 1;
        } else {
            currentVolumeLevel = minVolumeLevel;
        }
    }


}



