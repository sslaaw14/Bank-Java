
package projekbankdhila.service;

import projekbankdhila.model.Nasabah;

public abstract class Layanan {
    public abstract boolean penarikan(Nasabah nasabah, double uang);
    public abstract void transfer(Nasabah nasabah1, Nasabah nasabah2, double uang);
    public abstract double infoSaldo(Nasabah nasabah1);
    
    public void penyimpanan(Nasabah nasabah, double uang){
        nasabah.setSaldo(nasabah.getSaldo()+uang);
    }
}
