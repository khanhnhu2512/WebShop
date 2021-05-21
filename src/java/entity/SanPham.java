/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author HELLO
 */
public class SanPham {
    private String MaSP;
    private String MaLoai;
    private String TenSP;
    private String NhanHieu;
    private String Anh;
    private float GiaSP;
    
    public SanPham(){
        
    } 
    public SanPham(String MaSP, String MaLoai, String TenSP, String NhanHieu, String Anh, float GiaSP){
        this.MaSP = MaSP;
        this.MaLoai = MaLoai;
        this.TenSP = TenSP;
        this.NhanHieu = NhanHieu;
        this.Anh = Anh;
        this.GiaSP = GiaSP;
    }
    public String getMaSP(){
        return MaSP;
    }
    public void setMaSP(String MaSP){
        this.MaSP = MaSP;
    }
    
    public String getMaLoai(){
        return MaLoai;
    }
    public void setMaLoai(String MaLoai){
        this.MaLoai = MaLoai;
    }
    
    public String getTenSP(){
        return TenSP;
    }
    public void setTenSP(String TenSP){
        this.TenSP = TenSP;
    }
    
    public String getNhanHieu(){
        return NhanHieu;
    }
    public void setNhanHieu(String NhanHieu){
        this.NhanHieu = NhanHieu;
    }
    
    public String getAnh(){
        return Anh;
    }
    public void setAnh(String Anh){
        this.Anh = Anh;
    }
    
    public float getGiaSP(){
        return GiaSP;
    }
    public void setGiaSP(float GiaSP){
        this.GiaSP = GiaSP;
    }
}
