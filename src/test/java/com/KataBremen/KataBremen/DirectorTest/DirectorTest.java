package com.KataBremen.KataBremen.DirectorTest;

import com.KataBremen.KataBremen.Animal.Cat;
import com.KataBremen.KataBremen.Animal.Donkey;
import com.KataBremen.KataBremen.Director.Director;
import com.KataBremen.KataBremen.Singing;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DirectorTest {

    private ArrayList<Singing> chorus = new ArrayList();

    @Test
    void TheDirectorCanHaveAChorus() {
        Director director = new Director(chorus);

        assertThat(director.getChorus(), equalTo(chorus));
    }

    @Test
    void TheDirectorOrdersTheChorusToSing() {
        Director director = new Director(chorus);
        Cat cat = new Cat("Tobi", "Miau");
        Donkey donkey = new Donkey("Mr. Bruno", "iooooioooo");
        this.chorus.add(cat);
        this.chorus.add(donkey);

        director.orderStartSingChorus();

        assertEquals("The cat Tobi is singing Miau", chorus.get(0).message());
        assertEquals("The donkey Mr. Bruno is singing iooooioooo", chorus.get(1).message());
    }

    @Test
    void TheDirectorOrdersTheChorusToStopSinging() {
        Director director = new Director(chorus);
        Cat cat = new Cat("Tobi", "Miau");
        Donkey donkey = new Donkey("Mr. Bruno", "iooooioooo");
        this.chorus.add(cat);
        this.chorus.add(donkey);

        director.orderStartSingChorus();
        director.orderStopSingChorus();

        assertEquals("The cat Tobi isn't singing", chorus.get(0).message());
        assertEquals("The donkey Mr. Bruno isn't singing", chorus.get(1).message());
    }

}
