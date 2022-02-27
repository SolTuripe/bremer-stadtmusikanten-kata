package com.KataBremen.KataBremen.AnimalTest;

import com.KataBremen.KataBremen.Animal.Animal;
import com.KataBremen.KataBremen.Animal.Cat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.*;

import com.KataBremen.KataBremen.Animal.Director;
import com.KataBremen.KataBremen.Animal.Donkey;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class BremenTest {

    @Test
    void CatsHaveANameAndASound(){
        Cat cat = new Cat("Tobi", "Miau");
        assertThat(cat.getName(), equalTo("Tobi"));
        assertThat(cat.getSound(), equalTo("Miau"));
    }

    @Test
    void AtFirstCatsDoesNotSing(){
        Cat cat = new Cat();

        cat.notSing();
        assertFalse(cat.isSinging());
    }

    @Test
    void CatsCanSing(){
        Cat cat = new Cat();

        assertTrue(cat.isSinging());
    }

    @Test
    void CatsCanStopSinging() {
        Cat cat = new Cat();

        cat.isSinging();
        cat.notSing();
        assertFalse(cat.isSinging());
    }

    @Test
    void WhenCatSingSendsASinginMessage() {
        Cat cat = new Cat("Tobi", "Miau");
        cat.isSinging();

        assertThat(cat.message(), equalTo("The cat Tobi is singing Miau"));
    }

    @Test
    void WhenCatIsNotSingSendsANotSingingMessage() {
        Cat cat = new Cat("Tobi", "Miau");

        cat.notSing();
        assertThat(cat.message(), equalTo("The cat Tobi isn't singing"));
    }

    @Test
    void WhenDonkeySingSendsASingingMessage() {
        Donkey donkey = new Donkey("Mr. Bruno", "iooooioooo");

        donkey.isSinging();
        assertThat(donkey.message(), equalTo("The donkey Mr. Bruno is singing iooooioooo"));
    }

    @Test
    void WhenDonkeyIsNotSingSendsANotSingingMessage() {
        Donkey donkey = new Donkey("Mr. Bruno", "iooooioooo");

        donkey.notSing();
        assertThat(donkey.message(), equalTo("The donkey Mr. Bruno isn't singing"));
    }

    @Test
    void TheDirectorOrdersToSing() {
        ArrayList<Animal> chorus = new ArrayList();
        chorus.add(new Cat("Tobi", "Miau"));
        chorus.add(new Donkey("Mr. Bruno", "iooooioooo"));

        Director director = new Director(chorus);

        director.startSinging();

        assertEquals("The cat Tobi is singing Miau", chorus.get(0).message());
        assertEquals("The donkey Mr. Bruno is singing iooooioooo", chorus.get(1).message());
    }

    @Test
    void TheDirectorOrdersToStopSinging() {
        ArrayList<Animal> chorus = new ArrayList();
        chorus.add(new Cat("Tobi", "Miau"));
        chorus.add(new Donkey("Mr. Bruno", "iooooioooo"));

        Director director = new Director(chorus);

        director.startSinging();
        director.stopSimging();

        assertEquals("The cat Tobi isn't singing", chorus.get(0).message());
        assertEquals("The donkey Mr. Bruno isn't singing", chorus.get(1).message());
    }

}
