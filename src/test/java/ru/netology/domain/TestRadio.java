package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRadio {

    Radio rad = new Radio();


    //-------------------------- переключение станций вперед-----------------------
    @Test
    public void increaseRadioStation()// - след станция
    {
        rad.setCurrentRadioStation(7);
        rad.increaseRadioStation();
        assertEquals(8, rad.getCurrentRadioStation());
    }

    @Test
    public void overIncreaseMaxRadioStation()//- след станция после границы 9 станции
    {
        rad.setCurrentRadioStation(9);
        rad.increaseRadioStation();
        assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void wrongIncreaseMaxRadioStation()// - след станция если бы не было границы в 9 станций
    {
        rad.setCurrentRadioStation(9);
        rad.increaseRadioStation();
        assertEquals(10, rad.getCurrentRadioStation());
    }

    @Test
    @Disabled
    public void wrongIncreaseRadioStation()// - негативное значение в выбранной станции с послед.повышением
    {
        rad.setCurrentRadioStation(12);
        rad.increaseRadioStation();
        assertEquals(0, rad.getCurrentRadioStation());
    }

    //--------------------------переключение станций назад----------------------------------------
    @Test
    public void reduceRadioStation() {
        rad.setCurrentRadioStation(7);//-- пред станция
        rad.reduceRadioStation();
        assertEquals(6, rad.getCurrentRadioStation());
    }

    @Test
    public void overReduceMinRadioStation() {//-- пред станция за выходом границы в 0 станцию
        rad.setCurrentRadioStation(0);
        rad.reduceRadioStation();
        assertEquals(9, rad.getCurrentRadioStation());
    }

    @Test
    public void wrongReduceMinRadioStation() {//--след станция если бы не было границы в 0
        rad.setCurrentRadioStation(0);
        rad.reduceRadioStation();
        assertEquals(-1, rad.getCurrentRadioStation());
    }

    @Test
    @Disabled
    public void wrongReduceRadioStation() {//-- негативное значение в выбранной станции с послед ее уменьшением
        rad.setCurrentRadioStation(-1);
        rad.reduceRadioStation();
        assertEquals(-2, rad.getCurrentRadioStation());
    }


    //-----------------------------------------увеличение громкости------------------
    @Test
    public void increaseVolume() {//-- увел гром-ти

        rad.setCurrentVolume(5);
        rad.increaseVolume();
        assertEquals(6, rad.getCurrentVolume());
    }

    @Test
    public void increaseMaxVolume() {//-- увел максимально гром-ти

        rad.setCurrentVolume(10);
        rad.increaseVolume();
        assertEquals(10, rad.getCurrentVolume());
    }

    @Test
    public void wrongIncreaseMaxVolume() {//-- увел максимально гром-ти без ограничиения

        rad.setCurrentVolume(10);
        rad.increaseVolume();
        assertEquals(11, rad.getCurrentVolume());
    }

    @Test
    @Disabled
    public void wrongIncreaseVolume() {//-- негативное  значение увел максимально гром-ти без ограничиения

        rad.setCurrentVolume(12);
        rad.increaseVolume();
        assertEquals(13, rad.getCurrentVolume());
    }
    //---------------------------------уменьшение громкости----------------------

    @Test
    public void reduceVolume() {//-- умен. гром-ти

        rad.setCurrentVolume(6);
        rad.reduceVolume();
        assertEquals(5, rad.getCurrentVolume());
    }

    @Test
    public void reduceMinVolume() {//-- умен. мин. гром-ти

        rad.setCurrentVolume(0);
        rad.reduceVolume();
        assertEquals(0, rad.getCurrentVolume());
    }
    @Test
    public void wrongReduceMinVolume() {//-- умен. минимально гром-ти без ограничиения

        rad.setCurrentVolume(0);
        rad.increaseVolume();
        assertEquals(-1, rad.getCurrentVolume());
    }

    @Test
    @Disabled
    public void wrongReduceVolume() {//-- негативное  значение умен минимальной гром-ти без ограничиения

        rad.setCurrentVolume(-1);
        rad.increaseVolume();
        assertEquals(-2, rad.getCurrentVolume());
    }


}
