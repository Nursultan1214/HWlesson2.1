package com.company;

public class Gadget {
    private int date;
    private String country;
    private Color color;
    private Information information;

    public Gadget(int date, String country, Color color, Information information) {
        this.date = date;
        this.country = country;
        this.color = color;
        this.information = information;
    }

    public int getDate() {
        return date;
    }

    public String getCountry() {
        return country;
    }

    public Color getColor() {
        return color;
    }

    public Information getInformation() {
        return information;
    }
}
