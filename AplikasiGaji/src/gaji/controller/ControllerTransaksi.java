/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji.controller;

import gaji.query.QueryTransaksi;
import java.util.List;
import model.Transaksi;

/**
 *
 * @author AdittyaS
 */
public class ControllerTransaksi {
    private QueryTransaksi queryTransaksi = new QueryTransaksi();
    
    public List<Transaksi> getAllData(){
        return queryTransaksi.getAllTransaksi();
    }
    
    public List<Transaksi> getDataById(int id_urutan){
        return queryTransaksi.getTransaksiByID(id_urutan);
    }
    
    public boolean insertTransaksi(int id_urutan,double izin, double alfa,double terlambat,double kesehatan,double ketenagakerjaan,double pph,double lain){
        if(id_urutan==0){
            return false;
        } else {
            Transaksi gol = new Transaksi(id_urutan, izin, alfa, terlambat, kesehatan, ketenagakerjaan, pph, lain);
            return queryTransaksi.insert(gol);
        }
    }
    
    public boolean updateTransaksi(int id_urutan,double izin, double alfa,double terlambat,double kesehatan,double ketenagakerjaan,double pph,double lain){
        if(id_urutan==0){
            return false;
        } else {
            Transaksi gol = new Transaksi(id_urutan, izin, alfa, terlambat, kesehatan, ketenagakerjaan, pph, lain);
            return queryTransaksi.update(gol);
        }
    }
    
    public boolean deleteTransaksi(int id_urutan){
        return queryTransaksi.delete(id_urutan);
    }
   
}
