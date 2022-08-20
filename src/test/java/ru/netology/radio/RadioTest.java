package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void MaxVolume() {
        Radio rad = new Radio();


        rad.getMaxVolume();

        int expected = 100;
        int actual = rad.getMaxVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void test() {
        Radio rad = new Radio(95,5);


        Assertions.assertEquals(95, rad.getMaxVolume());
        Assertions.assertEquals(5, rad.getMinVolume());

    }
    @Test
    public void MinVolume() {
        Radio rad = new Radio();


        rad.getMinVolume();

        int expected = 0;
        int actual = rad.getMinVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void Radio() {
        Radio rad = new Radio();


        rad.getQuantityStation();

        int expected = 10;
        int actual = rad.getQuantityStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void NewNumber() {
        Radio rad = new Radio(22);


        rad.setNumber(15);

        int expected = 15;
        int actual = rad.getNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void NewNumberBefore0() {
        Radio rad = new Radio(22);


        rad.setNumber(-1);

        int expected = 0;
        int actual = rad.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NewCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(99);

        int expected = 99;
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
    public void NextNumberBefore22() {
        Radio rad = new Radio(22);
        rad.setNumber(21);

        rad.nextNumber();

        int expected = 0;
        int actual = rad.getNumber();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void NextNumberQuantityAbove() {
        Radio rad = new Radio(22);
        rad.setNumber(21);

        rad.nextNumber();

        int expected = 0;
        int actual = rad.getNumber();

        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void NextNumberQuantity() {
        Radio rad = new Radio(22);
        rad.setNumber(15);

        rad.nextNumber();

        int expected = 16;
        int actual = rad.getNumber();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void PrevNumberIf0() {
        Radio rad = new Radio(22);
        rad.setNumber(0);

        rad.prevNumber();

        int expected = 21;
        int actual = rad.getNumber();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void PrevNumberAfter0() {
        Radio rad = new Radio(22);
        rad.setNumber(1);

        rad.prevNumber();

        int expected = 0;
        int actual = rad.getNumber();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void IncreaseVolume10() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.increaseCurrentVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void IncreaseVolumeBefore10() {
        Radio rad = new Radio();
        rad.setCurrentVolume(99);

        rad.increaseCurrentVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void IncreaseVolumeBefore9() {
        Radio rad = new Radio();
        rad.setCurrentVolume(98);

        rad.increaseCurrentVolume();

        int expected = 99;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void CurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(101);


        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void SetNumber() {
        Radio rad = new Radio();

        rad.setNumber(11);


        int expected = 0;
        int actual = rad.getNumber();

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
