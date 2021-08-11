
package projekbankdhila.service;
import projekbankdhila.model.Nasabah;

public class LayananATM extends Layanan{

    @Override
    public boolean penarikan(Nasabah nasabah, double uang) {
        if(nasabah.getSaldo()>=uang && uang <= nasabah.limit(nasabah.getTipe())){
            nasabah.setSaldo(nasabah.getSaldo()-uang);
            return true;
        }
        else
            return false;
    }

    @Override
    public void transfer(Nasabah nasabah1, Nasabah nasabah2, double uang) {
       nasabah1.setSaldo(nasabah1.getSaldo()-uang);
       nasabah2.setSaldo(nasabah2.getSaldo()+uang);
    }

    @Override
    public double infoSaldo(Nasabah nasabah1) {
        return nasabah1.getSaldo();
    }  
}
