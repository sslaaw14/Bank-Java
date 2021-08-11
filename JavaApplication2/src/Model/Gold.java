/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Fauziah
 */
public class Gold extends JenisKartuAtm {

    public Gold(double batasTransfer, double batasAmbilUang) {
        super(15000000, 10000000);
    }
    
    @Override
    public double getBatasAmbilUang() {
        return super.getBatasAmbilUang(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getBatasTransfer() {
        return super.getBatasTransfer(); //To change body of generated methods, choose Tools | Templates.
    }

}
