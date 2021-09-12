/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 */

import java.util.Scanner;

public class App
{
    public static String GetInput(String request) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(request);
        return scanner.nextLine();
    }

    public static final double sqFeet_to_sqMeters = 0.09290304;

    public static void main( String[] args )
    {
        String lengthStr = GetInput("What is the length of the room in feet? ");
        int length = Integer.parseInt(lengthStr);

        String widthStr = GetInput("What is the width of the room in feet? ");
        int width = Integer.parseInt(widthStr);

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");

        int area_sq_ft = length * width;
        double area_sq_m = area_sq_ft * sqFeet_to_sqMeters;

        System.out.println("The area is \n" + area_sq_ft + " square feet \n" + area_sq_m + " square meters");
    }
}