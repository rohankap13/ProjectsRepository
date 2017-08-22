// Rohan Kapoor
// 10/16/2015
// This program includes two games that the user can play: Rock/Paper/Scissors and rolling dice.

#include <iostream>
#include <ctime>
using namespace std;

// Declaration of variables
int gameType, rps, comprps, rolls, roll1, roll2, roll3;

// Function prototype
void rockPaperScissors();
void rollDice();

// Function definition
int main()
{
    // User is prompted with game type and enters a number
    cout << "Please enter a number for a game:\n1. Play rock/paper/scissors\n2. Play dice game\n3. Exit" << endl;
    cin >> gameType;

    // Random number generator
    srand(time(NULL));

// Program takes the game type and calls a function
if (gameType == 1)
    rockPaperScissors();
else if (gameType == 2)
    rollDice();

    return 0;
}
// Function definition
void rockPaperScissors()
{
    // User is prompted with game rules and options and enters an option
    cout << "Welcome to Rock/Paper/Scissors!\nThe rules are:\n\tRock beats scissors\n\tScissors	beats Paper\n\tPaper beats rock" << endl;
    do{
    cout << "Game	Choices:\n\t1. Rock\n\t2. Paper\n\t3. Scissors\n\t4. Quit, exit	the	program\nPlease enter your choice:" << endl;
    cin >> rps;

    // Random function
    comprps = (rand() % 3) + 1;

    // Computer checks equality and decides win/loss/draw
    if (rps == 1 && comprps == 1)
        cout << "Draw. Both rolled rock." << endl;
    else if (rps == 2 && comprps == 2)
        cout << "Draw. Both rolled paper." << endl;
    else if (rps == 3 && comprps == 3)
        cout << "Draw. Both rolled scissors." << endl;
    else if (rps == 1 && comprps == 3)
        cout << "You win! You rolled rock and computer rolled scissors!" << endl;
    else if (rps == 2 && comprps == 1)
        cout << "You win! You rolled paper and computer rolled rock!" << endl;
    else if (rps == 3 && comprps == 2)
        cout << "You win! You rolled scissors and computer rolled paper!" << endl;
    else if (rps == 1 && comprps == 2)
        cout << "You lose... You rolled rock and computer rolled paper..." << endl;
    else if (rps == 2 && comprps == 3)
        cout << "You lose... You rolled paper and computer rolled scissors..." << endl;
    else if (rps == 3 && comprps == 1)
        cout << "You lose... You rolled scissor and computer rolled rock..." << endl;
    } while (rps<4);
}

// Function definition
void rollDice()
{
    // User is prompted with game rules and options and enters an option
    cout << "Welcome to Roll Dice Game!\nThe rules are:\n\tYou get 10 points if you get two dice and get a 7\n\tYou get 5 if you role two dice and get identical numbers\n\tYou get 3 points if you role one dice and get 4" << endl;
    do{
    cout << "Game	Choices:\n\t1. Roll only one dice\n\t2. Roll two dice\n\t3. Quit, exit	the	program\nPlease enter your choice:" << endl;
    cin >> rolls;

    // Random functions
    roll1 = (rand() % 6 ) + 1;
    roll2 = (rand() % 6 ) + 1;
    roll3 = (rand() % 6 ) + 1;

    // Computer checks equality and decides whether the user earns points or not
    if (rolls == 1 && roll1 == 4)
        cout << "You rolled a 4! You get three points!" << endl;
    else if (rolls == 2 && (roll2 == roll3))
        cout << "You rolled two " << roll2 << "'s. You get five points" << endl;
    else if (rolls == 2 && (roll2 + roll3 == 7))
        cout << "You rolled a " << roll2 << " and a " << roll3 << " which adds to 7. You get ten points!" << endl;
    else
        cout << "No points this time. Try again." << endl;
    } while (rolls < 3);
}
