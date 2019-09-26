/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji.controller;

import gaji.query.QueryReport;
import java.util.List;
import model.Report;

/**
 *
 * @author User
 */
public class ControllerReport {
    QueryReport queryreport = new QueryReport();
    
    public boolean insertReport(int id_urutan, String nama_karyawan,double totalgaji,double totalpotongan,double gajibersih){
        if(id_urutan==0){
            return false;
        } else {
            Report gol = new Report(id_urutan, nama_karyawan,totalgaji,totalpotongan,gajibersih);
            return queryreport.insert(gol);
        }
    }
    
    public int gettotal(){
        return queryreport.getTotal();
    }
    
     public List<Report> getAllData(){
        return queryreport.getAllReport();
    }
    
}
