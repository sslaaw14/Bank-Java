/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Fauziah
 */
class Bank {
private BankAccount[] accounts;     // all the bank accounts at this bank
private int numOfAccounts;      // the number of bank accounts at this bank

// Constructor: A new Bank object initially doesn’t contain any accounts.
public Bank() {
    accounts = new BankAccount[100];
    numOfAccounts = 10;
    }

// Creates a new bank account using the customer name and the opening balance given as parameters
// and returns the account number of this new account. It also adds this account into the account list
// of the Bank calling object.
public int openNewAccount(String customerName, double openingBalance) {

    BankAccount b = new BankAccount(customerName, openingBalance);
    accounts[numOfAccounts] = b;
    numOfAccounts++;
    return b.getAccountNum();
}

// Withdraws the given amount from the account whose account number is given. If the account is
// not available at the bank, it should print a message.
public void withdrawFrom(int accountNum, double amount) {
    for (int i =0; i<numOfAccounts; i++) {
        if (accountNum == accounts[i].getAccountNum()  ) {
            accounts[i].withdraw(amount);
            System.out.println("Amount withdrawn successfully");
            return;
        }
    }
    System.out.println("Account number not found.");
    }

// Deposits the given amount to the account whose account number is given. If the account is not
// available at the bank, it should print a message.
public void depositTo(int accountNum, double amount) {
    for (int i =0; i<numOfAccounts; i++) {
        if (accountNum == accounts[i].getAccountNum()  ) {
            accounts[i].deposit(amount);
            System.out.println("Amount deposited successfully");
            return;
        }
    }
    System.out.println("Account number not found.");
}

// Prints the account number, the customer name and the balance of the bank account whose
// account number is given. If the account is not available at the bank, it should print a message.
public void printAccountInfo(int accountNum) {
    for (int i =0; i<numOfAccounts; i++) {
                if (accountNum == accounts[i].getAccountNum()  ) {
                    System.out.println(accounts[i].getAccountInfo());
                    return;
                }
            }
    System.out.println("Account number not found.");
}

// Prints the account number, the customer number and the balance of the bank account whose
// account number is given, together with last n transactions on that account. If the account is not
// available at the bank, it should print a message.
public void printAccountInfo(int accountNum, int n) {
    for (int i =0; i<numOfAccounts; i++) {
                        if (accountNum == accounts[i].getAccountNum()  ) {
                            System.out.println(accounts[i].getAccountInfo());
                            System.out.println(accounts[i].getTransactionInfo(n));
                            return;
                        }
                    }
    System.out.println("Account number not found.");
    }

}

