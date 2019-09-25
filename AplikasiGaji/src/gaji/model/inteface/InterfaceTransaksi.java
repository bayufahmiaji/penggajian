/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji.model.inteface;

import java.util.List;
import model.Transaksi;

/**
 *
 * @author AdittyaS
 */
public interface InterfaceTransaksi {
    public boolean insert(Transaksi data);
    public boolean update(Transaksi data);
    public boolean delete(int id_urutan);
    
    public List<Transaksi> getAllTransaksi();
    public List<Transaksi> getTransaksiByID(int id_urutan);
   
    

}
