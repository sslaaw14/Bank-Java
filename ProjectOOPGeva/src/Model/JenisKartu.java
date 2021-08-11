package Model;

public class JenisKartu {
    private double batasTransfer;
    private double batasAmbilUang;
    private double batasTarikUang;

    public JenisKartu() {
        
    }
    
    public JenisKartu(double batasTransfer, double batasTarikUang) {
        this.batasTransfer = batasTransfer;
        this.batasTarikUang = batasTarikUang;
    }
    
    public double getBatasTransfer() {
        return batasTransfer;
    }

    public double getBatasTarikUang() {
        return batasTarikUang;
    }
}