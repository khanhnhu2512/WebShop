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
import dao.SanPhamDao;
import entity.NhanVien;
import entity.SanPham;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(urlPatterns = { "/Products" })
public class Products extends HttpServlet {
    SanPhamDao spd;
    SanPham sp;
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
                spd = new SanPhamDao();
                sp = new SanPham();
                List<SanPham> listsp = null;
                try{
                    listsp = spd.getAll();
                }catch(Exception e){
                    e.printStackTrace();
                }

                request.setAttribute("products", listsp);
                RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/views/Products.jsp");
                dispatcher.forward(request, response);
                
            }else if(nv.getQuyen()==0){
                RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/views/Admin.jsp");
                dispatcher.forward(request, response);
            }
        
        
            
//            if(listsp == null){
//                response.sendRedirect(request.getContextPath() + "/Productsa");
//            }
            
            
    }
//    public static void main(String[] args) {
//        SanPhamDao spd1 = new SanPhamDao();
//        SanPham sp1 = new SanPham();
//        List<SanPham> listPro = spd1.getAll();
//        for(SanPham products : listPro){
//            System.out.println(products.getTenSP());
//        }
//    }
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
