package com.daw.miniproyecto.dao;

import com.daw.miniproyecto.model.Mariposa;
import com.daw.miniproyecto.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MariposaDAO {
    private static final String SELECT_ALL =
            "SELECT m.id, m.top_offset, m.bottom_offset, m.pause_time " +
                    "FROM mariposa m";

    public List<Mariposa> findAll() throws SQLException {
        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(SELECT_ALL)) {

            List<Mariposa> list = new ArrayList<>();
            while (rs.next()) {
                Mariposa m = new Mariposa();
                m.setId(rs.getInt("id"));
                m.setTopOffset(rs.getFloat("top_offset"));
                m.setBottomOffset(rs.getFloat("bottom_offset"));
                m.setPauseTime(rs.getFloat("pause_time"));
                list.add(m);
            }
            return list;
        }
    }
}
