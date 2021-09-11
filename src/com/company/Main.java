package com.company;

public class Main {

    public static void main(String[] args) {
        Computer objectA = new Computer(12, "China", Color.BLACK, new Information("Toktogula 12", "12:34"), "15.6", 256);
        System.out.println(objectA.getInfo());
        System.out.println(objectA.getInfo(objectA.getScreenSize(), objectA.getMemory()));
        Lenovo objectB = new Lenovo(23, "Germany", Color.RED, new Information("Toktogula 876", "16:43"), "14.0", 512, true, true);
        System.out.println(objectB.getInfo());
        System.out.println(objectB.getInfo(objectB.getScreenSize(), objectB.getMemory()));
        Lenovo objectC = new Lenovo(2, "Russia", Color.WHITE, new Information("Toktogula 543", "09:09"), "13.3", 1024, true, false);
        System.out.println(objectC.getInfo());
        System.out.println(objectC.getInfo(objectC.getScreenSize(), objectC.getMemory()));
    }
}
