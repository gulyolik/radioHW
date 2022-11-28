package ru.netology;
public class Radio {
    private int currentStationNumber;
    public int getCurrentStationNumber(){
        return currentStationNumber;
    }
    public void setCurrentStationNumber(int newCurrentStationNumber){
        currentStationNumber = newCurrentStationNumber;
        if(currentStationNumber<0){
            return;
        }
        if(currentStationNumber>9){
            return;
        }
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
        private int currentVolumeLevel;

    public void setCurrentVolumeLevel(int currentVolumeLevel) {
        this.currentVolumeLevel = currentVolumeLevel;
        if(currentVolumeLevel<0){
            return;
        }
        if(currentVolumeLevel>10){
            return;
        }
    }

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
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



