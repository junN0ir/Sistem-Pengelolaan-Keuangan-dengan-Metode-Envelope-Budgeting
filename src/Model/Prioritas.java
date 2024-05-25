package sistembudgeting.Model;

public class Prioritas {
    private Pemasukan pemasukan;
    private final double persenPokok = 50.0;
    private final double persenSekunder = 30.0;
    private final double persenTersier = 20.0;

    public Prioritas(Pemasukan pemasukan) {
        this.pemasukan = pemasukan;
    }

    // Getter methods
    public Pemasukan getPemasukan() {
        return pemasukan;
    }

    public double getPersenPokok() {
        return persenPokok;
    }

    public double getPersenSekunder() {
        return persenSekunder;
    }

    public double getPersenTersier() {
        return persenTersier;
    }

    // Setter methods
    public void setPemasukan(Pemasukan pemasukan) {
        this.pemasukan = pemasukan;
    }

    // Method untuk menghitung total pemasukan berdasarkan prioritasnya
    public double hitungTotalPemasukan() {
        double totalPemasukan = pemasukan.getTotalPemasukan();
        double totalPokok = (persenPokok / 100) * totalPemasukan;
        double totalSekunder = (persenSekunder / 100) * totalPemasukan;
        double totalTersier = (persenTersier / 100) * totalPemasukan;

        return totalPokok + totalSekunder + totalTersier;
    }

    // Method untuk menambah pengeluaran
    public void addPengeluaran(double jumlah, String jenis) {
        double totalPemasukan = pemasukan.getTotalPemasukan();

        switch (jenis.toLowerCase()) {
            case "pokok":
                if (jumlah > (persenPokok / 100) * totalPemasukan) {
                    throw new IllegalArgumentException("Jumlah pengeluaran pokok melebihi batas");
                }
                break;
            case "sekunder":
                if (jumlah > (persenSekunder / 100) * totalPemasukan) {
                    throw new IllegalArgumentException("Jumlah pengeluaran sekunder melebihi batas");
                }
                break;
            case "tersier":
                if (jumlah > (persenTersier / 100) * totalPemasukan) {
                    throw new IllegalArgumentException("Jumlah pengeluaran tersier melebihi batas");
                }
                break;
            default:
                throw new IllegalArgumentException("Jenis pengeluaran tidak dikenal");
