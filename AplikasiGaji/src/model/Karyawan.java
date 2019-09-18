/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author noval
 */
public class Karyawan {
    private int id_urutan;
    private String nama_karyawan;
    
    public Karyawan (int id_urutan, String nama_karyawan){
        this.id_urutan = id_urutan;
        this.nama_karyawan = nama_karyawan;
    }

    public int getId_urutan() {
        return id_urutan;
    }

    public void setId_urutan(int id_urutan) {
        this.id_urutan = id_urutan;
    }

    public String getNama_karyawan() {
        return nama_karyawan;
    }

    public void setNama_karyawan(String nama_karyawan) {
        this.nama_karyawan = nama_karyawan;
    }
    
    
}
