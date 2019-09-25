/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji.query;

import gaji.connection.SQLConnection;
import gaji.model.inteface.InterfaceGaji;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import model.Gaji;

/**
 *
 * @author AdittyaS
 */
public class QueryGaji implements InterfaceGaji {

    private Connection conn = SQLConnection.getConnection();
    
    @Override
    public boolean insert(Gaji data) {
        String sql = "Insert Into gaji values (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setDouble(1, data.getId_urutan());
            statement.setString(2, data.getNama_karyawan());
            statement.setDouble(3, data.getGaji());
            statement.setDouble(4, data.getGaji_Pokok());
            statement.setDouble(5, data.getTunjangan_Jabatan());
            statement.setDouble(6, data.getTunjangan_Kedisiplinan());
            statement.setDouble(7, data.getTransport());
            statement.setDouble(8, data.getTunjangan_prestasi());
            statement.setDouble(9, data.getTunjangan_pph());
            statement.setDouble(10, data.getBpjs_kesehatan());
            statement.setDouble(11, data.getBpjs_ketenagakerjaan());
            statement.setDouble(12, data.getLain_lain());
            int row = statement.executeUpdate();
            if(row > 0){
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(QueryGaji.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return false;
    }

    @Override
    public boolean update(Gaji data) {
        String sql = "Update gaji Set gaji=?, gaji_pokok=?, jabatan=?, kedisiplinan=?, transport=?, prestasi=?, pph=?, kesehatan=?, ketenagakerjaan=?, lain=? where nama_karyawan=?";
        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setDouble(1, data.getGaji());
            statement.setDouble(2, data.getGaji_Pokok());
            statement.setDouble(3, data.getTunjangan_Jabatan());
            statement.setDouble(4, data.getTunjangan_Kedisiplinan());
            statement.setDouble(5, data.getTransport());
            statement.setDouble(6, data.getTunjangan_prestasi());
            statement.setDouble(7, data.getTunjangan_pph());
            statement.setDouble(8, data.getBpjs_kesehatan());
            statement.setDouble(9, data.getBpjs_ketenagakerjaan());
            statement.setDouble(10, data.getLain_lain());
            statement.setString(11, data.getNama_karyawan());
            int row = statement.executeUpdate();
            if(row > 0){
                return true;
            }
            statement.close();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(QueryGaji.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(String nama_karyawan) {
        String sql = "delete from gaji where nama_karyawan=?";
        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, nama_karyawan);
            int row = statement.executeUpdate();
            if(row>0){
                return true;
            }
            statement.close();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(QueryGaji.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Gaji> getAllGaji() {
        List<Gaji> listGaji = new ArrayList<>();
        String sql = "Select * from gaji";
        try {
            if (SQLConnection.getConnection()==null){
                return null;
                
            } else {
                PreparedStatement statement = conn.prepareStatement(sql);
                
                ResultSet rs = statement.executeQuery();
                while(rs.next()){
                    Gaji g = new Gaji(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getDouble(3),
                    rs.getDouble(4),
                    rs.getDouble(5),
                    rs.getDouble(6),
                    rs.getDouble(7),
                    rs.getDouble(8),
                    rs.getDouble(9),
                    rs.getDouble(10),
                    rs.getDouble(11),
                    rs.getDouble(12)        
                    );
                    listGaji.add(g);
                }
                statement.close();
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(QueryGaji.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listGaji;
    }

    @Override
    public List<Gaji> getgajibyid(int id_urutan) {
       List<Gaji> listGaji = new ArrayList<>();
        String sql = "Select * from gaji where id_urutan="+id_urutan+"";
        try {
            if (SQLConnection.getConnection()==null){
                return null;
                
            } else {
                PreparedStatement statement = conn.prepareStatement(sql);
                
                ResultSet rs = statement.executeQuery();
                while(rs.next()){
                    Gaji g = new Gaji(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getDouble(3),
                    rs.getDouble(4),
                    rs.getDouble(5),
                    rs.getDouble(6),
                    rs.getDouble(7),
                    rs.getDouble(8),
                    rs.getDouble(9),
                    rs.getDouble(10),
                    rs.getDouble(11),
                    rs.getDouble(12)        
                    );
                    listGaji.add(g);
                }
                statement.close();
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(QueryGaji.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listGaji;
    }

    
    
}
