package com.company;

public class Computer extends Gadget{
    private String screenSize;
    private int memory;

    public Computer(int date, String country, Color color, Information information, String screenSize, int memory) {
        super(date, country, color, information);
        this.screenSize = screenSize;
        this.memory = memory;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public int getMemory() {
        return memory;
    }

    public String getInfo(){
        return "Дата:" + getDate() + " Страна:" + getCountry() + " Цвет:" + getColor() + " Адрес:" + getInformation().getAddress()
        + " Время:" + getInformation().getTime() + " Размер:" + getScreenSize() + " Память:" + getMemory();
    }

    public final String getInfo(String screenSize, int memory){
        return "Размер:" + screenSize + " Память:" + memory;
    }
}
