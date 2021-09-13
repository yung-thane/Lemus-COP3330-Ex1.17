
/*
 *  UCF COP3330 Fall 2021 Assignment 1.17 Solution
 *  Copyright 2021 Ronald Lemus
 */


import java.util.Scanner;

public class Blood_Alcohol {
    public static void main(String [] arg){
        System.out.print("What is your weight, in pounds? ");
        Scanner weightInp = new Scanner(System.in);
        int weight = weightInp.nextInt();

        System.out.print("Enter 1 if you are male, 2 if you are female. ");
        Scanner sexInp = new Scanner(System.in);
        int sex = sexInp.nextInt();

        System.out.print("How much alcohol did you consume, in ounces? ");
        Scanner alcInp = new Scanner(System.in);
        int alc = alcInp.nextInt();

        System.out.print("How many hours has it been since your last drink? ");
        Scanner hoursInp = new Scanner(System.in);
        int hours = hoursInp.nextInt();

        double BAC;
        if (sex == 1) {
             BAC = (alc * 5.14 / weight * .73) - .015 * hours;
        }
        else{
             BAC = (alc * 5.14 / weight * .66) - .015 * hours;
            }

        double legalBAC = .08;
        System.out.printf("Your BAC is %.6f", BAC);

        String legal = (BAC >= legalBAC)
                ? "It is not legal for you to drive."
                : "It is legal for you to drive.";

        System.out.println(legal);


    }
}
