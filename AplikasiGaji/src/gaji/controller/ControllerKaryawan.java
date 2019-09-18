/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji.controller;

import gaji.query.QueryKaryawan;
import java.util.List;
import model.Karyawan;

/**
 *
 * @author AdittyaS
 */
public class ControllerKaryawan {
    private QueryKaryawan queryKaryawan =  new QueryKaryawan();
    
    public List<Karyawan> getAllData(){
        return queryKaryawan.getAllKaryawan();
    }
    
    public List<Karyawan> getNamaKaryawan(String nama_karyawan){
        return queryKaryawan.getNamaKaryawan(nama_karyawan);
    }
    
    public boolean insertKaryawan(int id, String name){
        if(id==0 && name.isEmpty()){
            return false;
        } else {
            Karyawan gol = new Karyawan(id, name);
            return queryKaryawan.insert(gol);
        }
    }
    
    public boolean updateKaryawan(int id, String name){
       if(id==0 && name.isEmpty()){
           return false;
       } else {
           Karyawan gol = new Karyawan(id, name);
           return queryKaryawan.update(gol);
       }
    }
    
    public boolean deleteKaryawan(int id){
        return queryKaryawan.delete(id);
    }
    
    public int generateID(){
        return queryKaryawan.generateID();
    }
}
