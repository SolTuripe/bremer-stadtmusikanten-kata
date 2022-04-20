package com.KataBremen.KataBremen.ComicCharacter;

import com.KataBremen.KataBremen.Singing;

public class ComicCharacter implements Singing {
    protected boolean isSinging = false;

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
        return null;
    }
}
