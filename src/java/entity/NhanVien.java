/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 */
public class NhanVien {
    private String MaNV;
    private String TenNV;
    private String SDTNV;
    private String DiaChiNV;
    private String Email;
    private String Taikhoan;
    private String Matkhau;
    private int Quyen;
    

    public NhanVien() {
    }

    public NhanVien(String MaNV, String TenNV, String SDTNV, String DiaChiNV, String Email, String Taikhoan, String Matkhau, int Quyen) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.SDTNV = SDTNV;
        this.DiaChiNV = DiaChiNV;
        this.Email = Email;
        this.Taikhoan = Taikhoan;
        this.Matkhau = Matkhau;
        this.Quyen = Quyen;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }
    
    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }
    
    public String getSDTNV() {
        return SDTNV;
    }

    public void setSDTNV(String SDTNV) {
        this.SDTNV = SDTNV;
    }
    
    public String getDiaChiNV() {
        return DiaChiNV;
    }

    public void setDiaChiNV(String DiaChiNV) {
        this.DiaChiNV = DiaChiNV;
    }
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public String getTaikhoan() {
        return Taikhoan;
    }

    public void setTaikhoan(String Taikhoan) {
        this.Taikhoan = Taikhoan;
    }
    
    public String getMatkhau() {
        return Matkhau;
    }

    public void setMatkhau(String Matkhau) {
        this.Matkhau = Matkhau;
    }
    
    public int getQuyen() {
        return Quyen;
    }

    public void setQuyen(int Quyen) {
        this.Quyen = Quyen;
    }
    

    
}
