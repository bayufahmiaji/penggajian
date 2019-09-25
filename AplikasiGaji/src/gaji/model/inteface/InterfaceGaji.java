/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji.model.inteface;

import java.util.List;
import model.Gaji;

/**
 *
 * @author AdittyaS
 */
public interface InterfaceGaji {
    public boolean insert(Gaji data);
    public boolean update(Gaji data);
    public boolean delete(String nama_karyawan);
    
    public List<Gaji> getAllGaji();
    public List<Gaji> getgajibyid(int id_urutan);
    
}
