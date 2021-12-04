package me.yosif.adventofcode;

public class Measurement {

    Integer i;

    public Measurement(Integer i) {
        this.i = i;
    }

    public Integer getValue() {
        return i;
    }

    public boolean isMoreThan(Measurement measurement) {
        return getValue() > measurement.getValue();
    }

}
