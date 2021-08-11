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
 class BankAccount{

       private int accountNum;
       private String customerName;
       private double balance;
       private double[] transactions;
       private int numOfTransactions;
       private  static int noOfAccounts=0;

       public String getAccountInfo(){
           return "Account number: " + accountNum + "\nCustomer Name: " + customerName + "\nBalance:" + balance +"\n";
       }

       public int getTransactionInfo(int n)
       {
            numOfTransactions = n;
            return n;

        }

       public BankAccount(String abc, double xyz){
         customerName = abc;
         balance = xyz;
         noOfAccounts ++;
         accountNum = noOfAccounts;
         transactions = new double[100];
         transactions[0] = balance;
         numOfTransactions = 1;
       }

    public int getAccountNum(){
        return accountNum;
    }
    public void deposit(double amount){

        if (amount<=0) {
            System.out.println("Amount to be deposited should be positive");
        } else {
            balance = balance + amount;
            transactions[numOfTransactions] = amount;
            numOfTransactions++;
        }
    }
    public void withdraw(double amount)
    {
        if (amount<=0){
             System.out.println("Amount to be withdrawn should be positive");
         }
        else
        {
            if (balance < amount) {
                System.out.println("Insufficient balance");
            } else {
                balance = balance - amount;
                transactions[numOfTransactions] = amount;
                numOfTransactions++;
            }
        }
    }

}//end of class



