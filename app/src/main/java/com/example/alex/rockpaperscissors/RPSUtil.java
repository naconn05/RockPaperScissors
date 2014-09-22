package com.example.alex.rockpaperscissors;

/**
 * Created by Alex on 9/21/2014.
 */
public class RPSUtil {
    public static final String INPUT_TYPE = "com.example.alex.rockpaperscissors.inputType";

    public static String eval(SelectionType userChoice, SelectionType computerChoice) {
        if (userChoice == computerChoice) {
            return "Its a draw!";
        } else {
            if (userChoice == SelectionType.ROCK)
                if (computerChoice == SelectionType.SCISSORS) {
                    return "You WIN!!!!";
                } else {
                    return "The computer won!";
                }
            else if (userChoice == SelectionType.SCISSORS) {
                if (computerChoice == SelectionType.PAPER) {
                    return "You WIN!!!!";
                } else {
                    return "The computer won!";
                }
            } else {
                if (computerChoice == SelectionType.ROCK) {
                    return "You WIN!!!!";
                } else {
                    return "The computer won!";
                }
            }
        }
    }
}