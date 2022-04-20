package com.KataBremen.KataBremen.Director;

import com.KataBremen.KataBremen.Singing;

import java.util.ArrayList;

public class Director {
    private ArrayList<Singing> chorus;

    public Director(ArrayList<Singing> chorus) {
        this.chorus = chorus;
        this.orderStartSingChorus();
        this.orderStopSingChorus();
    }

    public Director() {
    }

    public void orderStartSingChorus() {
        for (Singing singer : chorus) {
            singer.startSinging();
        }
    }

    public void orderStopSingChorus() {
        for (Singing singer : chorus) {
            singer.stopSinging();
        }
    }

}
