/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.finlogic.database;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author admin
 */
@Configurable
public class DatabaseConfig {
    @Bean
    public DataSource datasour(){
        MysqlDataSource mysqldata = new MysqlDataSource();
        DataSource datasour = new DataSource();
        mysqldata.setServerName("");
        mysqldata.setDatabaseName("");
        mysqldata.setPort(0);
        mysqldata.setUser("");
        mysqldata.setPassword("");
        
//        datasour.se
        return datasour;
              
    }
    
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource datasource){
        return new JdbcTemplate(datasource);
    }
    
}


