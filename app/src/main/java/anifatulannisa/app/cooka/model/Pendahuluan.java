package anifatulannisa.app.cooka.model;

/**
 * Created by nina on 1/9/19.
 */

public class Pendahuluan {
    private String deskripsi;
    private String waktu;
    private String porsi;

    public Pendahuluan(String deskripsi, String waktu, String porsi) {
        this.deskripsi = deskripsi;
        this.waktu = waktu;
        this.porsi = porsi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getWaktu() {
        return waktu;
    }

    public String getPorsi() {
        return porsi;
    }
}
