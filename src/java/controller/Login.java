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
@WebServlet(urlPatterns = { "/Login" })
public class Login extends HttpServlet {

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
         HttpSession session = request.getSession();
        NhanVien nv = new NhanVien();
        nv = (NhanVien) session.getAttribute("account");;
 
        // Nếu chưa đăng nhập (login).
        if (nv == null) {
            RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/views/Login.jsp");
            dispatcher.forward(request, response);
            return;
        }
        // Lưu thông tin vào request attribute trước khi forward (chuyển tiếp).
        request.setAttribute("account", nv);
        if(nv.getQuyen()==1){
            response.sendRedirect(request.getContextPath() + "/Products");
        }else if(nv.getQuyen()==0){
            response.sendRedirect(request.getContextPath() + "/Admin");
        }
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
        String taikhoan = request.getParameter("taikhoan");
        String matkhau = request.getParameter("matkhau");
        NhanVienDao nvd;
        
        NhanVien nhanvien = new NhanVien();
        boolean hasError = false;
        String errorString = null;
        
        if (taikhoan == null || matkhau == null || taikhoan.length() == 0 || matkhau.length() == 0) {
            hasError = true;
            errorString = "Required username and password!";
        } else {
            try {
                nvd = new NhanVienDao();
                nhanvien = new NhanVien();
                nhanvien = nvd.checkLogin(taikhoan, matkhau);
                if (nhanvien == null) {
                    hasError = true;
                    errorString = "User Name or password invalid";
                }
            } catch (Exception e) {
                e.printStackTrace();
                hasError = true;
                errorString = e.getMessage();
            }
        }
        // Trong trường hợp có lỗi,
        if (hasError) {
            request.setAttribute("errorString", errorString);
            RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/views/Login.jsp");
            dispatcher.forward(request, response);
        }
        // Trường hợp không có lỗi.
        else {
            HttpSession session = request.getSession();
            session.setAttribute("account", nhanvien);
            request.setAttribute("account", nhanvien);
            
            if(nhanvien.getQuyen()==1){
                response.sendRedirect(request.getContextPath() + "/Products");
            }else if(nhanvien.getQuyen()==0){
                response.sendRedirect(request.getContextPath() + "/Admin");
            }
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
