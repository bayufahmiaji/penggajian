/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public class Report {
    private int id_urutan;
    private String nama_karyawan;
    private double totalgaji,totalpotongan,gajibersih;
    
    
    public Report (int id_urutan, String nama_karyawan,double totalgaji,double totalpotongan,double gajibersih){
        this.id_urutan = id_urutan;
        this.nama_karyawan = nama_karyawan;
        this.totalgaji = totalgaji;
        this.totalpotongan = totalpotongan;
        this.gajibersih = gajibersih;
    }

    /**
     * @return the id_urutan
     */
    public int getId_urutan() {
        return id_urutan;
    }

    /**
     * @param id_urutan the id_urutan to set
     */
    public void setId_urutan(int id_urutan) {
        this.id_urutan = id_urutan;
    }

    /**
     * @return the nama_karyawan
     */
    public String getNama_karyawan() {
        return nama_karyawan;
    }

    /**
     * @param nama_karyawan the nama_karyawan to set
     */
    public void setNama_karyawan(String nama_karyawan) {
        this.nama_karyawan = nama_karyawan;
    }

    /**
     * @return the totalgaji
     */
    public double getTotalgaji() {
        return totalgaji;
    }

    /**
     * @param totalgaji the totalgaji to set
     */
    public void setTotalgaji(double totalgaji) {
        this.totalgaji = totalgaji;
    }

    /**
     * @return the totalpotongan
     */
    public double getTotalpotongan() {
        return totalpotongan;
    }

    /**
     * @param totalpotongan the totalpotongan to set
     */
    public void setTotalpotongan(double totalpotongan) {
        this.totalpotongan = totalpotongan;
    }

    /**
     * @return the gajibersih
     */
    public double getGajibersih() {
        return gajibersih;
    }

    /**
     * @param gajibersih the gajibersih to set
     */
    public void setGajibersih(double gajibersih) {
        this.gajibersih = gajibersih;
    }
    
}
