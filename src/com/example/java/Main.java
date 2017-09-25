package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int amountCorrect=0;

        System.out.println("The sky is a ____ color.");
        String answerOne = "Blue";

        String guessOne =in.nextLine();
        if (guessOne.equalsIgnoreCase(answerOne)==true){
            System.out.println("Correct!");
            amountCorrect++;
        } else {
            System.out.println("Wrong!!");
        }




        System.out.println("At a red light you ____.");
        String answerTwo = "Stop";

        String guessTwo =in.nextLine();
        if (guessTwo.equalsIgnoreCase(answerTwo)==true){
            System.out.println("Correct!");
            amountCorrect++;
        } else {
            System.out.println("Wrong!!");
        }




        System.out.println("United _____ of America");
        String answerThree = "States";

        String guessThree =in.nextLine();
        if (guessThree.equalsIgnoreCase(answerThree)==true){
            System.out.println("Correct!");
            amountCorrect++;
        } else {
            System.out.println("Wrong!!");
        }




        System.out.println("This code is programmed in ____.");
        String answerFour = "Java";

        String guessFour =in.nextLine();
        if (guessFour.equalsIgnoreCase(answerFour)==true){
            System.out.println("Correct!");
            amountCorrect++;
        } else {
            System.out.println("Wrong!!");
        }




        System.out.println("Boolean can be either ____ or false.");
        String answerFive = "True";

        String guessFive =in.nextLine();
        if (guessFive.equalsIgnoreCase(answerFive)==true){
            System.out.println("Correct!");
            amountCorrect++;
        } else {
            System.out.println("Wrong!!");
        }


        System.out.println("");

        System.out.println("You answered "+amountCorrect+" questions correct.");
    }
    }
