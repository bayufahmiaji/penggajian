/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author AdittyaS
 */
public class Transaksi {
    private double izin,alfa,terlambat,kesehatan,ketenagakerjaan,pph,lain;
    private int id_urutan;
    private String name;
    
    public Transaksi(double izin, double alfa,double terlambat,double kesehatan,double ketenagakerjaan,double pph,double lain, int id_urutan, String name){
        this.izin = izin;
        this.alfa = alfa;
        this.terlambat = terlambat;
        this.kesehatan = kesehatan;
        this.ketenagakerjaan = ketenagakerjaan;
        this.pph = pph;
        this.lain = lain;
        this.id_urutan = id_urutan;
        this.name = name;
    }

    public Transaksi(int id_urutan,double izin, double alfa,double terlambat,double kesehatan,double ketenagakerjaan,double pph,double lain){
        this.izin = izin;
        this.alfa = alfa;
        this.terlambat = terlambat;
        this.kesehatan = kesehatan;
        this.ketenagakerjaan = ketenagakerjaan;
        this.pph = pph;
        this.lain = lain;
        this.id_urutan = id_urutan;
    }
    
    public double getIzin() {
        return izin;
    }

    public void setIzin(double izin) {
        this.izin = izin;
    }

    public double getAlfa() {
        return alfa;
    }

    public void setAlfa(double alfa) {
        this.alfa = alfa;
    }

    public double getTerlambat() {
        return terlambat;
    }

    public void setTerlambat(double terlambat) {
        this.terlambat = terlambat;
    }

    public double getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(double kesehatan) {
        this.kesehatan = kesehatan;
    }

    public double getKetenagakerjaan() {
        return ketenagakerjaan;
    }

    public void setKetenagakerjaan(double ketenagakerjaan) {
        this.ketenagakerjaan = ketenagakerjaan;
    }

    public double getPph() {
        return pph;
    }

    public void setPph(double pph) {
        this.pph = pph;
    }

    public double getLain() {
        return lain;
    }

    public void setLain(double lain) {
        this.lain = lain;
    }

    public int getId_urutan() {
        return id_urutan;
    }

    public void setId_urutan(int id_urutan) {
        this.id_urutan = id_urutan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
