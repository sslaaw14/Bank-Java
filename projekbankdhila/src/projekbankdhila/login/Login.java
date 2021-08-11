package projekbankdhila.login;

import java.util.ArrayList;
import projekbankdhila.model.Database;
import projekbankdhila.model.Nasabah;

public class Login {
    Database db = new Database();
   
    public int compareTo(Nasabah n1, Nasabah n2) {
        if(n1.getNoRek()==n2.getNoRek() &&
                n1.getPin()==n2.getPin())
            return 0;
        return 1;
    }

    public Nasabah login(Nasabah nasabah) {
        db.addList();
        ArrayList<Nasabah> ln = db.getAll();
        for(Nasabah n:ln){
            if(compareTo(nasabah,n) == 0)
                return n;
        }
        return null;
    }
}
