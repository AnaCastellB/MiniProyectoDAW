package com.daw.miniproyecto.servlet;

import com.daw.miniproyecto.dao.EnemyDAO;
import com.daw.miniproyecto.model.Enemy;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/enemies")
public class EnemyListServlet extends HttpServlet {
    private EnemyDAO dao = new EnemyDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        try {
            List<Enemy> lista = dao.findAll();
            req.setAttribute("enemies", lista);
            req.getRequestDispatcher("/jsp/enemyList.jsp")
                    .forward(req, resp);
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }
}

