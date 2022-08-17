package ru.netology.radio;

public class Radio {
    private int number;
    private int currentVolume;

    public void nextNumber() {

        if (number < 9) {
            number++;
        } else {
            number = 0;
        }
    }

    public void prevNumber() {
        if (number > 0) {
            number--;

        } else {
            number = 9;
        }
    }

    public void increaseCurrentVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        } else {
            currentVolume = 10;
        }
    }

    public void decreaseCurrentVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

    public int getNumber() {

        return number;
    }

    public void setNumber(int newNumber) {

        if (newNumber > 9) {
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
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }

        currentVolume = newCurrentVolume;

    }


}


