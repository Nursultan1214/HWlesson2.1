package com.company;

public final class Lenovo extends Computer{
    private boolean isHaveBluetooth;
    private boolean isHaveBacklight;

    public Lenovo(int date, String country, Color color, Information information, String screenSize, int memory, boolean isHaveBluetooth, boolean isHaveBacklight) {
        super(date, country, color, information, screenSize, memory);
        this.isHaveBluetooth = isHaveBluetooth;
        this.isHaveBacklight = isHaveBacklight;
    }

    public boolean isHaveBluetooth() {
        return isHaveBluetooth;
    }

    public boolean isHaveBacklight() {
        return isHaveBacklight;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Bluetooth:" + isHaveBluetooth() + " Backlight:" + isHaveBacklight();
    }
}
