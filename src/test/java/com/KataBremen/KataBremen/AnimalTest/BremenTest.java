package com.KataBremen.KataBremen.AnimalTest;

import com.KataBremen.KataBremen.Animal.Cat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.*;

import com.KataBremen.KataBremen.Animal.Donkey;
import org.junit.jupiter.api.Test;


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

        cat.stopSinging();
        assertFalse(cat.isSinging());
    }

    @Test
    void CatsCanSing(){
        Cat cat = new Cat();
        assertTrue(cat.isSinging());
    }

    @Test
    void CatsCanStartSinging() {
        Cat cat = new Cat("Tobi", "Miau");
        cat.startSinging();
        assertTrue(cat.isSinging());
    }

    @Test
    void CatsCanStopSinging() {
        Cat cat = new Cat();

        cat.isSinging();
        cat.stopSinging();
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

        cat.stopSinging();
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

        donkey.stopSinging();
        assertThat(donkey.message(), equalTo("The donkey Mr. Bruno isn't singing"));
    }

}
