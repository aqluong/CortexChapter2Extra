package solutions;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // TODO: 1 instantiate a variable called hello with a string value of "Hello world"
        String hello = "Hello world";
        // TODO: 2 instantiate a variable called gerard with a string value of "BananaCat"
        String gerard = "BananaCat";
        // TODO: 3 instantiate a variable called triBase with a numerical value of 3.5
        double triBase = 3.5;
        // TODO: 4 instantiate a variable called triHei with a numerical value of 2.5
        double triHei = 2.5;


        // TODO: 5 instantiate a user input variable, called input, and import the appropriate class/package into this file
        Scanner input = new Scanner(System.in);

        // TODO: 6 instantiate a variable that is a string called userInput and have its value be the user input for a previous System.out.println() as a string
        System.out.println("Please enter a string: ");
        String userInput = input.nextLine();

        System.out.println( userInput + " should be the variable userInput!");
        System.out.println(userInput + " is what you entered in the previous line");


        System.out.println(returnFirstAndLast("BananaCat"));
        System.out.println(returnFirstMiddleLast("rutabaga"));

        // TODO 7a use a System.out.println() to print to the console returnFirstAndLast() with the argument userInput
        System.out.println("Let's enter a new word! What word do you want to enter?");
        userInput = input.nextLine();
        System.out.println("returnFirstAndLast() applied to the word " + userInput + " is " + returnFirstAndLast(userInput));
        // TODO: 8a instantiate a new variable, called evenLetters and have its value be "qUiZzInG"
        String evenLetters = "qUiZzInG";
        // TODO: 8b print to the console the return value of returnFirstMiddleLast() with the argument of evenLetters
        System.out.println("The return value of returnFirstMiddleLast() with the word " + evenLetters + " is " + returnFirstMiddleLast(evenLetters));
        // TODO: 9a instantiate two new variables, userBase and userWid and have their values be equal to user input values for the length and width
        System.out.println("Let's measure the area of a triangle (in cm^2)! What is the length of the base of your triangle in cm?");
        double userBase = input.nextDouble();
        System.out.println("What is the width of your triangle (in cm)?");
        double userLen = input.nextDouble();
        // TODO: 9b print to the console the return value of calculateTriangleArea using concatenation the following line: "The are of a triangle with a base length of _ cm and a height of _cm is _cm^2"
        System.out.println("The are of a triangle with a base length of " + userBase + "cm and a height of " + userLen + "cm is " + calculateTriangleArea(userBase, userLen)+ "cm^2");

    }

    public static String returnFirstAndLast(String str) {
        // TODO: 7 finish this method- notice the syntax in creating this method!
//        we want this function to take in a string argument and return the first and last letters of a string
        char lastChar = str.charAt(str.length()-1);
        char firstChar = str.charAt(0);
        String combined = "" + firstChar + lastChar;
        return combined;
    }

    public static String returnFirstMiddleLast(String str) {
        // TODO: 8 finish this method- notice the syntax in creating this method!
//        we want this function to take in a string argument and return the first, middle, and last letter of a string in a new string as the value of str in all capital letters
        char firstChar = str.charAt(0);
        char middleChar = str.charAt(str.length()/2);
        char lastChar = str.charAt(str.length()-1);
        String combined = "" + firstChar + middleChar + lastChar;
        return combined;
    }

    public static double calculateTriangleArea(double len, double wid) {
        // TODO: 9 modify this method to calculate the area of a triangle- notice the syntax in creating this method!
//        we want this function to calculate the area of a triangle
        return 0.5*len*wid;
    }
}

