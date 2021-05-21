/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.ConnectionDB;
import entity.NhanVien;
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
public class NhanVienDao implements Dao<NhanVien>{
    private static final String TABLE_NAME = "dbo.NhanVien";
    ConnectionDB connectiondb = ConnectionDB.getInstance();
    public NhanVien checkLogin(String Taikhoan, String Matkhau) {
        Connection conn = null;
        NhanVien nhanvien = new NhanVien();
        PreparedStatement psmt = null;
        try {
            conn = ConnectionDB.getInstance().getConnection();
            String sql_select = "select * from "+TABLE_NAME+ " where Taikhoan = ? and Matkhau = ?";            
            psmt = conn.prepareStatement(sql_select);    
            psmt.setString(1, Taikhoan);
            psmt.setString(2, Matkhau);
            ResultSet rs = psmt.executeQuery();
            if (rs.next()) {
                nhanvien.setMaNV(rs.getString("MaNV"));
                nhanvien.setTenNV(rs.getString("TenNV"));
                nhanvien.setSDTNV(rs.getString("SDTNV"));
                nhanvien.setEmail(rs.getString("Email"));
                nhanvien.setDiaChiNV(rs.getString("DiaChiNV"));
                nhanvien.setTaikhoan(rs.getString("Taikhoan"));
                nhanvien.setMatkhau(rs.getString("Matkhau"));
                nhanvien.setQuyen(rs.getInt("Quyen"));
                return nhanvien;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean checkTaikhoan(String Taikhoan) {
        Connection conn = null;
        PreparedStatement psmt = null;
        try {
            conn = ConnectionDB.getInstance().getConnection();
            String sql_select = "select * from dbo.DangNhap where Taikhoan = ?";            
            psmt = conn.prepareStatement(sql_select);    
            psmt.setString(1, Taikhoan);
            ResultSet rs = psmt.executeQuery();
            if (rs.next()) {
                if(rs.getString("Taikhoan").equals(Taikhoan)){
                    return false;
                }
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    @Override
    public boolean insert(NhanVien nv) {
        Connection conn = null;
        PreparedStatement psmt = null;  
        boolean retVal = false;
        try {
            conn = ConnectionDB.getInstance().getConnection();
            String sql_insert = "insert into dbo.DangNhap values (?, ?)";
            String sql_insert2 = "insert into "+TABLE_NAME+"(MaNV, TenNV, SDTNV,Taikhoan, Email, Matkhau, Quyen) values(?, ?, ?, ?, ?, ?, ?)";
            psmt = conn.prepareStatement(sql_insert);
            psmt.setString(1, nv.getTaikhoan());
            psmt.setString(2, nv.getMatkhau());
            int r = psmt.executeUpdate();
            System.out.println(r);
            
            psmt = conn.prepareStatement(sql_insert2);
            psmt.setString(1, nv.getMaNV());
            psmt.setString(2, nv.getTenNV());
            psmt.setString(3, nv.getSDTNV());
            psmt.setString(4, nv.getTaikhoan());
            psmt.setString(5, nv.getEmail());
            psmt.setString(6, nv.getMatkhau());
            psmt.setInt(7, 1);
            
            int p = psmt.executeUpdate();
            System.out.println(p);
            retVal = true;            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retVal;
    }

    public static void main(String[] args) {
//        NhanVienDao nvd = new NhanVienDao();
//        NhanVien nv = new NhanVien();
//        nv.setMaNV("NV06");
//        nv.setSDTNV("1235");
//        nv.setEmail("bbb");
//        nv.setTaikhoan("test3");
//        nv.setMatkhau("1");
//        nv.setTenNV("Test 3");
//        nv.setQuyen(1);
//        System.out.println(nvd.checkTaikhoan("user"));
    }

    @Override
    public List<NhanVien> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<NhanVien> get(String MaSV) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(NhanVien t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(NhanVien t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}