/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import NasabahController.NasabahController;
import java.util.Scanner;

/**
 *
 * @author Fauziah
 */
public class Main {
   //static NasabahController.NasabahController nasabahController = new NasabahController.NasabahController();
   static NasabahController myBank = new NasabahController();
    
   public static void main(String[] args){
       
       
           
       while (true){
            Scanner userInput = new Scanner(System.in);
            System.out.println("\n\n\tSelamat datang di Bank Central Java");
            System.out.println("------------------------------------------------");

            System.out.print("Masukkan username anda\t : ");
            String username = userInput.nextLine();
            userInput.reset();
            System.out.print("Masukkan Saldo untuk membuka rekening\t : ");
            double saldo = userInput.nextDouble();
            userInput.reset();
            System.out.println("Akun telah terdaftar dengan nomor rekening : " + myBank.daftarNasabah(username, saldo));
            System.out.println("------------------------------------------------");
                      
            layananBank();
            
        } 
}
   


    private static void layananBank() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("----------------------------------------------------");
        System.out.println("Silahkan pilih layanan kami : \n"
                + "1. Teller\n"
                + "2. ATM\n"
                + "3. Keluar\n");
        System.out.println("Masukkan pilihan anda : ");
        int pilih = userInput.nextInt();
        userInput = userInput.reset();
        switch (pilih) {
            case 1 :
                tellerBank();
                break;
            case 2 :
                atmBank();
                break;
            case 3 :
                System.out.println("\n\n\t\tTerimakasih ^^");
                System.exit(0);
                break;
            default :
                break;
        }
    }
    
    private static void tellerBank() {
      Scanner userInput = new Scanner (System.in); 
      //NasabahController myBank = new NasabahController();
        System.out.println("Silahkan pilih menu di bawah ini : \n"
                + "1. Cek Saldo \n"
                + "2. Simpan Uang \n"
                + "3. Ambil Uang \n"
                + "4. Transfer \n"
                + "5. Kembali \n");
        System.out.print("Masukkan pilihan anda : ");
        int pilih = userInput.nextInt();
        userInput = userInput.reset();
        switch (pilih){
            case 1 :
                System.out.println("--------------------------------------------");
                System.out.println("\t\tCek Saldo");
                System.out.println("--------------------------------------------");
                System.out.print("Masukkan nomor rekening anda\t : ");
                int noRek = userInput.nextInt();
                myBank.infoSaldo(noRek);
                break;
            case 2 :
                System.out.println("--------------------------------------------");
                System.out.println("\t\tSimpan Uang");
                System.out.println("--------------------------------------------");
                System.out.println("Masukkan nomor rekening anda\t : ");
                int no = userInput.nextInt();
                userInput.reset();
                System.out.println("Masukkan nominal yang anda simpan : ");
                double simpan = userInput.nextDouble();
                userInput.reset();
                myBank.simpanUang(no, simpan);
                break;
            case 3 :
                System.out.println("--------------------------------------------");
                System.out.println("\t\tAmbil Uang");
                System.out.println("--------------------------------------------");
                System.out.println("Masukkan nominal yang anda ambil : ");
                double ambil = userInput.nextDouble();
                userInput.reset();
                break;
            /*case 4 : 
                System.out.println("--------------------------------------------");
                System.out.println("\t\tTransfer Uang");
                System.out.println("--------------------------------------------");
                System.out.println ("Masukkan nomor rekening tujuan anda : ");
                String noRek = userInput.nextLine();       
                userInput.reset();
                System.out.println("Masukkan jumlah nominal uang yang anda transfer : ");
                double transfer = userInput.nextDouble();
                userInput.reset();
                
                break;*/
            case 5 :
                layananBank();
                break;
            default :
                break;
        }
    }
    
    private static void atmBank() {
        Scanner userInput = new Scanner (System.in);  
        System.out.println("Silahkan pilih menu di bawah ini : \n"
                + "1. Cek Jenis Kartu\n"
                + "2. Cek Saldo \n"
                + "3. Simpan Uang \n"
                + "4. Ambil Uang \n"
                + "5. Transfer \n"
                + "6. Kembali \n");
        System.out.print("Masukkan pilihan anda : ");
        int pilih = userInput.nextInt();
        userInput = userInput.reset();
        switch (pilih){
            case 1 :
                System.out.println("--------------------------------------");
                System.out.println("\t\tCek Jenis Kartu");
                System.out.println("--------------------------------------");
                System.out.println("user name ...");
                System.out.println("nomor rekening ...");
                System.out.println("Jenis Kartu ATM anda  : ");
                break;
            case 2 :
                System.out.println("--------------------------------------");
                System.out.println("\t\tCek Saldo");
                System.out.println("--------------------------------------");
                System.out.println("user name ...");
                System.out.println("nomor rekening ...");
                System.out.println("saldo : ");
                break;
            case 3 :
                System.out.println("--------------------------------------");
                System.out.println("\t\tSimpan Uang");
                System.out.println("--------------------------------------");
                System.out.println("Masukkan nominal yang anda simpan : ");
                double simpan = userInput.nextDouble();
                userInput.reset();
                break;
            case 4 :
                System.out.println("--------------------------------------");
                System.out.println("\t\tAmbil Uang");
                System.out.println("--------------------------------------");
                System.out.println("Masukkan nominal yang anda ambil : ");
                double ambil = userInput.nextDouble();
                userInput.reset();
                break;
            case 5 : 
                System.out.println("--------------------------------------");
                System.out.println("\t\tTransfer Uang");
                System.out.println("--------------------------------------");
                System.out.println ("Masukkan nomor rekening tujuan anda : ");
                String noRek = userInput.nextLine();       
                userInput.reset();
                System.out.println("Masukkan jumlah nominal uang yang anda transfer : ");
                double transfer = userInput.nextDouble();
                userInput.reset();
                
                break;
            case 6 :
                layananBank();
                break;
            default :
                break;
        }
    
    }
}

/*
case 1:
                    
                case 2:
                    
                case 3:
                    
                case 4:
                    transferATM();
                    break;
                case 5:
                    transferOnline();
                    break;
                case 6:
                    
                case 7:
                    cekSaldoATM();
                    break;
                case 8:
                    cekSaldoOnline();
                    break;
                case 9:
                    
       


*/