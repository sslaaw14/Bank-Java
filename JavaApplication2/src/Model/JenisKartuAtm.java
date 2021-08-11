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
public class JenisKartuAtm {
    private double batasTransfer;
    private double batasAmbilUang;

    public JenisKartuAtm(double batasTransfer, double batasAmbilUang) {
        this.batasTransfer = batasTransfer;
        this.batasAmbilUang = batasAmbilUang;
    }

    public double getBatasTransfer() {
        return batasTransfer;
    }

    public double getBatasAmbilUang() {
        return batasAmbilUang;
    }
    
    
    
    
}
