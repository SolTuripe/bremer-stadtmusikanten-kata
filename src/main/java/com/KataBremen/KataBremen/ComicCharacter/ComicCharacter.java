package com.KataBremen.KataBremen.ComicCharacter;

import com.KataBremen.KataBremen.Singing;

public class ComicCharacter implements Singing {
    protected boolean isSinging = true;

    public boolean isSinging() {
        return isSinging;
    }

    public boolean startSinging() {
        return this.isSinging = true;
    }

    public boolean stopSinging() {
        return this.isSinging = false;
    }

    @Override
    public String message() {
        if(this.isSinging) {
            return "scarletWitch is singing";
        }
        return "scarletWitch isn't singing";
    }
}
