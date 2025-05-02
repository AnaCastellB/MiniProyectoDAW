package com.daw.miniproyecto.servlet;

import com.daw.miniproyecto.model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // Suponemos que al hacer login guardas el User en sesión:
        User user = (User) req.getSession().getAttribute("loggedUser");
        if (user == null) {
            // Si no está logueado, vamos al login
            resp.sendRedirect(req.getContextPath() + "/login.jsp");
            return;
        }
        req.setAttribute("user", user);
        req.getRequestDispatcher("/jsp/profile.jsp").forward(req, resp);
    }
}
