package com.KataBremen.KataBremen.Animal;

import java.util.ArrayList;

public class Director {
    ArrayList<Animal> chorus = new ArrayList();

    public Director(ArrayList<Animal> chorus) {
        this.chorus = chorus;
    }

    public void startSinging() {
        for (Animal animal : chorus) {
            animal.isSinging();
        }
    }

    public void stopSimging() {
        for (Animal animal : chorus) {
            animal.notSing();
        }
    }

}
