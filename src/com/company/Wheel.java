package com.company;

public class Wheel {

    private int wheelSize;
    private String firmName;

    public Wheel() {

        this.setFirmName(firmName);
        this.setWheelSize(wheelSize);

    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }
}
