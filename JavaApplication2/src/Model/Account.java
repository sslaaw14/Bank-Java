/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Fauziah
 */
public class Account {
    private ArrayList<Nasabah> list;
    private int noRek;
    private String username;
    private double saldo;
    private int noOfAccounts=1450;
    private double[] transactions;
    private int numOfTransactions;

    public Account(String username, double saldo) {
        this.username = username;
        this.saldo = saldo;
        noOfAccounts ++;
        noRek = noOfAccounts;
        transactions = new double [100];
        transactions[0] = saldo;
        numOfTransactions = 1;
    }

    public int getAccountNum() {
       
        return noRek;
    }

    public String getAccountInfo() {
        return "Nomor Rekening: " + noRek + "\nCustomer Name: " + username + "\nSaldo:" + saldo +"\n";
    }

    public void simpan(double jumlah) {
        if (jumlah <= 0){
            System.out.println("Jumlah uang yang ditabung harus bernilai positif");
        }else {
            saldo = saldo + jumlah;
            int numOfTransactions = 0;
            transactions[numOfTransactions] = jumlah;
            numOfTransactions++;
        }
    }
}
