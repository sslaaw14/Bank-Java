package Controller;

import Model.Nasabah;
import Service.NasabahService;
import View.HalamanAwal;
import View.RegisterView;
import View.SaldoViewATM;
import View.SaldoViewTeller;
import View.SimpanUang;
import View.TarikUangATM;
import View.TarikUangTeller;
import View.TransferTeller;
import View.LoginATM;
import View.LoginTeller;
import View.MenuATM;
import View.MenuTeller;
import View.TransferATM;

public class Controller {
    NasabahService nasabahService = new NasabahService();
    
    public void HalamanAwal(){
        HalamanAwal lv = new HalamanAwal();
        lv.setVisible(true);
    }
    public void RegisterView(){
       RegisterView rv = new RegisterView();
       rv.setVisible(true);
    }
    public void LoginATM(){
        LoginATM uv = new LoginATM();
        uv.setVisible(true);
    }
    public void LoginTeller(){
        LoginTeller uv = new LoginTeller();
        uv.setVisible(true);
    }
    public void SaldoViewATM(Nasabah nasabah){
        SaldoViewATM uv = new SaldoViewATM(nasabah);
        uv.setVisible(true);
    }
    public void SaldoViewTeller(Nasabah nasabah){
        SaldoViewTeller uv = new SaldoViewTeller(nasabah);
        uv.setVisible(true);
    }
    public void SimpanUang(Nasabah nasabah){
        SimpanUang uv = new SimpanUang(nasabah);
        uv.setVisible(true);
    }
    public void TarikUangATM(Nasabah nasabah){
        TarikUangATM uv = new TarikUangATM(nasabah);
        uv.setVisible(true);
    }
    public void TarikUangTeller(Nasabah nasabah){
        TarikUangTeller uv = new TarikUangTeller(nasabah);
        uv.setVisible(true);
    }
    public void TransferATM(Nasabah nasabah){
        TransferATM uv = new TransferATM(nasabah);
        uv.setVisible(true);
    }
    public void TransferTeller(Nasabah nasabah){
        TransferTeller uv = new TransferTeller(nasabah);
        uv.setVisible(true);
    }
    public void MenuATM(Nasabah nasabah){
        MenuATM uv = new MenuATM(nasabah);
        uv.setVisible(true);
    }
    public void MenuTeller(Nasabah nasabah){
        MenuTeller uv = new MenuTeller(nasabah);
        uv.setVisible(true);
    }
    public void logoutATM(){
        HalamanAwal();
        System.out.println("Logout success");
    }
    public void logoutTeller(){
        HalamanAwal();
        System.out.println("Logout success");
    }
    
    
    public boolean register(Nasabah nasabah){
        if(nasabahService.register(nasabah)){
            System.out.println("Register Success");
            HalamanAwal();
            return true;
        }
        else{
            System.out.println("Register failed");
            return false;
        }
    }
    public boolean loginATM(Nasabah nasabah){
        Nasabah result = nasabahService.loginATM(nasabah);
        if(result!=null){
            MenuATM(result);
            return true;
        }
        else{
            System.out.println("Login Gagal");
            return false;
        }
    }
    public boolean loginTeller(Nasabah nasabah){
        Nasabah result = nasabahService.loginTeller(nasabah);
        if(result!=null){
            MenuTeller(result);
            return true;
        }
        else{
            System.out.println("Login Gagal");
            return false;
        }
    }
    public boolean simpanUang(Nasabah nasabah){
        if(nasabahService.simpanUang(nasabah)){
            System.out.println("Simpan Uang Berhasil");
            MenuTeller(nasabah);return true;
        }
      return false;
    }
    public boolean tarikUangATM(Nasabah nasabah){
        if(nasabahService.tarikUangATM(nasabah)){
            System.out.println("Tarik Uang melalui ATM Sukses");
            MenuATM(nasabah);return true;
        }
      return false;
    }
    public boolean tarikUangTeller(Nasabah nasabah){
        if(nasabahService.tarikUangTeller(nasabah)){
            System.out.println("Tarik Uang melalui Teller Sukses");
            MenuTeller(nasabah);return true;
        }
      return false;
    }
    public boolean saldoATM(Nasabah nasabah){
        if(nasabahService.saldoATM(nasabah)){
            System.out.println("Tarik Uang melalui ATM Sukses");
            MenuATM(nasabah);return true;
        }
      return false;
    }
    public boolean saldoTeller(Nasabah nasabah){
        if(nasabahService.saldoTeller(nasabah)){
            System.out.println("Tarik Uang melalui Teller Sukses");
            MenuTeller(nasabah);return true;
        }
      return false;
    }
    public boolean transferATM(Nasabah nasabah){
        if(nasabahService.transferATM(nasabah)){
            System.out.println("Transfer melalui ATM Berhasil");
            MenuATM(nasabah);
            return true;
        }
        return false;
    
    }
    public boolean transferTeller(Nasabah nasabah){
        if(nasabahService.transferTeller(nasabah)){
            System.out.println("Transfer Melalui Teller Berhasil");
            MenuTeller(nasabah);return true;
        }
        return false;
    }
}
