/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author escob
 */
public class Conexion {
    
    Connection con;
    
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/alcancia","root","");            
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
    }
    public Connection getConnection(){
        return con;
    }
    
    public DriverManagerDataSource Conectar (){
        DriverManagerDataSource datasource = new DriverManagerDataSource ();
        datasource.setDriverClassName("com.mysql.jdbc.Driver");
        datasource.setUrl("jdbc:mysql://localhost:3306/alcancia");
        datasource.setUsername("root");
        datasource.setPassword("");
        return datasource;
        
    }
}

