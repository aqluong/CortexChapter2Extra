public class Main {
    public static void main(String[] args) {
        // TODO: 1 instantiate a variable called hello with a string value of "Hello world"
        // TODO: 2 instantiate a variable called gerard with a string value of "BananaCat"
        // TODO: 3 instantiate a variable called triBase with a numerical value of 3.5
        // TODO: 4 instantiate a variable called triHei with a numerical value of 2.5


        // TODO: 5 instantiate a user input variable, called input, and import the appropriate class/package into this file


        // TODO: 6 instantiate a variable that is a string called userInput and have its value be the user input for a previous System.out.println()
        System.out.println("Please enter a string: ");

        System.out.println("I should be the variable userInput!");
//        Line 17 should concatenate the userInput into the System.out.println() below
        System.out.println( " is what you entered into the console");

//        Finish the returnFirstAndLast function before running this code!
        System.out.println(returnFirstAndLast("BananaCat"));
        System.out.println(returnFirstMiddleLast("rutabaga"));

        // TODO 7a use a System.out.println() to print to the console returnFirstAndLast() with the argument userInput
        System.out.println("Let's enter a new word! What word do you want to enter?");

        // TODO: 8a instantiate a new variable, called evenLetters and have its value be "qUiZzInG"

        // TODO: 8b print to the console the return value of returnFirstMiddleLast() with the argument of evenLetters in the format "The return value of returnFirstMiddleLast() with the word _ is _"

        // TODO: 9a instantiate two new variables, userBase and userWid and have their values be equal to user input values for the length and width
        System.out.println("Let's measure the area of a triangle (in cm^2)! What is the length of the base of your triangle in cm?");
        //instantiate userBase below
        System.out.println("What is the width of your triangle (in cm)?");
        //instantiate userLen below
        // TODO: 9b print to the console the return value of calculateTriangleArea using concatenation the following line: "The are of a triangle with a base length of _ cm and a height of _cm is _cm^2"

        
    }
    
    public static String returnFirstAndLast(String str) {
        // TODO: 7 finish this method- notice the syntax in creating this method!
//        we want this function to take in a string argument and return the first and last letters of a string
        return str;
    }
    
    public static String returnFirstMiddleLast(String str) {
        // TODO: 8 finish this method- notice the syntax in creating this method!
//        we want this function to take in a string argument and return the first, middle, and last letter of a string in a new string as the value of str in all capital letters
        return str;
    }
    
    public static double calculateTriangleArea (double len, double wid) {
        // TODO: 9 modify this method to calculate the area of a triangle- notice the syntax in creating this method!
      double area = 0;
//        we want this function to calculate the area of a triangle
        return area;
    }
}