package com.KataBremen.KataBremen.Director;

import com.KataBremen.KataBremen.Animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Director {
    List<Animal> chorus = new ArrayList();

    public Director(List<Animal> chorus) {
        this.chorus = chorus;
    }

    public void startSinging() {
        for (Animal animal : chorus) {
            animal.isSinging();
        }
    }

    public void stopSinging() {
        for (Animal animal : chorus) {
            animal.notSing();
        }
    }

}
