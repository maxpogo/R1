import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldStat() {

        Radio radio = new Radio(20);
        radio.setCurrentStation(14);
        assertEquals(14, radio.getCurrentStation());

    }

    @Test
    public void shouldStatt() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldNexttStat() {
        radio.setCurrentStation(8);
        radio.nextStation();
        assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public void souldRevStation() {
        radio.setCurrentStation(0);
        radio.reverseStation();
        assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public void shouldMaxStat() {
        radio.setCurrentStation(10);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldMinStat() {
        radio.setCurrentStation(1);
        radio.reverseStation();
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldRevStat() {
        radio.setCurrentStation(9);
        radio.reverseStation();
        assertEquals(8, radio.getCurrentStation());
    }
    /////////////Звук////////////
    @Test
    public void shouldVolum(){
        radio.setCurrentVolume(46);
        radio.volume();
        assertEquals(46, radio.getCurrentVolume());

    }
    @Test
    public void shouldVol(){
        radio.setCurrentStation(0);
        radio.volume();
        assertEquals(1,radio.getCurrentVolume());
    }
    @Test
    public void shouldNextVol(){
        radio.setCurrentVolume(33);
        radio.nextVolume();
        assertEquals(34,radio.getCurrentVolume());
    }
    @Test
    public void shouldNexVol(){
        radio.setCurrentVolume(0);
        radio.nextVolume();
        assertEquals(0,radio.getCurrentVolume());
    }
    @Test
    public void shouldMaxVolume(){
        radio.setCurrentVolume(99);
        radio.pastVolume();
        assertEquals(100,radio.getCurrentVolume());
    }
    @Test
    public void shouldMaxVolum(){
        radio.setCurrentVolume(100);
        radio.pastVolume();
        assertEquals(101, radio.getCurrentVolume());
    }
    @Test
    public void shouldMaxVol(){
        radio.setCurrentVolume(101);
        radio.pastVolume();
        assertEquals(100,radio.getCurrentVolume());
    }
    @Test
    public void shouldVoll(){
        radio.setCurrentVolume(-1);
        radio.volumem();
        assertEquals(0, radio.getCurrentVolume());

    }


    // Текущая станция
    @Test

    public void shouldStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.station();
        int expected = 3;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationn() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.station();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.station();
        int expected = 10;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.nextStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNexttStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    // прошлая станция
    @Test
    public void shouldPastStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.pastStation();
        int expected = 7;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPasttStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.pastStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    //Станция с 9 на 0
    @Test
    public void shouldLopedStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.lopedStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldLopedStat() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.lopedStation();
        int expected = 10;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldLopedStationn() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.lopedStation();
        int expected = 10;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    // C 0 на 9
    @Test
    public void shouldReverseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.reverseStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReverStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.reverseStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    ///К текущей
    @Test
    public void shouldAaStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.station();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.volume();
        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldVolumee() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.volume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.nextVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldNexttVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.nextVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPastVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.pastVolume();
        int expected = 101;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldPastVolumen() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.pastVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumem() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.volumem();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumemb() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.volumem();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }


}





