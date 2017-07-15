/**
 * This class contains the main method and prints information back to the user
 * 
 * @author Rohan Kapoor
 * @version 03/04/16
 */
//packages to import including the scanner package and the file reader package
import java.io.*;
import java.util.*;
//class definition
public class Driver
{
    //main method
    public static void main(String [] args) throws IOException
    {
        //declaration of scanners and variables
        Scanner keyboard = new Scanner(System.in);
        String userInput;
        String filename;
        String userWord;
        //creates the instance of the class
        Search search;
        search = new Search();
        //outputs information to the reader and gets the filename
        System.out.println("This program will search through a text file and tell you how many times the word appears");
        System.out.println("Please enter the name of the file that you would like to search in: ");
        filename = keyboard.nextLine();
        //sets the filename to the setFilename method
        search.setFilename(filename);
        //declaration of the scanner to read off the text file
        Scanner input = new Scanner(new File(filename));
        //outputs to the user on what word they wanna search and obtains the value
        System.out.println("Please enter the word or phrase that you would like to search for: ");
        userInput = keyboard.nextLine();
        //makes the word lower case because program doesnt require case sensitivity
        userWord = userInput.toLowerCase();
        //sets the searched word into the setUserWord method
        search.setUserWord(userWord);
        //creates another instance of the class
        search = new Search(userWord, filename);
        //prints the final tally of the number of occurances
        System.out.println("The word '" + userInput + "' appears " + search.searchWord() + " times in this text.");        
    }
}
