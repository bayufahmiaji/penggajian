/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji.query;

import gaji.connection.SQLConnection;
import gaji.model.inteface.InterfaceKaryawan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import model.Karyawan;

/**
 *
 * @author AdittyaS
 */
public class QueryKaryawan implements InterfaceKaryawan {

    private Connection conn = SQLConnection.getConnection();
    
    @Override
    public boolean insert(Karyawan data) {
        String sql = "Insert Into karyawan values (?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, data.getId_urutan());
            statement.setString(2, data.getNama_karyawan());
            int row = statement.executeUpdate();
            if(row > 0){
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(QueryKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return false;
    }

    @Override
    public boolean update(Karyawan data) {
        String sql = "Update karyawan Set nama_karyawan=? where id_urutan=?";
        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, data.getNama_karyawan());
            statement.setInt(2, data.getId_urutan());
            int row = statement.executeUpdate();
            if(row > 0){
                return true;
            }
            statement.close();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(QueryKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(int id_urutan) {
        String sql = "delete from karyawan where id_urutan=?";
        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, id_urutan);
            int row = statement.executeUpdate();
            if(row>0){
                return true;
            }
            statement.close();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(QueryKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public int generateID() {
        int id_urutan = 0;
        String sql = "EXEC genID";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                id_urutan = rs.getInt(1);
            } 
            statement.close();
        } catch (SQLException e){
            java.util.logging.Logger.getLogger(QueryKaryawan.class.getName()).log(Level.SEVERE, null, e);
        }
        return id_urutan;}

    @Override
    public List<Karyawan> getAllKaryawan() {
        List<Karyawan> listKaryawan = new ArrayList<>();
        String sql = "Select * from karyawan";
        try {
            if (SQLConnection.getConnection()==null){
                return null;
                
            } else {
                PreparedStatement statement = conn.prepareStatement(sql);
                
                ResultSet rs = statement.executeQuery();
                while(rs.next()){
                    Karyawan g = new Karyawan(
                    rs.getInt(1),
                    rs.getString(2)
                    );
                    listKaryawan.add(g);
                }
                statement.close();
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(QueryKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listKaryawan;
    }

    @Override
    public Karyawan getOneKaryawanByID(int id_urutan) {
        Karyawan output = null;
        String sql = "Select * from karyawan where id_urutan=?";
        try{
            if(SQLConnection.getConnection()==null){
                return null;
            } else {
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setInt(1, id_urutan);
                
                ResultSet rs = statement.executeQuery();
                while(rs.next()){
                    output = new Karyawan(rs.getInt(1),rs.getString(2));
                } statement.close();
            }
            } catch (SQLException e) {
            java.util.logging.Logger.getLogger(QueryKaryawan.class.getName()).log(Level.SEVERE, null, e);
        }
            return output;
    }

    @Override
    public List<Karyawan> getAllKaryawanByName(String nama_karyawan) {
        List<Karyawan> listKaryawan = new ArrayList<>();
        String sql = "Select * from karyawan where nama_karyawan like %?%";
        try {
            if (SQLConnection.getConnection()==null){
                return null;
                
            } else {
                PreparedStatement statement = conn.prepareStatement(sql);
                
                ResultSet rs = statement.executeQuery();
                while(rs.next()){
                    Karyawan g = new Karyawan(
                    rs.getInt(1),
                    rs.getString(2)
                    );
                    listKaryawan.add(g);
                }
                statement.close();
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(QueryKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listKaryawan;}
    
    public List<Karyawan> getNamaKaryawan(String nama_karyawan){
        List<Karyawan> listKaryawan = new ArrayList<>();
        String sql = "Select nama_karyawan from karyawan";
        try {
            if (SQLConnection.getConnection()==null){
                return null;
                
            } else {
                PreparedStatement statement = conn.prepareStatement(sql);
                
                ResultSet rs = statement.executeQuery();
                while(rs.next()){
                    Karyawan g = new Karyawan(
                    rs.getInt(1),
                    rs.getString(2)
                    );
                    listKaryawan.add(g);
                }
                statement.close();
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(QueryKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listKaryawan;
    }
    
}
