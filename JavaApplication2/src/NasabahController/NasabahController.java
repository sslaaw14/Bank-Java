/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NasabahController;

import Model.Account;


/**
 *
 * @author Fauziah
 */
public class NasabahController {
    private Model.Account[] accounts;
    private int numOfAccounts;
    private Object Model;

public NasabahController(){

    accounts = new Model.Account[100];
    numOfAccounts = 10;
}
    public int daftarNasabah(String username, double saldo) {
        Model.Account a = new Model.Account(username, saldo);
        accounts[numOfAccounts] = a;
        numOfAccounts++;
        return a.getAccountNum();
    }

    public void infoSaldo(int noRek) {
        for (int i =0; i<numOfAccounts; i++) {
            if (accounts[i].getAccountNum() == noRek) {
                System.out.println(accounts[i].getAccountInfo());
                return;
            }
        }
        System.out.println("Nomor rekening tidak ditemukan");
    }

    public void simpanUang(int noRek, double jumlah) {
        for (int i = 0; i<numOfAccounts; i++) {
            if (noRek == accounts[i].getAccountNum()) {
                accounts[i].simpan(jumlah);
                System.out.println("Penyimpanan uang berhasil");
                return;
            }
        }
        System.out.println("Nomor rekening tidak ditemukan");
    }

   
    
    
    
}
