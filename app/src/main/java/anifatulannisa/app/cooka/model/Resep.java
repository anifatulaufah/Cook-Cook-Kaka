package anifatulannisa.app.cooka.model;

/**
 * Created by nina on 1/7/19.
 */

public class Resep {
    private String Judul;
    private int Image;

    public Resep(String judul, int image) {
        Judul = judul;
        Image = image;
    }

    public String getJudul() {
        return Judul;
    }

    public int getImage() {
        return Image;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public void setImage(int image) {
        Image = image;
    }
}
