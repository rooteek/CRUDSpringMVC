/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.finlogic.database;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author admin
 */
public class SqlUtility {
    @Autowired
    JdbcTemplate jdbcTemple;
    public int parsist(String query){
        int rowAffected=jdbcTemple.update(query);
        return rowAffected;
    }
    public List view(String query){
        List veiw = jdbcTemple.queryForList(query);
        return veiw;
    }
}
