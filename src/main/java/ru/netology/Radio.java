package ru.netology;

public class Radio {
    private int minStationNumber = 0;
    private int currentStationNumber;
    private int stationsAmount = 10;
    private int maxStationNumber = stationsAmount - 1;

    private int minVolumeLevel = 0;
    private int maxVolumeLevel = 100;
    private int currentVolumeLevel;

    public Radio(int stationsAmount) {
        this.maxStationNumber = stationsAmount -1;
    }

    public Radio() {

    }

    public int getCurrentStationNumber() {

        return currentStationNumber;
    }

    public int getMaxStationNumber() {

        return maxStationNumber;
    }

    public int getMinStationNumber() {

        return minStationNumber;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        currentStationNumber = newCurrentStationNumber;
        if (currentStationNumber < minStationNumber) {
            return;
        }
        if (currentStationNumber > maxStationNumber) {
            return;
        }
    }

    public void nextStationNumber() {
        if(currentStationNumber < maxStationNumber){
            currentStationNumber++;
        } else{
            currentStationNumber = minStationNumber;
        }

    }

    public void prevStationNumber() {
        if(maxStationNumber >= currentStationNumber & currentStationNumber > minStationNumber){
            currentStationNumber--;
        } else {
            currentStationNumber = maxStationNumber;
        }
    }


    public void setCurrentVolumeLevel(int currentVolumeLevel) {
        this.currentVolumeLevel = currentVolumeLevel;
        if (currentVolumeLevel < 0) {
            return;
        }
        if (currentVolumeLevel > 100) {
            return;
        }
    }

    public int getMaxVolumeLevel() {

        return maxVolumeLevel;
    }

    public int getMinVolumeLevel() {

        return minVolumeLevel;
    }

    public int getCurrentVolumeLevel() {

        return currentVolumeLevel;
    }

    public void increaseVolume() {
        if (currentVolumeLevel < 100) {
            currentVolumeLevel ++;
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



