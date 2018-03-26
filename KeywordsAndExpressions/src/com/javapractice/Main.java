package com.javapractice;

public class Main {

    public static void main(String[] args) {

        displayHighScorePosition("Sajj", calculatedHighScorePosition(10000));

        int highScore1 = calculateScore(true, 80, 5, 1);
        displayHighScorePosition("Player1", calculatedHighScorePosition(highScore1));

        int highScore2 = calculateScore(true, 100, 8, 2);
        displayHighScorePosition("Player2", calculatedHighScorePosition(highScore2));


    }

    public static void displayHighScorePosition (String player, int position){
        System.out.println(player + " managed to get into position " + position + " on the high score table");
    }


    public static int calculatedHighScorePosition (int highScore){

        if (highScore >= 10000){
            return 1;
        } else if (500 =< highScore && highScore <1000){
            return 2;
        } else if (100 =< highScore  && highScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
}
