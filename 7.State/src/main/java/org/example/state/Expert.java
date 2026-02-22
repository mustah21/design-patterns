package org.example.state;

import org.example.State;
import org.example.Character;


public class Expert extends State {

    public Expert(Character character) {
        super(character);
    }


    @Override
    protected void action() {
        String[] options = {"Training? ", "Meditating? ", "Fighting", "Fly to Master level? "};
        switch (this.getCharacter().readUserChoice(options)) {
            case 1:

                if (this.getCharacter().getExperiencePoints() < 99) {

                    this.getCharacter().setExperiencePoints(this.getCharacter().getExperiencePoints() + 10);
                    System.out.println(getCharacter().getName() +
                            " experience points: " + getCharacter().getExperiencePoints()
                            + " Health points: " + getCharacter().getHealthPoints()
                            + " Level: " + getCharacter().getState().toString());
                } else {
                    System.out.println("You may not receive any more pts at the current level");
                }


                break;

            case 2:
                if (this.getCharacter().getHealthPoints() < 99) {

                    this.getCharacter().setHealthPoints(this.getCharacter().getHealthPoints() + 10);
                    System.out.println(getCharacter().getName() +
                            " experience points: " + getCharacter().getExperiencePoints()
                            + " Health points: " + getCharacter().getHealthPoints()
                            + " Level: " + getCharacter().getState().toString());
                } else {
                    System.out.println("You cannot collect any more health pts at this level");
                }


                break;
            case 3:

                    System.out.println(this.getCharacter().getName() + " you are fighting against the use of " +
                            "python your health pts will be decreased" +
                            " and experience pts will be increased. ");

                    this.getCharacter().setHealthPoints(this.getCharacter().getHealthPoints() - 10);
                    this.getCharacter().setExperiencePoints(this.getCharacter().getExperiencePoints() + 10);

                    System.out.println(getCharacter().getName() +
                            " experience points: " + getCharacter().getExperiencePoints()
                            + " Health points: " + getCharacter().getHealthPoints());

                break;


            case 4:
                if (this.getCharacter().getExperiencePoints() > 99 && this.getCharacter().getHealthPoints() > 99) {
                    this.getCharacter().setState(new Master(this.getCharacter()));
                } else {
                    System.out.println("You don't have enough points to move to the next level. ");
                }

                System.out.println(getCharacter().getName() +
                        " experience points: " + getCharacter().getExperiencePoints()
                        + " Health points: " + getCharacter().getHealthPoints()
                        + " Level: " + getCharacter().getState().toString());

                break;
        }


    }


}

