package org.example;

public abstract class State {

    private Character character;

    public State(Character character){
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    protected abstract void action();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
