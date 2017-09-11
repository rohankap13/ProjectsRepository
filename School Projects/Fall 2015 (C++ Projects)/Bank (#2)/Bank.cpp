/*
Rohan Kapoor
11/11/2015
This program mimics a bank login screen in which the user has the option to create an account, login to his or her account, or quit.
If the user selects "create an account", then the user enters a username and password and these string values are stored into files.
If the user selescts "login", then the user enters a username and password and this string is checked with the stored file strings.
If the strings are different or if no account is created, the login is not successful. Otherwise the next banking menu opens up.
If the user selects "quit", then the program ends.
This menu is the menu for the bank and has options to deposit money, withdraw money, request balance, or quit.
If the user selects "deposit money", then the user is shown another menu in which he or she can input money to add to current balance.
If the user selects "withdraw money", then the user is shown another menu in which he or she can input money to withdraw from the account.
This value is validated in that the money withdrawn cannot be greater than the money remaining.
If the user selects "request balance", a menu is shown to display the current balance.
If the user selects "quit", then the program ends.
*/
#include <iostream>
#include <fstream>
using namespace std;
// Declaration of variables
char inputLetter, option;
string userNew, passNew, userLogin, passLogin;
double total = 0, depos, with;
fstream myfile;
// Function prototypes
void mainMenu();
void createAccount();
void login();
void bankingMenu();
double deposit(double);
double withdraw (double);
void displayBalance();
// Main functino
int main()
{
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" << endl;
    cout <<"Hi! Welcome to  Future Computer Programmer ATM Machine!" << endl;
    mainMenu();
}
// This function is called to display the menu with optinos
void mainMenu()
{
    do{
    cout << endl << "Please select an option from the menu below:\n\tL->Login\n\tC->Create an account\n\tQ->Quit" << endl;
    cin >> inputLetter;


    if (inputLetter == 'C' || inputLetter == 'c')
        createAccount();
    else if (inputLetter == 'L' || inputLetter == 'l')
        {
            login();
            do{
                if (userLogin != userNew || passLogin != passNew)
                    {
                        cout << "No match was found. Login failed!" << endl;
                        break;
                    }
            } while (userLogin != userNew || passLogin != passNew);

                if (userLogin==userNew && passLogin == passNew)
                    {
                        cout <<"Login successful!" << endl;
                        bankingMenu();
                        break;
                    }
        }
    } while(inputLetter != 'Q' && inputLetter != 'q');
}
// This function is called if the user wants to create an account
void createAccount()
{
    cout << "Please enter a username: ";
    cin >> userNew;
    cout <<"Please enter a password: ";
    cin >> passNew;
    cout <<"Thank you! Your account has been created!" << endl;
    myfile.open ("username.txt");
    myfile << userNew;
    myfile.close();
    myfile.open ("password.txt");
    myfile << passNew;
    myfile.close();
}
// This functino is called if the user wants to login into his or her account
void login()
{
    cout << "Enter your username: ";
    cin >> userLogin;
    cout << "Enter your password: ";
    cin >> passLogin;
}
// This function is called once the login is successful
void bankingMenu()
{
    do{
    cout << endl << "Please select an option from below: \n\tD->Deposit money\n\tW->Withdraw money\n\tR->Request Balance\n\tQ->Quit" << endl;
    cin >> option;

    if (option == 'D' || option == 'd')
    {
        cout << "How much money do you wish to deposit?" << endl;
        cin >> depos;
        deposit(depos);
    }
    else if (option == 'W' || option == 'w')
    {
        cout <<"How much money would you like to withdraw?" << endl;
        cin >> with;
        withdraw(with);
    }
    else if (option == 'R' || option == 'r')
        displayBalance();

    } while (option != 'Q' && option != 'q');

}
// This function is called if the user wants to deposit money into the account
double deposit(double dep)
{
    total+=dep;
    myfile.open ("moeny.txt");
    myfile << total;
    myfile.close();
    return total;
}
// This function is called if the user wants to withdraw money from the account
double withdraw(double withd)
{
    if (withd > total)
        cout << "Withdrawal amount is greater than total balance. Cannot withdraw" << endl;
    else
    {
        total-=withd;
        myfile.open ("money.txt");
        myfile << total;
        myfile.close();
    }
    return total;
}
// THis function is called if the user wants to check his or her balance
void displayBalance()
{
    cout << "Your current balance is $" << total;
}



