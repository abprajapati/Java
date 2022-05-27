
/**********************************************
 Workshop 4
 Course:<subject type> - JAC444
 Last Name: Prajapati
 First Name:Akashkumar
 ID:129122206
 Section:NEE
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date:03/02/2022
 **********************************************/
/*import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class hangman{

    public static char[] selectingWord() throws IOException
    {
            BufferedReader in = new BufferedReader(new FileReader("hangman.txt")); // using buffering character stream for IO
        ArrayList<String> listOfWords = new ArrayList<>(); // declaring arraylist to do a manipulation in the array
            while (in.readLine() != null) {
                listOfWords.add(in.readLine());// adding the words in the arraylist called "listOfWords"
            }
            in.close();

            String pick = listOfWords.get((int) (Math.random() * listOfWords.size()));// getting random element from the array
            return pick.toCharArray();
    }

    public static char guessCharacter(char[] asterisks){
        Scanner sc = new Scanner(System.in);
        System.out.printf("(Guess) Enter a letter in word ");
        System.out.print(asterisks);//********
        System.out.printf(" > ");
        String charGuess = sc.next();
        return charGuess.charAt(0);// returning the entered character by the user
    }

    public static boolean validateGuess(char[] asterisk, char[] selectedWord, char guess)
    {
        int info = 0;
        boolean rightGuess = false;

        for (int i = 0; i < selectedWord.length; i++) {
            if (selectedWord[i] == guess)
            {
                rightGuess = true;
                if (asterisk[i] == guess) // if the guess is correct but selected more than one time
                {
                    info = 1;
                }
                else
                {
                    asterisk[i] = guess; // letter will be displayed if the user guess is right
                    info = 2;
                }
            }
        }
        if (info == 1)
        {
            System.out.print("\t" + guess);
            System.out.println(" is already in the word");
        }
        if(info != 1 && info != 2 )
        {
            System.out.print("\t" + guess);
            System.out.println(" is not in the word");
        }
        return rightGuess;
    }

    public static boolean completionOfWord(char[] asterisk) {
        for (char i: asterisk)
        {
            if (i == '*')
            {
                return false;
            }
        }
        return true;
    }
    public static void addingNewWord() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the new word to be added in the memory");
        String newName = sc.next();
        BufferedWriter out = new BufferedWriter(new FileWriter("hangman.txt", true));// using buffered character stream for doing the writing operation
        out.newLine();// writing the new line the file
        out.write(newName);// writing the new word in the file
        out.close();// closing the file "hangman.txt"
    }


    public static void main(String[] args) throws IOException {

        String validate;
        Scanner sc = new Scanner(System.in);
        do {

            int missingTry = 0;
            char[] selectedWord = selectingWord(); // for reading the words from file, store them in array and then select random element from it


            char[] asterisk = new char[selectedWord.length];// for getting the length of the selected word and then file whole array with "*"
            Arrays.fill(asterisk, '*');// filling up all the element fo the array with the "*"

            do {
                char charGuess = guessCharacter(asterisk);// for getting the guessing the character
                if (!validateGuess(asterisk, selectedWord, charGuess)) // for displaying the character if the selected guess is right and if not then massage will be displayed like that character is not in the word
                {
                    missingTry++;
                }
            } while (!(completionOfWord(asterisk)));// validation for completing word

            System.out.print("The word is \"");
            System.out.print(selectedWord);
            System.out.print("\"");
            System.out.println(" You missed " + missingTry + " times");
            addingNewWord();// function to add new word to the file
            System.out.print("\nDo you want to guess another word? Enter y or n>");
            validate = sc.next();
        } while (validate.charAt(0) == 'y'); // asking to play the game again
    }
}
*/
// Java Program to Illustrate Concept of
// Abstract Class

// Importing required classes
/*import java.io.*;

// Class 1
// Helper abstract class
abstract class Shape {

    // Declare fields
    String objectName = " ";

    // Constructor of this class
    Shape(String name) { this.objectName = name; }

    // Method
    // Non-abstract methods
    // Having as default implementation
    public void moveTo(int x, int y)
    {
        System.out.println(this.objectName + " "
                + "has been moved to"
                + " x = " + x + " and y = " + y);
    }

    // Method 2
    // Abstract methods which will be
    // implemented by its subclass(es)
    abstract public double area();
    abstract public void draw();
}

// Class 2
// Helper class extending Class 1
class Rectangle extends Shape {

    // Attributes of rectangle
    int length, width;

    // Constructor
    Rectangle(int length, int width, String name)
    {

        // Super keyword refers to current instance itself
        super(name);

        // this keyword refers to current instance itself
        this.length = length;
        this.width = width;
    }

    // Method 1
    // To draw rectangle
    @Override public void draw()
    {
        System.out.println("Rectangle has been drawn ");
    }

    // Method 2
    // To compute rectangle area
    @Override public double area()
    {
        // Length * Breadth
        return (double)(length * width);
    }
}

// Class 3
// Helper class extending Class 1
class Circle extends Shape {

    // Attributes of a Circle
    double pi = 3.14;
    int radius;

    // Constructor
    Circle(int radius, String name)
    {
        // Super keyword refers to parent class
        super(name);
        // This keyword refers to current instance itself
        this.radius = radius;
    }

    // Method 1
    // To draw circle
    @Override public void draw()
    {
        // Print statement
        System.out.println("Circle has been drawn ");
    }

    // Method 2
    // To compute circle area
    @Override public double area()
    {
        return (double)((pi * radius * radius));
    }
}

// Class 4
// Main class
class hangman {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating the Object of Rectangle class
        // and using shape class reference.
        Shape rect = new Rectangle(2, 3, "Rectangle");

        System.out.println("Area of rectangle: "
                + rect.area())

        rect.moveTo(1, 2);

        System.out.println(" ");

        // Creating the Objects of circle class
        Shape circle = new Circle(2, "Circle");

        System.out.println("Area of circle: "
                + circle.area());

        circle.moveTo(2, 4);
    }
}*/

/*import java.util.*;
import java.io.*;

public class hangman
{
    //Main method
    public static void main(String[] args) throws FileNotFoundException
    {
        //Scanner object for reading input from console
        Scanner kbd = new Scanner(System.in);

        //Reading file name
        System.out.print("\nEnter a file name for baby name ranking: ");
        String fileName = kbd.nextLine();

        //Scanner for file
        Scanner fileReader = new Scanner(new File(fileName));

        //List to hold values
        // Creating a list
        List<String> names = new ArrayList<String>();

        String line;

        //Reading names from file
        while(fileReader.hasNext())
        {
            //Reading a line
            line = fileReader.nextLine();
            //Splitting on space
            String[] tokens = line.split("\\s+");

            //Storing names
            names.add(tokens[1]);
            names.add(tokens[3]);
        }

        //Closing file reader
        fileReader.close();

        //Closing console reader
        kbd.close();

        //Printing message
        System.out.print("\n " + names.size() + " names used for both genders\n\n They are ");

        //Printing names
        for(int i=0; i<names.size(); i++)
        {
            //if (names.get(i) == names.get()
          //  System.out.print(names.get(i) + " ");
            for(int j=0; j<names.size(); j++)
            {
                if (names.get(i) == names.get(j))
                {
                    System.out.print(names.get(i) + " ");
                }
            }
        }

        System.out.println("\n\n");
    }
}*/




