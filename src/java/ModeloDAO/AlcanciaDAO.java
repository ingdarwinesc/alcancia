/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Logica.Alcancia;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author escob
 */
public class AlcanciaDAO {
    
    
    Alcancia a = new Alcancia();
    Conexion cn = new Conexion ();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    List dato = null;
    
    public List listar (){
        
        List datos = null;
        
        return datos;
    }
    
    
    public boolean agregar(Alcancia a){
        
        String sql = "INSERT INTO `alcancia` (`denominacion`, `cantidad`) VALUES ("+a.getDenominacion()+", "+a.getCantidad()+");";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
        
    }
    
    public List acumulado(int id){
        ArrayList<String>cu=new ArrayList<>();
        String sql = "SELECT SUM(`cantidad`) FROM `alcancia` WHERE denominacion = " + id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                cu.add(String.valueOf(rs.getString(1)));
                cu.add(String.valueOf(id));
            }
        } catch (Exception e) {
        }
        return cu;
    }
    
    public List total (int id){
        ArrayList<String>cu=new ArrayList<>();
        String sql = "SELECT SUM(`cantidad`*`denominacion`) FROM `alcancia` WHERE denominacion = " + id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                cu.add(String.valueOf(rs.getString(1)));
                cu.add(String.valueOf(id));
            }
        } catch (Exception e) {
        }
        return cu;
    }
    
    public List ahorro (){
        ArrayList<String>cu=new ArrayList<>();
        String sql = "SELECT SUM(`cantidad`*`denominacion`) FROM `alcancia` WHERE denominacion";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                cu.add(String.valueOf(rs.getString(1)));
                //cu.add(String.valueOf(id));
            }
        } catch (Exception e) {
        }
        return cu;
    }
    
}
