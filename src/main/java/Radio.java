public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;

    private int maxVolume;


    public Radio() {
        maxStation = 9;
        maxVolume = 100;

    }
    public Radio (int stationsCount){
       this.maxStation = stationsCount - 1;

    }


    public int getCurrentStation() {
        return currentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    //Станции
    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    // Текущая станция
    public void station() {
        if (currentStation >= maxStation) {
            currentStation++;
        }
    }

    // следущая
    public void nextStation() {
        if (currentStation > 0) {
            currentStation++;
        }
    }

    //Предыдущая станция
    public void pastStation() {
        if (currentStation > 0) {
            currentStation--;
        }
    }

    // Станция С 9 на 0
    public void lopedStation() {
        if (currentStation >= maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    // Станция с 0 на 9
    public void reverseStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    //Текущая громкость
    public void volume() {
        if (currentVolume <= 0) {
            currentVolume++;
        }
    }

    //Повышение громкости
    public void nextVolume() {
        if (currentVolume > 0) {
            currentVolume++;
        }
    }

    //граничная
    public void pastVolume() {
        if (currentVolume >= maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    //
    public void volumem() {
        if (currentVolume > 0) {
            currentVolume--;
        }


    }
}
