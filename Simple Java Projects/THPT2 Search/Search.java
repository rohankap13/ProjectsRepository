/**
 * The search class takes in the user's choice of word they wish to search and returns the number of instances that it occurs.
 * 
 * @author Rohan Kapoor 
 * @version 03/04/16
 */
// import the package that includes the files and the keyboard functions
import java.io.*;
import java.util.*;
// class definition
public class Search
{
    // declaration of fields
    private String userWord;
    private String filename;
    /**
     * Constructor for objects of class Search that initizlizes the starting values
     * No parameters or return type
     */
    public Search()
    {
        //initializes the original strings
        userWord = null;
        filename = null;
    }
    /**
     * Overloaded constructor for objects of class Search that initializes the values that the user inputs into the program
     * @param userWord - takes in the inputted string that the user wishes to search
     * @param filename - takes in the complete file's extension
     * no return type
     */
    public Search(String userWord, String filename)
    {
        //sets value into the variables
        this.userWord = userWord;
        this.filename = filename;
    }    
    /**
     * The getUserWord method returns the word that the user wishes to search
     * 
     * @return - String representation of the word
     */
    public String getUserWord()
    {
        //returns the searched word
        return userWord;
    }    
    /**
     * The getFilename method returns the name of the file that the user inputted
     * 
     * @return - String representation of the file name
     */
    public String getFilename()
    {
        //returns the name of the file
        return filename;
    }          
    /**
     * The setUserWord method sets the word that the user wishes to search
     * 
     * @param - userWord - a text representation of the inputted searched word
     * @return - String representation of the word 
     */
    public void setUserWord(String userWord)
    {
        //sets the searched word to the variable
        this.userWord = userWord;
    }    
    /**
     * The setFilename method sets the filename that the user wishes to search within
     * 
     * @param - filename - the name of the file extension that the user inputs
     * @return - String representation of the file name
     */
    public void setFilename(String filename)
    {
        //sets the name of the file to the variable
        this.filename = filename;
    }
    /**
     * The find method searches for the word with the next word in the text file and counts the number of matches and throws out exceptions.
     *
     * @return - counter - returns the number of matches
     */
    public int searchWord() throws IOException
    {
        //declares a new file for the file name
        File file = new File(filename);
        //scanner class that reads information off the file
        Scanner input = new Scanner(file);
        //declaration of local variables
        String text;
        int counter = 0;
        int j = 0;
        //loop to go to the next word
        while(input.hasNextLine())
        {
            //assigns the next word to the variable text
            text = input.nextLine();
            //makes it lowercase
            text.toLowerCase();
            //for loop to check each individual charater
            for(int i = 0; i < text.length(); i++)
            {
                //increments j if the characters are the same
                if(text.charAt(i) == userWord.charAt(j)){
                    j++;
                }
                //resets j back to zero if first condition isnt met
                else{
                    j = 0;
                }
                //if the length of the word and j are equal, then a match was found
                if(j == userWord.length()){
                    j = 0;
                    counter++;
                }
            }
        }
        //returns the number of matches
        return counter;
    }
}
