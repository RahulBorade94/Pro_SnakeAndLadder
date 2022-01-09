package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
    //declaring  variable for player position
    int playerPosition=0;

    //show player the current position
    private void showPosition(){
        System.out.println("Snake and Ladder ="+playerPosition);

    }

    public static void main(String[] args) {
        //welcome massage
        System.out.println("Welcome to Snake and Ladder Problem");

        //create object
        SnakeAndLadder snake =new SnakeAndLadder();

        //showing position
        snake.showPosition();
    }
}
