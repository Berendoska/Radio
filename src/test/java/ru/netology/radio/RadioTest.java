package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void NewNumber() {
        Radio rad = new Radio();


        rad.setNumber(15);

        int expected = 0;
        int actual = rad.getNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void NewNumberBefore0() {
        Radio rad = new Radio();


        rad.setNumber(-1);

        int expected = 0;
        int actual = rad.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NewCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(11);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void NewCurrentVolumeBefore0() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextNumberBefore9() {
        Radio rad = new Radio();
        rad.setNumber(8);

        rad.nextNumber();

        int expected = 9;
        int actual = rad.getNumber();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void NextNumber9() {
        Radio rad = new Radio();
        rad.setNumber(9);

        rad.nextNumber();

        int expected = 0;
        int actual = rad.getNumber();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void PrevNumberIf0() {
        Radio rad = new Radio();
        rad.setNumber(0);

        rad.prevNumber();

        int expected = 9;
        int actual = rad.getNumber();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void PrevNumberAfter0() {
        Radio rad = new Radio();
        rad.setNumber(1);

        rad.prevNumber();

        int expected = 0;
        int actual = rad.getNumber();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void IncreaseVolume10() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.increaseCurrentVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void IncreaseVolumeBefore10() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);

        rad.increaseCurrentVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void IncreaseVolumeBefore9() {
        Radio rad = new Radio();
        rad.setCurrentVolume(8);

        rad.increaseCurrentVolume();

        int expected = 9;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void DecreaseVolume0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.decreaseCurrentVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void DecreaseVolumeAfter0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        rad.decreaseCurrentVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void DecreaseVolumeAfter1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(2);

        rad.decreaseCurrentVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }
}
