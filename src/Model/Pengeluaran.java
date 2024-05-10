package sistemkeuangan;

import java.util.Date;

public class Pengeluaran extends Anggaran{
    private double totalPengeluaran;
    private String kategori;

    public Pengeluaran(double totalPengeluaran, String kategori, double totalAnggaran, Date tanggal, String deskripsi){
        super(totalAnggaran, tanggal, deskripsi);
        this.totalPengeluaran = totalPengeluaran;
        this.kategori = kategori;
    }

    //metode getter//
    public double getTotalPengeluaran(){
        return totalPengeluaran;
    }

    public String getKategori(){
        return kategori;
    }

    //metode setter//
    public void setTotalPengeluaran(double totalPengeluaran){
        this.totalPengeluaran = totalPengeluaran;
    }

    public void setKategori(String kategori){
        this.kategori = kategori;
    }

    public static void tanggal(){
        Date tanggal = new Date();
        System.out.println(tanggal);
    }
}
