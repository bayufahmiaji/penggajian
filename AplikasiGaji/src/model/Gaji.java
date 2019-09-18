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
public class Gaji {
    private String name;
    private double gaji;
    private double gaji_pokok;
    private double tunjangan_prestasi;
    private double tunjangan_pph;
    private double tunjangan_jabatan;
    private double bpjs_kesehatan;
    private double bpjs_ketenagakerjaan;
    private double lain;
    private double tunjangan_kedisiplinan;
    private double transport;
    private int id_urutan;
    
    public Gaji(int id_urutan, String name, double gaji, double gaji_pokok, double tunjangan_jabatan, double tunjangan_kedisiplinan,
            double transport, double tunjangan_prestasi, double tunjangan_pph, double bpjs_kesehatan, double bpjs_ketenagakerjaan, double lain){
        this.name = name;
        this.gaji = gaji;
        this.gaji_pokok = gaji_pokok;
        this.tunjangan_jabatan = tunjangan_jabatan;
        this.tunjangan_prestasi = tunjangan_prestasi;
        this.tunjangan_kedisiplinan = tunjangan_kedisiplinan;
        this.tunjangan_pph = tunjangan_pph;
        this.bpjs_kesehatan = bpjs_kesehatan;
        this.bpjs_ketenagakerjaan = bpjs_ketenagakerjaan;
        this.lain = lain;
        this.transport = transport;
        this.id_urutan = id_urutan;
    }

    public Gaji(String name) {
        this.name = name;
    }
    
    public Gaji(double gaji, double gaji_pokok, double tunjangan_jabatan, double tunjangan_kedisiplinan,
            double transport, double tunjangan_prestasi, double tunjangan_pph, double bpjs_kesehatan, double bpjs_ketenagakerjaan, double lain, String name){
        this.name = name;
        this.gaji = gaji;
        this.gaji_pokok = gaji_pokok;
        this.tunjangan_jabatan = tunjangan_jabatan;
        this.tunjangan_prestasi = tunjangan_prestasi;
        this.tunjangan_kedisiplinan = tunjangan_kedisiplinan;
        this.tunjangan_pph = tunjangan_pph;
        this.bpjs_kesehatan = bpjs_kesehatan;
        this.bpjs_ketenagakerjaan = bpjs_ketenagakerjaan;
        this.lain = lain;
        this.transport = transport;
    }
    
    public String getNama_karyawan() {
        return name;
    }

    public void setNama_karyawan(String name) {
        this.name = name;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getTunjangan_prestasi() {
        return tunjangan_prestasi;
    }

    public void setTunjangan_prestasi(double tunjangan_prestasi) {
        this.tunjangan_prestasi = tunjangan_prestasi;
    }

    public double getTunjangan_pph() {
        return tunjangan_pph;
    }

    public void setTunjangan_pph(double tunjangan_pph) {
        this.tunjangan_pph = tunjangan_pph;
    }

    public double getBpjs_kesehatan() {
        return bpjs_kesehatan;
    }

    public void setBpjs_kesehatan(double bpjs_kesehatan) {
        this.bpjs_kesehatan = bpjs_kesehatan;
    }

    public double getBpjs_ketenagakerjaan() {
        return bpjs_ketenagakerjaan;
    }

    public void setBpjs_ketenagakerjaan(double bpjs_ketenagakerjaan) {
        this.bpjs_ketenagakerjaan = bpjs_ketenagakerjaan;
    }

    public double getLain_lain() {
        return lain;
    }

    public void setLain_lain(double lain) {
        this.lain = lain;
    }
    
    public double getGaji_Pokok(){
        return gaji_pokok;
    }
    
    public void setGaji_Pokok(double gaji_pokok){
        this.gaji_pokok = gaji_pokok;
    }
    
    public double getTunjangan_Jabatan(){
        return tunjangan_jabatan;
    }
    
    public void setTunjangan_Jabatan(double tunjangan_jabatan){
        this.tunjangan_jabatan = tunjangan_jabatan;
    }
    
    public double getTunjangan_Kedisiplinan(){
        return tunjangan_kedisiplinan;
    }
    
    public void setTunjangan_Kedisiplinan(double tunjangan_kedisiplinan){
        this.tunjangan_kedisiplinan = tunjangan_kedisiplinan;
    }

    public double getTransport() {
        return transport;
    }

    public void setTransport(double transport) {
        this.transport = transport;
    }

    public int getId_urutan() {
        return id_urutan;
    }

    public void setId_urutan(int id_urutan) {
        this.id_urutan = id_urutan;
    }
}
