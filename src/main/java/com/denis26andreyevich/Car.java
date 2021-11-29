package com.denis26andreyevich;
import java.time.LocalDate;

public class Car {
    private double bak;
    private double rashodNaStoKm;
    private LocalDate techOsmotr;

    public double getBak() {
        return bak;
    }

    public double getRashodNaStoKm() {
        return rashodNaStoKm;
    }

    public LocalDate getTechOsmotr() {
        return techOsmotr;
    }

    public void setBak(double bak) {
        this.bak = bak;
    }

    public void setRashodNaStoKm(double rashodNaStoKm) {
        this.rashodNaStoKm = rashodNaStoKm;
    }

    public void setTechOsmotr(int year, int month, int day) {
        this.techOsmotr = LocalDate.of(year, month, day);
    }

    public Car (double bak, double rashodNaStoKm, int year, int month, int day) {
        this.bak = bak;
        this.rashodNaStoKm = rashodNaStoKm;
        this.techOsmotr = LocalDate.of(year, month, day);
    }

    public Car(){

    }
    public boolean CarMove(){
        return bak > 0;
    }

    public double CarRiding(){
        return  bak / rashodNaStoKm * 100;
    }
    public boolean TechTime() {
        LocalDate currentDate = LocalDate.now();
        LocalDate checkTime = currentDate.minusYears(2);
        return techOsmotr.isAfter(checkTime);
    }
}