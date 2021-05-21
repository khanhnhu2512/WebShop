/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import model.ConnectionDB;
import dao.NhanVienDao;
import entity.NhanVien;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HELLO
 */
@WebServlet(urlPatterns = { "/Register" })
public class Register extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/views/Register.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String manv = request.getParameter("manv");
        String tennv = request.getParameter("tennv");
        String sdtnv = request.getParameter("sdtnv");
        String email = request.getParameter("email");
        String taikhoan = request.getParameter("taikhoan");
        String matkhau = request.getParameter("matkhau");
        NhanVienDao nvd;
        
        NhanVien nhanvien = new NhanVien();
        String errorString = null;
        
        if (manv == null || tennv == null || sdtnv == null || email == null || taikhoan == null || matkhau == null || manv.length() == 0 || tennv.length() == 0 || email.length() == 0 || sdtnv.length() == 0 || taikhoan.length() == 0 || matkhau.length() == 0) {
            errorString = "Cac truong khong duuoc de trong";
        } else {
            try {
                nvd = new NhanVienDao();
                if(nvd.checkTaikhoan(taikhoan)==false){
                    nhanvien = new NhanVien();
                    nhanvien.setMaNV(manv);
                    nhanvien.setEmail(email);
                    nhanvien.setSDTNV(sdtnv);
                    nhanvien.setTaikhoan(taikhoan);
                    nhanvien.setMatkhau(matkhau);
                    nhanvien.setTenNV(tennv);
                    if (nvd.insert(nhanvien)==false) {
                        errorString = "Da xay ra loi";
                    } 
                }else{
                    errorString = "Tai khoan da ton tai";
                }
            } catch (Exception e) {
                e.printStackTrace();
                errorString = e.getMessage();
            }
        }
        
        if(errorString == null){
            errorString = "Dang ky thanh cong, vui long dang nhap lai";
            request.setAttribute("errorString", errorString);
            RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/views/Login.jsp");
            dispatcher.forward(request, response);
        }else{
            request.setAttribute("errorString", errorString);
            RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/views/Register.jsp");
            dispatcher.forward(request, response); 
        }
           
    }
    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
