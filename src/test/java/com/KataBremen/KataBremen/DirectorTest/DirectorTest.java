package com.KataBremen.KataBremen.DirectorTest;

import com.KataBremen.KataBremen.Animal.Animal;
import com.KataBremen.KataBremen.Animal.Cat;
import com.KataBremen.KataBremen.Animal.Donkey;
import com.KataBremen.KataBremen.Director.Director;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectorTest {

    @Test
    void TheDirectorOrdersToSing() {
        List<Animal> chorus = new ArrayList();
        chorus.add(new Cat("Tobi", "Miau"));
        chorus.add(new Donkey("Mr. Bruno", "iooooioooo"));

        Director director = new Director(chorus);

        director.startSinging();

        assertEquals("The cat Tobi is singing Miau", chorus.get(0).message());
        assertEquals("The donkey Mr. Bruno is singing iooooioooo", chorus.get(1).message());
    }

    @Test
    void TheDirectorOrdersToStopSinging() {
        List<Animal> chorus = new ArrayList();
        chorus.add(new Cat("Tobi", "Miau"));
        chorus.add(new Donkey("Mr. Bruno", "iooooioooo"));

        Director director = new Director(chorus);

        director.startSinging();
        director.stopSinging();

        assertEquals("The cat Tobi isn't singing", chorus.get(0).message());
        assertEquals("The donkey Mr. Bruno isn't singing", chorus.get(1).message());
    }

}
