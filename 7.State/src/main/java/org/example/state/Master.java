package org.example.state;

import org.example.State;
import org.example.Character;

public class Master extends State{

    public Master(Character character) {
        super(character);
    }

    @Override
    protected void action() {
        System.out.println("\n\n-----Printing report-----");
        System.out.println(getCharacter().getName() +
                " experience points: " + getCharacter().getExperiencePoints()
                + " Health points: " + getCharacter().getHealthPoints()
                + " Level: " + getCharacter().getState().toString());

        System.out.println("\nGame Over. Thanks for playing!");
        System.exit(0);
    }

}
