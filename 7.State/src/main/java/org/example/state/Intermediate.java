package org.example.state;

import org.example.Character;
import org.example.State;

public class Intermediate extends State {

    public Intermediate(Character character) {
        super(character);
    }

    @Override
    public void action() {
        String[] options = {"Training? ", "Meditating? ", "Fly to expert level? "};
        switch (this.getCharacter().readUserChoice(options)) {
            case 1:

                if (this.getCharacter().getExperiencePoints() < 69) {

                    this.getCharacter().setExperiencePoints(this.getCharacter().getExperiencePoints() + 10);

                    System.out.println(getCharacter().getName() + "'s" +
                            " experience points: , " + getCharacter().getExperiencePoints()
                            + ", Health points: " + getCharacter().getHealthPoints()
                            + ", Level: " + getCharacter().getState().toString());

                } else {
                    System.out.println("You cannot collect any more experience pts at this level");
                }

                break;

            case 2:
                if (this.getCharacter().getHealthPoints() < 49) {

                    this.getCharacter().setHealthPoints(this.getCharacter().getHealthPoints() + 10);

                    System.out.println(getCharacter().getName() + "'s" +
                            " experience points: , " + getCharacter().getExperiencePoints()
                            + ", Health points: " + getCharacter().getHealthPoints()
                            + ", Level: " + getCharacter().getState().toString());

//                    Thread.sleep(100); // just for the affect of meditating
                } else {
                    System.out.println("You cannot collect any more health pts at this level");
                }
                break;
            case 3:
                if (this.getCharacter().getExperiencePoints() > 69 && this.getCharacter().getHealthPoints() > 49) {
                    this.getCharacter().setState(new Expert(this.getCharacter()));

                    System.out.println(getCharacter().getName() + "'s" +
                            " experience points:  " + getCharacter().getExperiencePoints()
                            + ", Health points: " + getCharacter().getHealthPoints()
                            + ", Level: " + getCharacter().getState().toString());

                } else {
                    System.out.println("You don't have enough points to move to the next level. ");
                }
                break;

        }

    }
}
