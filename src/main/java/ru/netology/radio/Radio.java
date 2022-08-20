package ru.netology.radio;

public class Radio {


    private int number;
    private int quantityStation;


    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio() {
        this.quantityStation = 10;

    }

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;

    }
    public int getQuantityStation() {

        return quantityStation;
    }

    public Radio(int maxVolume, int minVolume) {
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = minVolume;

    }


    public int getMaxVolume() {

        return maxVolume;
    }
    public int getMinVolume() {

        return minVolume;
    }


    public void nextNumber() {

        if (number < quantityStation - 1) {
            number++;
        } else {
            number = 0;
        }
    }

    public void prevNumber() {
        if (number > 0) {
            number--;

        } else {
            number = quantityStation - 1;
        }
    }

    public void increaseCurrentVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseCurrentVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

    public int getNumber() {

        return number;
    }

    public void setNumber(int newNumber) {

        if (newNumber > quantityStation - 1) {
            return;
        }
        if (newNumber < 0) {
            return;
        }
        number = newNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }

        currentVolume = newCurrentVolume;

    }


}


