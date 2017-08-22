/*
Author: Rohan Kapoor
Date: 10/8/2015
Description: The user is given a menu to select options from. If the user selects '1' or '2', then they are given another menu with book ID numbers, the name of the book, and the price.
The user then selects which book ID that corresponds to the book the user wants. Then the user selects how many they wish to purchase. The computer searches for the ID using two different
search methods and outputs the book ID, the name of the book, the amount purchased, and the total cost. The computer also outputs the amount of time it takes to generate the search in
seconds. Because there are only twelve values that the computer searches through, the time is essentially 0. If the user selects '3' or '4', then the computer generates 1000 random
numbers and sorts them out in ascending order using two different search methods. The computer also outputs the amount of time it takes to generate the sort in seconds.
*/
#include <iostream>
#include <iomanip>
#include <time.h>
using namespace std;
// Function prototypes
void display(string title[], int id[], double price[]);
void linearSearch(int id[], int, double bookCost[], string title[], int);
void binarySearch(int id[], int, int, double bookCost[], string title[], int);
void bubbleSort(int bubbleArray[]);
void selectionSort(int selectionArray[]);
int main()
{
    // Declaration of arrays and variables
    string bookTitle[] = {"Starting out with C++", "Java Programming", "Software Structures", "Design and Analysis of Algorithms", "Computer Graphics", "Artificial Intelligence: A Modern Approach", "Probability and Statistics", "Cognitive Science", "Modern Information Retrieval", "Speech and Language Processing"};
    int bookID[] = {1101, 1211, 1333, 1456, 1567, 1642, 1699, 1755, 1800, 1999};
    double bookPrice[] = {112.32, 73.25, 54.00, 67.32, 135.00, 173.22, 120.00, 42.25, 32.11, 123.75};
    int randArray[1000];
    int userChoice = 0, bookid, amount;
    // Random function requirement
    srand(time(NULL));
    // While loop that ends the program if the user inputs '5'
    while(userChoice != 5)
    {
    cout << endl;
    // Do while loop where the user enters in a value and it is validated so that the value is only between 1 and 5
    do
    {
    cout << "Choose a number from the list below: \n\t1. \tLinear Search \n\t2. \tBinary Search \n\t3. \tBubble Sort \n\t4. \tSelection Sort \n\t5. \tQuit" << endl;
    cin >> userChoice;

    // swtich case statements where each different inputted number has a different search or sort
    switch (userChoice)
    {
        // Case 1: linear search; asks the question and the user inputs the value and the function is called
        case 1: display(bookTitle, bookID, bookPrice);
                cout << "What is the book ID that you wish to purchase? ";
                cin >> bookid;
                cout << "How many would you like to purchase? ";
                cin >> amount;
                linearSearch(bookID, bookid, bookPrice, bookTitle, amount);
            break;
        // Case 2: binary search; asks the question and the user inputs the value and the function is called
        case 2: display(bookTitle, bookID, bookPrice);
                cout << "What is the book ID that you wish to purchase? ";
                cin >> bookid;
                cout << "How many would you like to purchase? ";
                cin >> amount;
                binarySearch(bookID, 10 ,bookid, bookPrice, bookTitle, amount);
            break;
        // Case 3: Bubble sort; generates 1000 random numbers and exchanges two elements if out of order
        case 3: for (int i = 0; i < 1000; i++)
                {
                    randArray[i] = rand() % 500 + 1;
                    cout << randArray[i] << " ";
                }
                cout << endl;
                bubbleSort(randArray);
            break;
        // Case 4: Selection sort; generates 1000 random numbers and finds the smallest number and replaces with first
        case 4: for (int i = 0; i < 1000; i++)
                {
                    randArray[i] = rand() % 500 + 1;
                    cout << randArray[i] << " ";
                }
                cout << endl;
                selectionSort(randArray);
            break;
        // Case 5: Exits program
        case 5: exit(0);
    }
    }
    while(userChoice < 1 || userChoice > 5);
    }
    return 0;
}
// Displays the book ID, book name, and cost in a tabular method
void display(string title[], int id[], double price[])
{
    for (int i = 0; i < 10; i++)
    {
        if (i == 0)
        {
            cout << id[i] << "\t" << title[i] << setw (21) << "\t" << "$" << price[i] << endl;
        }
        else if (i == 1)
        {
            cout << id[i] << "\t" << title[i] << setw (26) << "\t" << "$" << price[i] << endl;
        }
        else if (i == 2)
        {
            cout << fixed << setprecision(2) << id[i] << "\t" << title[i] << setw (23) <<"\t" << "$" << price[i] << endl;
        }
        else if (i == 3)
        {
            cout << id[i] << "\t" << title[i] << setw (8) <<"\t" << "$" << price[i] << endl;
        }
        else if (i == 4)
        {
            cout << id[i] << "\t" << title[i] << setw (25) <<"\t" << "$" << price[i] << setprecision(2) << fixed << endl;
        }
        else if (i == 5)
        {
            cout << id[i] << "\t" << title[i] << "\t" << "$" << price[i] << endl;
        }
        else if (i == 6)
        {
            cout << id[i] << "\t" << title[i] << setw (20) <<"\t" << "$" << price[i] << setprecision(2) << fixed << endl;
        }
        else if (i == 7)
        {
            cout << id[i] << "\t" << title[i] << setw (25) <<"\t" << "$" << price[i] << endl;
        }
        else if (i == 8)
        {
            cout << id[i] << "\t" << title[i] << setw (20) <<"\t" << "$" << price[i] << endl;
        }
        else if (i == 9)
        {
            cout << id[i] << "\t" << title[i] << setw (12) <<"\t" << "$" << price[i] << endl;
        }
    }
}
// Function declaration
void linearSearch(int id[], int bookNum, double bookCost[], string title[], int num)
{
    // time variables
    clock_t t1,t2;
    t1=clock();
    // declaration of variables
    int  index = 0;
    int position = -1;
    bool found = false;
    // repeats itself if book number was not found
    repeat:
    // searches through the elements to find the number
    while (index < 10 && !found)
    {
        if (id[index] == bookNum)
        {
            found = true;
            position = index;
        }
    index++;
    }
    // if the number is not found, the user enteres information again
    while (index == 10)
        {
            cout << "That book number was not found. Please enter another number" << endl;
            cout << "What is the book ID that you wish to purchase? ";
            cin >> bookNum;
            cout << "How many would you like to purchase? ";
            cin >> num;
            index = 0;
            goto repeat;
        }
    // output of what the user selects
    cout << "Book ID: " << id[position] << "\tBook Title: " << title[position] << "\tNumber purchased: " << num << "\tTotal Cost: " << bookCost[position] * num << endl;
    // time calculations and output in seconds
    t2=clock();
    float diff ((float)t2-(float)t1);
    float seconds = diff / CLOCKS_PER_SEC;
    cout<< endl << "Time in seconds: " << seconds <<endl;
}
//  Function Declaration
void binarySearch(int id[], int arraySize, int bookNum, double bookCost[], string title[], int num)
{
    // time variables
    clock_t t1,t2;
    t1=clock();
    // repeats itself if book number was not found
    repeat:
    // declaration of variables
    int first = 0, last = arraySize - 1, middle = 0, position = -1;
    bool found = false;
    // this loop finds the middle number and see's if the value is greater than or less than and increments/decrements appropriately
    while (!found && first <= last)
    {
        middle = (first + last) / 2;
        if (id[middle] == bookNum)
        {
            found = true;
            position = middle;
        }
        else if (id[middle] > bookNum)
            last = middle - 1;
        else
            first = middle + 1;
    }
    // if the number is not found, the user is asked the question again
    while (first > last)
    {
        cout << "That book number was not found. Please enter another number" << endl;
        cout << "What is the book ID that you wish to purchase? ";
        cin >> bookNum;
        cout << "How many would you like to purchase? ";
        cin >> num;
        first = 0;
        goto repeat;
    }
    // output of what the user selects
    cout << "Book ID: " << id[position] << "\tBook Title: " << title[position] << "\tNumber purchased: " << num << "\tTotal Cost: " << bookCost[position] * num << endl;
    // time calculations and output in seconds
    t2=clock();
    float diff ((float)t2-(float)t1);
    float seconds = diff / CLOCKS_PER_SEC;
    cout<< endl << "Time in seconds: " << seconds <<endl;
}
// function declaration
void bubbleSort(int bubbleArray[])
{
    // time variables
    clock_t t1,t2;
    t1=clock();
    // declaration of variables
    bool swapElements;
    int temp;
    // do while statement of sorting from the first value to the last
    do
    {
        swapElements = false;
        for (int i = 0; i < 1000; i++)
        {
            if (bubbleArray[i] > bubbleArray[i+1])
            {
                temp = bubbleArray[i];
                bubbleArray[i] = bubbleArray[i+1];
                bubbleArray[i+1] = temp;
                swapElements = true;
            }
        }
    }
    while (swapElements);
    cout << endl;
    // outputs the sorted version of the numbers
    for (int i = 1; i < 1001; i++)
    {
        cout << bubbleArray[i] << " ";
    }
    // time calculations and output in seconds
    t2=clock();
    float diff ((float)t2-(float)t1);
    float seconds = diff / CLOCKS_PER_SEC;
    cout<< endl << "Time in seconds: " << seconds <<endl;

}

void selectionSort(int selectionArray[])
{
    // time variables
    clock_t t1,t2;
    t1=clock();
    // declaration of variables
    int minIndex, minValue;
    // do while statement of sorting from the minimum value to the maximum
    for (int i = 0; i < 1000; i++)
    {
        minIndex = i;
        minValue = selectionArray[i];
        for(int j = i + 1; j < 1000; j++)
        {
            if (selectionArray[j] < minValue)
        {
            minValue = selectionArray[j];
            minIndex = j;
        }
        }
    selectionArray[minIndex] = selectionArray[i];
    selectionArray[i] = minValue;
    }
    // outputs the sorted version of the numbers
    for (int i = 0; i < 1000; i++)
    {
        cout << selectionArray[i] << " ";
    }
    // time calculations and output in seconds
    t2=clock();
    float diff ((float)t2-(float)t1);
    float seconds = diff / CLOCKS_PER_SEC;
    cout<< endl << "Time in seconds: " << seconds <<endl;
}
