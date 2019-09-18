/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji.controller;

import gaji.query.QueryGaji;
import java.util.List;
import model.Gaji;

/**
 *
 * @author AdittyaS
 */
public class ControllerGaji {
    private QueryGaji queryGaji = new QueryGaji();
    
    public List<Gaji> getAllGaji(){
        return queryGaji.getAllGaji();
    }
    
    public boolean insertGaji(int id_urutan, String name, double gaji, double gaji_pokok, double tunjangan_jabatan, double tunjangan_kedisiplinan,
            double transport, double tunjangan_prestasi, double tunjangan_pph, double bpjs_kesehatan, double bpjs_ketenagakerjaan, double lain){
        if(name.isEmpty()){
            return false;
        } else {
            Gaji gol = new Gaji(id_urutan,name,gaji,gaji_pokok,tunjangan_jabatan,tunjangan_kedisiplinan,transport,tunjangan_prestasi,tunjangan_pph,bpjs_kesehatan,bpjs_ketenagakerjaan,lain);
            return queryGaji.insert(gol);
        }
    }
    
    public boolean updateGaji(Gaji data){
        return queryGaji.update(data);
    }
    
    public boolean deleteGaji(String name){
        return queryGaji.delete(name);
    }
}
