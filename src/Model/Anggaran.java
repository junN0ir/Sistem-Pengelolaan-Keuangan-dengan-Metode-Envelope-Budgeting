package sistemkeuangan;

import java.util.Date;

public class Anggaran {
    protected double totalAnggaran;
    protected Date tanggal;
    protected String deskripsi;

    public Anggaran(double totalAnggaran, Date tanggal, String deskripsi){
        this.totalAnggaran = totalAnggaran;
        this.tanggal = tanggal;
        this.deskripsi = deskripsi;
    }
    
    //metode getter//
    public double getTotalAnggaran(){
        return this.totalAnggaran;
    }

    public String getDeskripsi(){
        return this.deskripsi;
    }

    public Date getTanggal(){
        return this.tanggal;
    }

    //metdode setter//
    public void setTotalAnggaran(double totalAnggaran){
        this.totalAnggaran = totalAnggaran;
    }

    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }

    public void setTanggal(Date tanggal){
        this.tanggal = tanggal;
    }

    @override
    public String toString(){
       return "Anggaran Anda saat ini : " + totalAnggaran;
    }   
}
