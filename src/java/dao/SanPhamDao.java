/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.ConnectionDB;
import entity.SanPham;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 *
 */
public class SanPhamDao implements Dao<SanPham>{
    private static final String TABLE_NAME = "dbo.SanPham";
    ConnectionDB connectiondb = ConnectionDB.getInstance();
    
    @Override
    public List<SanPham> getAll() {
        Connection conn;
        List<SanPham> list = new ArrayList<SanPham>();
        try {
            conn = ConnectionDB.getInstance().getConnection();
            Statement stmt = conn.createStatement();
            String sql_select = "select * from "+TABLE_NAME;
            ResultSet rs = stmt.executeQuery(sql_select);
            while(rs.next()){
                SanPham pro = new SanPham();
                pro.setMaSP(rs.getString("MaSP"));
                pro.setTenSP(rs.getString("TenSP"));
                pro.setMaLoai(rs.getString("MaLoai"));
                pro.setAnh(rs.getString("Anh"));
                pro.setNhanHieu(rs.getString("NhanHieu"));
                pro.setGiaSP(rs.getFloat("GiaSP"));
                list.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public static void main(String[] args) {
        SanPhamDao spd = new SanPhamDao();
        SanPham pro = new SanPham();
        List<SanPham> listPro = spd.getAll();
        for(SanPham products : listPro){
            System.out.println(products.getTenSP());
        }
    }

    

    @Override
    public Optional<SanPham> get(String t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(SanPham t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(SanPham t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(SanPham t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}