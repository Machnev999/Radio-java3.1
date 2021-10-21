package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;


    public int getCurrentRadioStation() { // - какая радиостанция текущая
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {// - завершение проги,если выход за границы.вбивать пультом мы можем только от 0 до 9.

        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void increaseRadioStation() {// увеличение радиостанции на 1
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void reduceRadioStation() {// уменьшение радиостанции на 1
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }


        public void increaseVolume(){// увеличение громкости на 1
            if (currentVolume < maxVolume) {
                currentVolume = currentVolume + 1;
            }
            else {
                currentVolume = maxVolume;
            }
        }


    public void reduceVolume() {// уменьшение громкости на 1
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}

