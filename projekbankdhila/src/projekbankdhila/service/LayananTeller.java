
package projekbankdhila.service;

import projekbankdhila.model.Nasabah;

public class LayananTeller extends Layanan implements UpdateData<Nasabah> {

    @Override
    public boolean penarikan(Nasabah nasabah, double uang) {
        if (nasabah.getSaldo()>=uang){
            nasabah.setSaldo(nasabah.getSaldo()-uang);
            return true;
        }
        else return false;
    }

    @Override
    public void transfer(Nasabah nasabah1, Nasabah nasabah2, double uang) {
        //nasabah1 adalah pentransfer
        nasabah1.setSaldo(nasabah1.getSaldo()-uang);
        nasabah2.setSaldo(nasabah2.getSaldo()+uang);
    }

    @Override
    public double infoSaldo(Nasabah nasabah1) {
        return nasabah1.getSaldo();
    }
    
    public void penyimpanan (Nasabah nasabah,double uang){
        super.penyimpanan(nasabah, uang);
    }

    @Override
    public void UpdateData(Nasabah nsb1, Nasabah nsb2) {
        //nsb1 adalah data lama
           nsb1.setNama(nsb2.getNama());
           nsb1.setPin(nsb2.getPin());
           nsb1.setTipe(nsb2.getTipe());
           nsb1.setSaldo(nsb2.getSaldo());
    }
}
