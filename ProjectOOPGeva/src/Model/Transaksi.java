package Model;

public class Transaksi {
    private Long id;
    private Nasabah from;
    private Nasabah to;
    private String tipe;
    private Long nominal;

public Transaksi(Nasabah from, Nasabah to, String tipe, Long nominal) {
        this.from = from;
        this.to = to;
        this.tipe = tipe;
        this.nominal = nominal;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Nasabah getFrom() {
        return from;
    }

    public void setFrom(Nasabah from) {
        this.from = from;
    }

    public Nasabah getTo() {
        return to;
    }

    public void setTo(Nasabah to) {
        this.to = to;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public Long getNominal() {
        return nominal;
    }

    public void setNominal(Long nominal) {
        this.nominal = nominal;
    }

    
    
    @Override
    public String toString() {
        return tipe;
    }
}

