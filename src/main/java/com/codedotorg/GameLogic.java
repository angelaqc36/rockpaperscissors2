package com.codedotorg;
import java.util.Random;

public class GameLogic {

    /** Whether or not the game is over */
    private boolean gameOver;

    /**
     * Constructor for the GameLogic class.
     * Initializes the gameOver variable to false.
     */
    public GameLogic() {
        gameOver = false;
    }

    /**
     * Returns a random choice of "rock", "paper", or
     * "scissors" for the computer player.
     * 
     * @return a String representing the computer's choice
     */
    public String getComputerChoice() {
        Random rand = new Random();
        int choice = rand.nextInt(3);
        switch (choice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return "rock";
        }
    }

    /**
     * Determines the winner of a rock-paper-scissors game based on the user's predicted class and the computer's choice.
     * @param predictedClass The user's predicted class.
     * @param computerChoice The computer's choice.
     * @return A string containing the computer choice, user choice, and the result of the game.
     */
    public String determineWinner(String predictedClass, String computerChoice) {
        if (predictedClass.equals(computerChoice)) {
            return "Both chose " + predictedClass + ". It's a tie!";
        }

        switch (predictedClass) {
            case "rock":
                if (computerChoice.equals("scissors")) {
                    return "User chose rock. Computer chose scissors. User wins!";
                } else {
                    return "User chose rock. Computer chose paper. Computer wins!";
                }
            case "paper":
                if (computerChoice.equals("rock")) {
                    return "User chose paper. Computer chose rock. User wins!";
                } else {
                    return "User chose paper. Computer chose scissors. Computer wins!";
                }
            case "scissors":
                if (computerChoice.equals("paper")) {
                    return "User chose scissors. Computer chose paper. User wins!";
                } else {
                    return "User chose scissors. Computer chose rock. Computer wins!";
                }
            default:
                return "Invalid user choice.";
        }
        
    }

    /**
     * Sets the game over flag to true and returns a
     * string indicating a tie result.
     * 
     * @return A string indicating a tie result.
     */
    public String getTieResult() {
        gameOver = true;
        return "Both chose " + getComputerChoice() + ". It's a tie!";
    }

    /**
     * Sets the game over flag to true and returns a string
     * indicating that the user has won.
     * 
     * @return a string indicating that the user has won
     */
    public String getUserWinnerResult() {
        
        gameOver = true;
        return "User wins the game!";
    }

    /**
     * Sets the game over flag to true and returns a string
     * indicating that the computer has won.
     * 
     * @return A string indicating that the player has lost.
     */
    public String getComputerWinnerResult() {
        gameOver = true;
        return "Computer wins the game!";
    }

    /**
     * Returns whether the game is over or not.
     * 
     * @return true if the game is over, false otherwise.
     */
    public boolean isGameOver() {
        return gameOver;
    }

    /**
     * Resets the game logic by setting the gameOver flag to false.
     */
    public void resetLogic() {
        gameOver = false;
    }

}
