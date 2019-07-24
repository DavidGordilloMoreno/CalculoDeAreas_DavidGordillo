package Clases;

import Interfaces.IProductora;

public class Productora implements IProductora {

    long seconds;
    long n;

    public void setFrequency(long seconds) {
        this.seconds = 1000;
    }

    public long getFrequency() {
        return seconds;
    }

    public void setNumberOfFigures(long n) {
        this.n = 100;
    }

    public long getNumberOfFigures() {
        return n;
    }
}