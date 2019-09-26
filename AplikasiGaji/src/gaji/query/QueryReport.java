/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji.query;

import gaji.connection.SQLConnection;
import gaji.model.inteface.InterfaceReport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Report;

/**
 *
 * @author User
 */
public class QueryReport implements InterfaceReport{
    private Connection conn = SQLConnection.getConnection();
    
    @Override
    public boolean insert(Report data) {
        String sql = "Insert Into report values (?,?,?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, data.getId_urutan());
            statement.setString(2, data.getNama_karyawan());
            statement.setDouble(3, data.getTotalgaji());
            statement.setDouble(4, data.getTotalpotongan());
            statement.setDouble(5, data.getGajibersih());
            int row = statement.executeUpdate();
            if(row > 0){
                return true;
            }
            statement.close();
        } catch (SQLException ex) {  
            Logger.getLogger(QueryReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;}

    @Override
    public boolean update(Report data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id_urutan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getTotal() {
        int id_urutan = 0;
        String sql = "select SUM(gajibersih) from report";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                id_urutan = rs.getInt(1);
            } 
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(QueryReport.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return id_urutan;
}

    @Override
    public List<Report> getAllReport() {
        List<Report> listReport = new ArrayList<>();
        String sql = "Select * from report";
        try {
            if (SQLConnection.getConnection()==null){
                return null;
                
            } else {
                PreparedStatement statement = conn.prepareStatement(sql);
                
                ResultSet rs = statement.executeQuery();
                while(rs.next()){
                    Report g = new Report(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getDouble(3),
                    rs.getDouble(4),
                    rs.getDouble(5)
                    );
                    listReport.add(g);
                }
                statement.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(QueryReport.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return listReport;
}
    
}
