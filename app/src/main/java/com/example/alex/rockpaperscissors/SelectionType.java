package com.example.alex.rockpaperscissors;

/**
 * Created by Alex on 9/21/2014.
 */
public enum SelectionType {
    ROCK("Rock"), PAPER("Paper"), SCISSORS("Scissors");
    private String value;

    SelectionType(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }
}
