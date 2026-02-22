package org.example.state;

import org.example.Character;
import org.example.State;


import static org.example.Character.scan;

public class Novice extends State {


    public Novice(Character character) {
        super(character);
        this.getCharacter().clearPts();
    }

    @Override
    public void action() {

        if (this.getCharacter().getName() == null || this.getCharacter().getName().trim().isEmpty()) {

            while (this.getCharacter().getName() == null || this.getCharacter().getName().trim().isEmpty()) {
                System.out.print("Enter your character's name: ");
                String input = scan.nextLine();

                if (input.trim().isEmpty()) {
                    System.out.println("Name cannot be empty.");
                } else {
                    this.getCharacter().setName(input);
                }
            }

            System.out.println("\n\nA maximum of 30 experience pts can be achieved at every level.");
            System.out.println("A maximum of 50 health pts can be achieved at intermediate/expert level.\n\n");
        }

        String[] options = {"Increase pts (10): ", "Fly to intermediate: "};
        switch (this.getCharacter().readUserChoice(options)) {

            case 1:

                if (this.getCharacter().getExperiencePoints() < 29) {
                    this.getCharacter().setExperiencePoints(this.getCharacter().getExperiencePoints() + 10);
                    System.out.println(getCharacter().getName() +
                            " experience points: " + getCharacter().getExperiencePoints()
                            + ", Health points: " + getCharacter().getHealthPoints()
                            + ", Level: " + getCharacter().getState().toString());
                } else {
                    System.out.println("\nPlease fly to the next level to get more pts.");
                }

                break;


            case 2:

                if (this.getCharacter().getExperiencePoints() > 29) {

                    this.getCharacter().setState(new Intermediate(this.getCharacter()));
                    System.out.println(getCharacter().getName() + "'s" +
                            " experience points: , " + getCharacter().getExperiencePoints()
                            + ", Health points: " + getCharacter().getHealthPoints()
                            + ", Level: " + getCharacter().getState().toString());
                } else {
                    System.out.println("DENIED! You need at least 30 experience pts to proceed to the next level." +
                                    " Current pts:  " + this.getCharacter().getExperiencePoints());
                }
                break;


        }
    }

}
