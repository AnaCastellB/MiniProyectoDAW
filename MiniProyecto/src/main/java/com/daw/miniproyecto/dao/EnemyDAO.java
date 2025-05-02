package com.daw.miniproyecto.dao;

import com.daw.miniproyecto.model.Enemy;
import com.daw.miniproyecto.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EnemyDAO {
    private static final String SELECT_ALL =
            "SELECT id_enemies, health, move_speed, is_dead, enemy_type FROM enemies";

    public List<Enemy> findAll() throws SQLException {
        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(SELECT_ALL)) {

            List<Enemy> list = new ArrayList<>();
            while (rs.next()) {
                Enemy e = new Enemy();
                e.setId(rs.getInt("id_enemies"));
                e.setHealth(rs.getInt("health"));
                e.setMoveSpeed(rs.getFloat("move_speed"));
                e.setDead(rs.getBoolean("is_dead"));
                e.setEnemyType(rs.getString("enemy_type"));
                list.add(e);
            }
            return list;
        }
    }
}
