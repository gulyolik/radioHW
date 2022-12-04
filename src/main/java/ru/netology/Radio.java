package ru.netology;
public class Radio {
    private int currentStationNumber;
    private int currentVolumeLevel;
    public int getCurrentStationNumber(){

        return currentStationNumber;
    }
    public void setCurrentStationNumber(int currentStationNumber){
        if(currentStationNumber<0){
            return;
        }
        if(currentStationNumber>9){
            return;
        }
        this.currentStationNumber = currentStationNumber;
        }

    public void setCurrentVolumeLevel(int currentVolumeLevel) {
        if(currentVolumeLevel<0){
            return;
        }
        if(currentVolumeLevel>10){
            return;
        }
        this.currentVolumeLevel = currentVolumeLevel;
    }

    public int getCurrentVolumeLevel() {

        return currentVolumeLevel;
    }

    public void nextStationNumber() {
        int next = currentStationNumber + 1;
        currentStationNumber = next;
        if (currentStationNumber>9) {
            currentStationNumber = 0;
        }

    }
        public void prevStationNumber(){
            int prev = currentStationNumber - 1;
            currentStationNumber = prev;
            if(currentStationNumber<0){
                currentStationNumber = 9;
            }
        }

    public void increaseVolume(){
        if(currentVolumeLevel<10){
            currentVolumeLevel = currentVolumeLevel+1;
        }
        else{
            currentVolumeLevel = 0;
        }

    }

    public void decreaseVolume(){
        if(currentVolumeLevel>0){
            currentVolumeLevel = currentVolumeLevel-1;
        }
        else {
            currentVolumeLevel = 10;
        }
    }

}



