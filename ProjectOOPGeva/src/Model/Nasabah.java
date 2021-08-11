package Model;

public class Nasabah {
    private String no_rek;
    private String nama;
    private String pin;
    private String jenis_kartu;
    private Long saldo;

    public Nasabah() {
    }

    public Nasabah(String no_rek, String nama, String pin, Long saldo, String jenis_kartu) {
        this.no_rek = no_rek;
        this.nama = nama;
        this.pin = pin;
        this.saldo = saldo;
        this.jenis_kartu = jenis_kartu;
    }
    
    @Override
    public String toString() {
        return "Nasabah{" + "nama=" + nama + ", pin=" + pin + ", saldo=" + getSaldo() + '}';
    }

    /**
     * @return the no_rek
     */
    public String getNo_rek() {
        return no_rek;
    }

    /**
     * @param no_rek the no_rek to set
     */
    public void setNo_rek(String no_rek) {
        this.no_rek = no_rek;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the pin
     */
    public String getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * @return the jenis_kartu
     */
    public String getJenis_Kartu() {
        return jenis_kartu;
    }

    /**
     * @param jenis_kartu the jenis_kartu to set
     */
    public void setJenis_Kartu(String jenis_kartu) {
        this.jenis_kartu = jenis_kartu;
    }

    /**
     * @return the saldo
     */
    public Long getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(Long saldo) {
        this.saldo = saldo;
    }
    
}