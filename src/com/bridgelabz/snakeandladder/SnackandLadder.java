package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnackandLadder {
    //Constants
    private static final int IS_NO_PLAY = 0;
    private static final int IS_LADDER = 1;
    private static final int IS_SNAKE = 2;

    //Declaring Variables for Players Position
    int playerPosition = 0;
    int newPosition = 0;

    // Random Class Object for Generating Random Numbers
    Random randomNo = new Random();

    //Method to Show Player Current Position
    private void showPosition() {
        //Displaying Player Position
        System.out.println("Player Starting Position : " + playerPosition);
    }

    //Method to Roll the Die and Get No between 1 to 6
    private int rollDie() {
        int dieNo = randomNo.nextInt(6) + 1;
        return dieNo;
    }

    //Method to Check for Option
    private void optionPlay(int dieNo) {

        int optionNo = randomNo.nextInt(3) + 1;
        System.out.println("Option No : " + optionNo);

        switch (optionNo) {
            case IS_NO_PLAY:
                System.out.println("Player got NO PLAY");
                newPosition = 0;
                break;
            case IS_LADDER:
                System.out.println("Yahoo!!! Player got LADDER");
                playerPosition += dieNo;
                break;
            case IS_SNAKE:
                System.out.println("OOPS!!! Player got SNAKE");
                playerPosition -= dieNo;
                if (playerPosition < 0) {
                    playerPosition = 0;
                }
                break;
        }
    }

    public static void main(String[] args) {
        //Displaying Welcome Message
        System.out.println("Welcome to Snake and Ladder Simulator Problem Developed");

        //Creating Object for Player
        SnackandLadder player1 = new SnackandLadder();

        //Showing Player Position
        player1.showPosition();

        //Show Die Rolling No
        int dieNo = player1.rollDie();
        System.out.println("Die Number for Player : " + dieNo);

        //Player going for Options
        player1.optionPlay(dieNo);
        player1.showPosition();
    }
}