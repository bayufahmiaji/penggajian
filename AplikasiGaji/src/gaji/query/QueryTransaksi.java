/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji.query;

import gaji.connection.SQLConnection;
import gaji.model.inteface.InterfaceTransaksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import model.Transaksi;

/**
 *
 * @author AdittyaS
 */
public class QueryTransaksi implements InterfaceTransaksi {
    private Connection conn = SQLConnection.getConnection();
    
    @Override
    public boolean insert(Transaksi data) {
        String sql = "Insert Into transaksi values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, data.getId_urutan());
            statement.setDouble(2, data.getIzin());
            statement.setDouble(3, data.getAlfa());
            statement.setDouble(4, data.getTerlambat());
            statement.setDouble(5, data.getKesehatan());
            statement.setDouble(6, data.getKetenagakerjaan());
            statement.setDouble(7, data.getPph());
            statement.setDouble(8, data.getLain());
            int row = statement.executeUpdate();
            if(row > 0){
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(QueryTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return false;}

    @Override
    public boolean update(Transaksi data) {
        String sql = "Update transaksi Set izin=?, alfa=?, terlambat=?, kesehatan=?, ketenagakerjaan=?, pph=?, lain=? where id_urutan=?";
        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setDouble(1, data.getIzin());
            statement.setDouble(2, data.getAlfa());
            statement.setDouble(3, data.getTerlambat());
            statement.setDouble(4, data.getKesehatan());
            statement.setDouble(5, data.getKetenagakerjaan());
            statement.setDouble(6, data.getPph());
            statement.setDouble(7, data.getLain());
            statement.setInt(8, data.getId_urutan());
            int row = statement.executeUpdate();
            if(row > 0){
                return true;
            }
            statement.close();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(QueryTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;}

    @Override
    public boolean delete(int id_urutan) {
        String sql = "delete from transaksi where id_urutan=?";
        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, id_urutan);
            int row = statement.executeUpdate();
            if(row>0){
                return true;
            }
            statement.close();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(QueryTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;}

    @Override
    public List<Transaksi> getAllTransaksi() {
        List<Transaksi> listTransaksi = new ArrayList<>();
        String sql = "Select * from transaksi";
        try {
            if (SQLConnection.getConnection()==null){
                return null;
                
            } else {
                PreparedStatement statement = conn.prepareStatement(sql);
                
                ResultSet rs = statement.executeQuery();
                while(rs.next()){
                    Transaksi g = new Transaksi(
                    rs.getInt(1),
                    rs.getDouble(2),
                    rs.getDouble(3),
                    rs.getDouble(4),
                    rs.getDouble(5),
                    rs.getDouble(6),
                    rs.getDouble(7),
                    rs.getDouble(8)
                    );
                    listTransaksi.add(g);
                }
                statement.close();
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(QueryTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listTransaksi;
    }

    @Override
    public List<Transaksi> getTransaksiByID(int id_urutan) {
       List<Transaksi> listTransaksi = new ArrayList<>();
        String sql = "Select * from transaksi where id_urutan="+id_urutan+"";
        try{
            if(SQLConnection.getConnection()==null){
                return null;
            } else {
                PreparedStatement statement = conn.prepareStatement(sql);
                
                
                ResultSet rs = statement.executeQuery();
                while(rs.next()){
                    Transaksi t = new Transaksi(rs.getInt(1),
                    rs.getDouble(2),
                    rs.getDouble(3),
                    rs.getDouble(4),
                    rs.getDouble(5),
                    rs.getDouble(6),
                    rs.getDouble(7),
                    rs.getDouble(8));
                    
                    listTransaksi.add(t);
                } statement.close();
            }
            } catch (SQLException e) {
            java.util.logging.Logger.getLogger(QueryTransaksi.class.getName()).log(Level.SEVERE, null, e);
        }
            return listTransaksi;
    }
    
}
