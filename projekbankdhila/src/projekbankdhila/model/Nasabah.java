
package projekbankdhila.model;
import projekbankdhila.model.KartuATM.tipeKartu;

public class Nasabah {
    private int noRek;
    private String nama;
    private int pin;
    private double saldo;
    private KartuATM kartuATM;
    private tipeKartu tipe;

    public Nasabah() {
    }

    public Nasabah(int noRek, int pin) {
        this.noRek = noRek;
        this.pin = pin;
    }

    public Nasabah(int noRek, String nama, int pin, double saldo, tipeKartu tipe) {
        this.noRek = noRek;
        this.nama = nama;
        this.pin = pin;
        this.saldo = saldo;
        this.tipe = tipe;
    }
    
    

    public int getNoRek() {
        return noRek;
    }

    public void setNoRek(int noRek) {
        this.noRek = noRek;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public KartuATM getKartuATM() {
        return kartuATM;
    }

    public void setKartuATM(KartuATM kartuATM) {
        this.kartuATM = kartuATM;
    }

    public tipeKartu getTipe() {
        return tipe;
    }

    public void setTipe(tipeKartu tipe) {
        this.tipe = tipe;
    }
    
    public double limit(tipeKartu card){
        if (card==tipe.GOLD)
            return Double.valueOf(25000000);
        else 
            return Double.valueOf(15000000);  
    }
}
