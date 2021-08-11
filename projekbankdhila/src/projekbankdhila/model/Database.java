
package projekbankdhila.model;

import java.util.ArrayList;
import projekbankdhila.model.KartuATM.tipeKartu;

public class Database {
    private tipeKartu tipe;
    ArrayList<Nasabah> listNasabah = new ArrayList();
    
    Nasabah nasabah1 = new Nasabah (2103171001,"Muhammad Taufiqurrahman",1701,7000000,tipe.GOLD);
    Nasabah nasabah2 = new Nasabah (2103171002,"Fajar YunusA",1702,7000000,tipe.SILVER);
    Nasabah nasabah3 = new Nasabah (2103171003,"Frisco Nirwana P",1703,7000000,tipe.GOLD);
    Nasabah nasabah4 = new Nasabah (2103171004,"Anas Shofyan M F",1704,7000000,tipe.SILVER);
    Nasabah nasabah5 = new Nasabah (2103171005,"Urfiyatul Erifani",1705,7000000,tipe.GOLD);
    Nasabah nasabah6 = new Nasabah (2103171006,"Rivatul Amilia",1706,7000000,tipe.SILVER);
    Nasabah nasabah7 = new Nasabah (2103171007,"Adhi Dwi Saputro",1707,7000000,tipe.GOLD);
    Nasabah nasabah8 = new Nasabah (2103171008,"Rintan Aprillia",1708,7000000,tipe.SILVER);
    Nasabah nasabah9 = new Nasabah (2103171009,"Defa Widya",1709,7000000,tipe.GOLD);
    Nasabah nasabah10 = new Nasabah (2103171010,"Annisa Restu",1110,7000000,tipe.SILVER);
    Nasabah nasabah11 = new Nasabah (2103171011,"Setiawan Joko",1711,7000000,tipe.GOLD);
    Nasabah nasabah12 = new Nasabah (2103171012,"Afina Nadalia",1712,7000000,tipe.SILVER);
    Nasabah nasabah13 = new Nasabah (2103171013,"Fatimah Isnaini",1713,7000000,tipe.GOLD);
    Nasabah nasabah14 = new Nasabah (2103171014,"Fauziah Ikhrar",1714,7000000,tipe.SILVER);
    Nasabah nasabah15 = new Nasabah (2103171015,"Irma Dwi M",1715,7000000,tipe.GOLD);
    Nasabah nasabah16 = new Nasabah (2103171016,"Novarita Milianti",1716,7000000,tipe.SILVER);
    Nasabah nasabah17 = new Nasabah (2103171017,"Familano Widha M P",1717,7000000,tipe.GOLD);
    Nasabah nasabah18 = new Nasabah (2103171018,"Yasmin Nurfatikah P",1718,7000000,tipe.SILVER);
    Nasabah nasabah19 = new Nasabah (2103171019,"Gevalinda Putri",1719,7000000,tipe.GOLD);
    Nasabah nasabah20 = new Nasabah (2103171020,"Selviana Lailatul M",1720,7000000,tipe.SILVER);
    Nasabah nasabah21 = new Nasabah (2103171021,"Fahim Ulil F",1721,7000000,tipe.GOLD);
    Nasabah nasabah22 = new Nasabah (2103171022,"Lailatul Umma",1722,7000000,tipe.SILVER);
    Nasabah nasabah23 = new Nasabah (2103171023,"Moch Akbar Ilham",1723,7000000,tipe.GOLD);
    Nasabah nasabah24 = new Nasabah (2103171024,"Aqsal Ramadhan",1724,7000000,tipe.SILVER);
    Nasabah nasabah25 = new Nasabah (2103171025,"Winarsih",1725,7000000,tipe.GOLD);
    Nasabah nasabah26 = new Nasabah (2103171026,"Alief Bimo",1726,7000000,tipe.SILVER);
    Nasabah nasabah27 = new Nasabah (2103171027,"Lutfiyah N Fadhilah",1727,7000000,tipe.GOLD);
    Nasabah nasabah28 = new Nasabah (2103171028,"Syahfiar Dhani A",1728,7000000,tipe.SILVER);
    Nasabah nasabah29 = new Nasabah (2103171029,"Almas Ahmad",1729,7000000,tipe.GOLD);
    Nasabah nasabah30 = new Nasabah (2103171030,"Nadilla Choirul H",1730,7000000,tipe.SILVER);
    public void addList(){
        listNasabah.add(nasabah1);
        listNasabah.add(nasabah2);
        listNasabah.add(nasabah3);
        listNasabah.add(nasabah4);
        listNasabah.add(nasabah5);
        listNasabah.add(nasabah6);
        listNasabah.add(nasabah7);
        listNasabah.add(nasabah8);
        listNasabah.add(nasabah9);
        listNasabah.add(nasabah10);
        listNasabah.add(nasabah11);
        listNasabah.add(nasabah12);
        listNasabah.add(nasabah13);
        listNasabah.add(nasabah14);
        listNasabah.add(nasabah15);
        listNasabah.add(nasabah16);
        listNasabah.add(nasabah17);
        listNasabah.add(nasabah18);
        listNasabah.add(nasabah19);
        listNasabah.add(nasabah20);
        listNasabah.add(nasabah21);
        listNasabah.add(nasabah22);
        listNasabah.add(nasabah23);
        listNasabah.add(nasabah24);
        listNasabah.add(nasabah25);
        listNasabah.add(nasabah26);
        listNasabah.add(nasabah27);
        listNasabah.add(nasabah28);
        listNasabah.add(nasabah29);
        listNasabah.add(nasabah30);
        
    }
     public ArrayList<Nasabah> getAll() {
        return listNasabah;
    }
    
    public Nasabah getByNoRek(int noRek){
        for (Nasabah n : listNasabah){
            if(n.getNoRek() == noRek)
                return n;
        }
        return null;
    }
}
