package org.example;


// players will throw darts there is 30 percent probability that the dart will hit.
// {maxRound} indicates allowed tries to accumulate points


public class Darts extends Game {

    int[] scores;
    int numberOfPlayers;
    int currentRound = 1;
    int maxRounds = 5;
    Throw throwing = new Throw();

    @Override
    public void initializeGame(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        this.scores = new int[numberOfPlayers];

        System.out.println("Welcome to the Darts game!");
        System.out.println("Numbers of players participating: " + numberOfPlayers);
        System.out.println("Each player will have " + maxRounds +  " tries to hit the center spot ");
    }

    @Override
    public boolean endOfGame() {
//        return numberOfPlayers >= scores.length;
        return currentRound > maxRounds;

    }

    @Override
    public void playSingleTurn(int player) {

        if (player == 0) {
            System.out.println("Current round: " + currentRound);
        }

        boolean hit = throwing.throwDart();

        if (hit) {
            scores[player] += 1;
            System.out.printf("Player %d threw a dart, result: HIT! (total: %d)%n", player + 1, scores[player]);

        } else {

            System.out.printf("Player %d threw a dart, result:  MISSED  (total: %d)%n", player + 1, scores[player]);
        }
        if (player == numberOfPlayers - 1) {
            currentRound++;
            System.out.println();
        }

    }


    @Override
    public void displayWinner() {
        System.out.println("=== FINAL SCORES ===");

        int winnerIndex = 0;
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Player " + (i + 1) + ": " + scores[i] + " points");
            if (scores[i] > scores[winnerIndex]) {
                winnerIndex = i;
            }
        }

        boolean tie = false;
        for (int i = 0; i < numberOfPlayers; i++) {
            if (i != winnerIndex && scores[i] == scores[winnerIndex]) {
                tie = true;
                break;
            }
        }

        if (tie) {
            System.out.println("\nIt's a tie!");
        } else {
            System.out.println("Player " + (winnerIndex + 1) + " wins with " + scores[winnerIndex] + " points!");
        }
    }

}
