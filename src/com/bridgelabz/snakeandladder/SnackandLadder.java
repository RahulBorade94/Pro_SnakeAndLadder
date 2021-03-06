package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnackandLadder {
    //Constants
    private static final int IS_NO_PLAY = 0;
    private static final int IS_LADDER = 1;
    private static final int IS_SNAKE = 2;

    //Declaring Variables for Players Position
    int playerPosition = 0;
    int diceCount = 0;
    int dieNo = 0;
    // Random Class Object for Generating Random Numbers
    Random randomNo = new Random();

    //Method to Show Player Current Position
    private void showPosition(String playerNo) {
        //Displaying Player Position
        System.out.println("Player "+playerNo+" Position : "+ playerPosition);
    }

    //Method to Roll the Die and Get No between 1 to 6
    private int rollDie() {
        int dieNo = randomNo.nextInt(6)+1;

        //Incrementing the Dice Count on each die roll
        diceCount++;
        System.out.println("Dice Count : "+diceCount);

        return dieNo;
    }

    //Method to Check for Option
    private void optionPlay(int dieNo) {

        int optionNo = randomNo.nextInt(2)+1;
        System.out.println("Option No : "+ optionNo);

        switch (optionNo) {
            case IS_NO_PLAY:
                System.out.println("Player got NO PLAY");
                break;
            case IS_LADDER:
                System.out.println("Yahoo!!! Player got LADDER");
                playerPosition += dieNo;
                //If Player Position greater than 100 then skip the Play
                if(playerPosition > 100) {
                    System.out.println("Sorry The Position is Out of Board.");
                    playerPosition -= dieNo;
                }
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
        System.out.println("Welcome to Snake and Ladder Simulator Problem.");

        //Creating Object for Player
        SnackandLadder player1 = new SnackandLadder();
        SnackandLadder player2 = new SnackandLadder();

        //Showing Player Position
        player2.showPosition("1");
        player1.showPosition("2");

        //Iterating upto Player got Position 100
        while( player1.playerPosition != 100 && player2.playerPosition != 100) {
            //Show Die Rolling No
            player1.dieNo = player1.rollDie();
            System.out.println("Die Number for Player1 : "+ player1.dieNo);

            //Player going for Options
            player1.optionPlay(player1.dieNo);
            player1.showPosition("1");

            //Show Die Rolling No
            player2.dieNo = player2.rollDie();
            System.out.println("Die Number for Player2 : "+ player2.dieNo);

            //Player going for Options
            player2.optionPlay(player2.dieNo);
            player2.showPosition("2");

            //Checking for the WINING Possibility among 2 Players
            if(player1.playerPosition == 100) {
                System.out.println("Player 1 WON THE GAME!!!");
            } else {
                System.out.println("Player 2 WON THE GAME!!!");
            }
        }
    }
}
