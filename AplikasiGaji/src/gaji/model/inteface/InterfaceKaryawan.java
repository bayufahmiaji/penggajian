/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji.model.inteface;

import java.util.List;
import model.Karyawan;

/**
 *
 * @author AdittyaS
 */
public interface InterfaceKaryawan {
    public boolean insert(Karyawan data);
    public boolean update(Karyawan data);
    public boolean delete(int id_urutan);
    public int generateID();
    
    public List<Karyawan> getAllKaryawan();
    
    public Karyawan getOneKaryawanByID(int id_urutan);
    
    public List<Karyawan> getAllKaryawanByName(String nama_karyawan);
}
