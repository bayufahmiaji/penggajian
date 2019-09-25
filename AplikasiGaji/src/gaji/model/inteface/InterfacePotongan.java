/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji.model.inteface;

import java.util.List;
import model.Potongan;

/**
 *
 * @author User
 */
public interface InterfacePotongan {
    public boolean insert(Potongan data);
    public boolean update(Potongan data);
    public boolean delete(int id_urutan);
    
    public List<Potongan> getAllTransaksi();
    public List<Potongan> getTransaksiByID(int id_urutan);
}
