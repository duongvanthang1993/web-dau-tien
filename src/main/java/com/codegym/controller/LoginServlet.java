package com.codegym.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * LoginServlet – xử lý yêu cầu đăng nhập từ form index.jsp.
 *
 * <p>Endpoint : POST /login
 * <p>Điều kiện: username == "admin" && password == "admin"
 *   → In ra: "Welcome admin to website"
 *   → Ngược lại: "Login Error"
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "admin";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Đặt encoding để hỗ trợ tiếng Việt
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();

        if (VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password)) {
            out.println("<!DOCTYPE html>");
            out.println("<html lang='vi'><head><meta charset='UTF-8'><title>Thành công</title>");
            out.println("<style>");
            out.println("body{font-family:'Segoe UI',sans-serif;background:#f0fdf4;display:flex;");
            out.println("align-items:center;justify-content:center;min-height:100vh;margin:0;}");
            out.println(".card{background:#fff;border-radius:12px;box-shadow:0 8px 24px rgba(0,0,0,.12);");
            out.println("padding:40px 48px;text-align:center;}");
            out.println("h1{color:#16a34a;font-size:2rem;margin-bottom:12px;}");
            out.println("p{color:#555;font-size:1rem;} a{color:#667eea;text-decoration:none;font-weight:600;}");
            out.println("</style></head><body>");
            out.println("<div class='card'>");
            out.println("<h1>✅ Welcome admin to website</h1>");
            out.println("<p><a href='" + request.getContextPath() + "/'>← Quay lại trang đăng nhập</a></p>");
            out.println("</div></body></html>");
        } else {
            out.println("<!DOCTYPE html>");
            out.println("<html lang='vi'><head><meta charset='UTF-8'><title>Thất bại</title>");
            out.println("<style>");
            out.println("body{font-family:'Segoe UI',sans-serif;background:#fef2f2;display:flex;");
            out.println("align-items:center;justify-content:center;min-height:100vh;margin:0;}");
            out.println(".card{background:#fff;border-radius:12px;box-shadow:0 8px 24px rgba(0,0,0,.12);");
            out.println("padding:40px 48px;text-align:center;}");
            out.println("h1{color:#dc2626;font-size:2rem;margin-bottom:12px;}");
            out.println("p{color:#555;font-size:1rem;} a{color:#667eea;text-decoration:none;font-weight:600;}");
            out.println("</style></head><body>");
            out.println("<div class='card'>");
            out.println("<h1>❌ Login Error</h1>");
            out.println("<p>Tên đăng nhập hoặc mật khẩu không đúng.</p><br>");
            out.println("<p><a href='" + request.getContextPath() + "/'>← Thử lại</a></p>");
            out.println("</div></body></html>");
        }
    }

    /**
     * Chuyển hướng GET /login về trang chủ để tránh truy cập trực tiếp.
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "/");
    }
}

