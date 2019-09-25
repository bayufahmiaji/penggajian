/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji.query;

import gaji.connection.SQLConnection;
import gaji.model.inteface.InterfacePotongan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import model.Potongan;

/**
 *
 * @author User
 */
public class QueryPotongan implements InterfacePotongan{
    private Connection conn = SQLConnection.getConnection();
    
    @Override
    public boolean insert(Potongan data) {
       String sql = "Insert Into potongan values (?,?,?,?,?,?,?,?)";
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
            java.util.logging.Logger.getLogger(QueryPotongan.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return false;}

    @Override
    public boolean update(Potongan data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id_urutan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Potongan> getAllTransaksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Potongan> getTransaksiByID(int id_urutan) {
        List<Potongan> listPotongan = new ArrayList<>();
        String sql = "Select * from potongan where id_urutan="+id_urutan+"";
        try{
            if(SQLConnection.getConnection()==null){
                return null;
            } else {
                PreparedStatement statement = conn.prepareStatement(sql);
                
                
                ResultSet rs = statement.executeQuery();
                while(rs.next()){
                    Potongan t = new Potongan(rs.getInt(1),
                    rs.getDouble(2),
                    rs.getDouble(3),
                    rs.getDouble(4),
                    rs.getDouble(5),
                    rs.getDouble(6),
                    rs.getDouble(7),
                    rs.getDouble(8));
                    
                    listPotongan.add(t);
                } statement.close();
            }
            } catch (SQLException e) {
            java.util.logging.Logger.getLogger(QueryTransaksi.class.getName()).log(Level.SEVERE, null, e);
        }
            return listPotongan;
    }
    
}
