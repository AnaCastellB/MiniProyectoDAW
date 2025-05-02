package com.daw.miniproyecto.servlet;

import com.daw.miniproyecto.dao.MariposaDAO;
import com.daw.miniproyecto.model.Mariposa;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/mariposas")
public class MariposaListServlet extends HttpServlet {
    private MariposaDAO dao = new MariposaDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        try {
            List<Mariposa> lista = dao.findAll();
            req.setAttribute("mariposas", lista);
            req.getRequestDispatcher("/jsp/mariposaList.jsp")
                    .forward(req, resp);
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }
}
