/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji.model.inteface;

import java.util.List;
import model.Report;

/**
 *
 * @author User
 */
public interface InterfaceReport {
    public boolean insert(Report data);
    public boolean update(Report data);
    public boolean delete(int id_urutan);
    public int getTotal();
    
    public List<Report> getAllReport();
}
