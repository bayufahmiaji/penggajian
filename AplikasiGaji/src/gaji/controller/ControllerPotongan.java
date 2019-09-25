/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji.controller;

import gaji.query.QueryPotongan;
import java.util.List;
import model.Potongan;

/**
 *
 * @author User
 */
public class ControllerPotongan {
    private QueryPotongan queryPotongan = new QueryPotongan();
    
    public List<Potongan> getDataById(int id_urutan){
        return queryPotongan.getTransaksiByID(id_urutan);
    }
    
    public boolean insertTransaksi(int id_urutan,double izin, double alfa,double terlambat,double kesehatan,double ketenagakerjaan,double pph,double lain){
        if(id_urutan==0){
            return false;
        } else {
            Potongan gol = new Potongan(id_urutan, izin, alfa, terlambat, kesehatan, ketenagakerjaan, pph, lain);
            return queryPotongan.insert(gol);
        }
    }
    
}
