package com.example.demo.model;

public class Deprem {
    private String Yer;
    private double Buyukluk;

    public Deprem(String yer, double buyukluk) {
        Yer = yer;
        Buyukluk = buyukluk;
    }

    @Override
    public String toString() {
        return Yer + "  " + Buyukluk;
    }

    public String getYer() {
        return Yer;
    }

    public double getBuyukluk() {
        return Buyukluk;
    }
}
