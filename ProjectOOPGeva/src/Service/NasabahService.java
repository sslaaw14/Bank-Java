package Service;

import Dao.NasabahDao;
import Model.Nasabah;
import java.util.ArrayList;
import java.util.List;

public class NasabahService {
    NasabahDao dao = new NasabahDao();
    
    public boolean register(Nasabah nasabah){
        ArrayList<Nasabah> list = dao.findAll();
        for(Nasabah n : list){
            if(n.getNama().equals(nasabah.getNama()) && n.getNo_rek().equals(nasabah.getNo_rek())) {
            return false;
            }
        }
        dao.save(nasabah);
        return true;
    }
    public Nasabah loginATM(Nasabah nasabah){
        ArrayList<Nasabah> list = dao.findAll();
         for(Nasabah n : list){
            if(n.getNama().equals(nasabah.getNama()) && n.getPin().equals(nasabah.getPin())){
            return n;
            }
        }
        return null;
    }
    public Nasabah loginTeller(Nasabah nasabah){
        ArrayList<Nasabah> list = dao.findAll();
         for(Nasabah n : list){
            if(n.getNo_rek().equals(nasabah.getNo_rek()) && n.getPin().equals(nasabah.getPin())){
            return n;
            }
        }
        return null;
    }
    public boolean simpanUang(Nasabah nasabah){
        ArrayList<Nasabah> list = dao.findAll();
        for(Nasabah n : list){
            return true;
        }
        return false;
    }
    public boolean tarikUangATM(Nasabah nasabah){
        ArrayList<Nasabah> list = dao.findAll();
        for(Nasabah n : list){
            return true;
        }
        return false;
    }
    public boolean tarikUangTeller(Nasabah nasabah){
        ArrayList<Nasabah> list = dao.findAll();
        for(Nasabah n : list){
            return true;
        }
        return false;
    }
    public boolean saldoATM(Nasabah nasabah){
        ArrayList<Nasabah> list = dao.findAll();
        for(Nasabah n : list){
            return true;
        }
        return false;
    }
    public boolean saldoTeller(Nasabah nasabah){
        ArrayList<Nasabah> list = dao.findAll();
        for(Nasabah n : list){
            return true;
        }
        return false;
    }
    public boolean transferATM(Nasabah nasabah){
        ArrayList<Nasabah> list = dao.findAll();
        for(Nasabah n : list){
            return true;
        }
        return false;
    }
    public boolean transferTeller(Nasabah nasabah){
        ArrayList<Nasabah> list = dao.findAll();
        for(Nasabah n : list){
            return true;
        }
        return false;
    }
    
    public boolean transfer(Nasabah nasabah){
        ArrayList<Nasabah> list = dao.findAll();
        for(Nasabah n : list){
            return true;
        }
        return false;
    }
}
