/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP1DPBO;

/**
 *
 * @author VieR
 */
public class Autor {
    private int id_autor;
    private String img;
    private String nama;
    private int jumlah_buku;

    public Autor(int id_autor, String img, String nama, int jumlah_buku) {
        this.id_autor = id_autor;
        this.img = img;
        this.nama = nama;
        this.jumlah_buku = jumlah_buku;
    }

    public int getId_autor() {
        return id_autor;
    }

    public String getImg() {
        return img;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlah_buku() {
        return jumlah_buku;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJumlah_buku(int jumlah_buku) {
        this.jumlah_buku = jumlah_buku;
    }
    
    
}
