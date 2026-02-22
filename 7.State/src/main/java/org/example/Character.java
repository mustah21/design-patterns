package org.example;

import org.example.state.Novice;

import java.util.Scanner;


public class Character {

    public static Scanner scan = new Scanner(System.in);
    private String name;
    private int experiencePoints; // max 100 pts
    private int healthPoints;     // max 100 pts
    private State level;

    public Character() {
        level = new Novice(this);
    }


    public void setState(State level) {
        this.level = level;
    }
    public State getState() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }
    public int getExperiencePoints() {
        return experiencePoints;
    }
    public int getHealthPoints() {
        return healthPoints;
    }

    public void clearPts() {
        experiencePoints = 0;
        healthPoints = 0;
    }

    public int readUserChoice(String[] options) {
        System.out.println("\nSelect an option:");
        for (int i = 1; i <= options.length; i++) {
            System.out.println(i + ". " + options[i-1]);
        }
        return scan.nextInt();
    }

    public void operate() {
        while (true) {
            if (level == null) {
                System.out.println("Out of order");
                return;
            }
            level.action();
        }
    }




}
