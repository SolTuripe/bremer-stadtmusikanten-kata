package com.KataBremen.KataBremen.ComicCharacterTest;

import com.KataBremen.KataBremen.Animal.Cat;
import com.KataBremen.KataBremen.Animal.Donkey;
import com.KataBremen.KataBremen.ComicCharacter.ComicCharacter;
import com.KataBremen.KataBremen.Singing;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComicCharacterTest {

    private ArrayList<Singing> chorus = new ArrayList();

    @Test
    void ChorusCanHaveComicCharacter() {
        Cat cat = new Cat("Tobi", "Miau");
        Donkey donkey = new Donkey("Mr. Bruno", "iooooioooo");
        ComicCharacter scarletWitch = new ComicCharacter();

        this.chorus.add(cat);
        this.chorus.add(donkey);
        this.chorus.add(scarletWitch);

        assertThat(chorus.size(), equalTo(3));
        assertEquals("The cat Tobi is singing Miau", chorus.get(0).message());
        assertEquals("The donkey Mr. Bruno is singing iooooioooo", chorus.get(1).message());
        assertEquals("scarletWitch is singing", chorus.get(2).message());
    }

}
