package com.example.alex.rockpaperscissors;

import org.apache.http.impl.conn.DefaultClientConnection;

import java.util.Date;
import java.util.Random;

/**
 * Created by Alex on 9/21/2014.
 */
public class ComputerSelection {
    private static int counter = 0;

    public SelectionType play() {
        Random random = new Random(new Date().getTime() + counter++);
        int randomNumber = random.nextInt(3);
        switch (randomNumber) {
            case 0:
                return SelectionType.ROCK;
            case 1:
                return SelectionType.PAPER;
            default:
                return SelectionType.SCISSORS;
        }
    }
}
