/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP1DPBO;

/**
 *
 * @author VieR
 */
public class Buku {
    private int id_buku;
    private String img;
    private String penerbit;
    private String autor;
    private String descript;

    public Buku(int id_buku, String img, String penerbit, String autor, String descript) {
        this.id_buku = id_buku;
        this.img = img;
        this.penerbit = penerbit;
        this.autor = autor;
        this.descript = descript;
    }

    public int getId() {
        return id_buku;
    }

    public String getImg() {
        return img;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getAutor() {
        return autor;
    }

    public String getDescript() {
        return descript;
    }

    public void setId(int id) {
        this.id_buku = id_buku;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }
    
    
}
