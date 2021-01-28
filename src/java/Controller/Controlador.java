/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Logica.Alcancia;
import ModeloDAO.AlcanciaDAO;
import config.Conexion;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author escob
 */
@Controller
public class Controlador {

    Conexion con = new Conexion();
    JdbcTemplate jdbctemplate = new JdbcTemplate(con.Conectar());
    ModelAndView mav = new ModelAndView();
    int id;
    List datos;
    AlcanciaDAO alcancia = new AlcanciaDAO();
    /*@RequestMapping(value= "index.htm", method = RequestMethod.GET)
    public ModelAndView Listar(){
         String sql = "select * from alcancia"; 
         datos = this.jdbctemplate.queryForList(sql);
         mav.addObject("lista",datos);
         mav.setViewName("agregar");
        return mav;
        
    }*/
    @RequestMapping(value = "index.htm", method = RequestMethod.GET)
    public ModelAndView Agregar() {
        mav.addObject(new Alcancia());
        mav.setViewName("index");
        return mav;

    }

    @RequestMapping(value = "index.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(Alcancia a) {
        this.alcancia.agregar(a);
        return new ModelAndView("redirect:/index.htm");

    }

    @RequestMapping(value = "estadisticas.htm", method = RequestMethod.GET)
    public ModelAndView Estadistica(HttpServletRequest request) {
        id = Integer.parseInt(request.getParameter("id"));
        datos = this.alcancia.acumulado(id);
        mav.addObject("lista",datos);
        mav.setViewName("estadisticas");
        return mav;

    }

    @RequestMapping(value = "acumulado.htm", method = RequestMethod.GET)
    public ModelAndView acumulado(HttpServletRequest request) {
        id = Integer.parseInt(request.getParameter("id"));
        datos = this.alcancia.total(id);
        mav.addObject("lista", datos);
        mav.setViewName("acumulado");
        return mav;

    }
        @RequestMapping(value = "ahorrado.htm", method = RequestMethod.GET)
        public ModelAndView ahorrado(HttpServletRequest request) {
        //id = Integer.parseInt(request.getParameter("id"));
        datos = this.alcancia.ahorro();
        mav.addObject("lista", datos);
        mav.setViewName("ahorrado");
        return mav;

    }

}
