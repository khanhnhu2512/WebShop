/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.NhanVien;
import java.io.IOException;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
 
@WebServlet(urlPatterns = { "/Logout" })
public class Logout extends HttpServlet {
    private static final long serialVersionUID = 1L;
    NhanVien nv;
 
    public Logout() {
        super();
    }
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        NhanVien nv = new NhanVien();
        nv = (NhanVien) session.getAttribute("account");;
 
        // Nếu đăng nhập (login).
        if (nv != null) {
            session.removeAttribute("account");
            response.sendRedirect(request.getContextPath() + "/Login");
            return;
        }
        response.sendRedirect(request.getContextPath() + "Login");
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
 
}

