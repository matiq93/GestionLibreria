/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Matias
 */
public class Conexion {
     private static SessionFactory Conexion;
     
     private Conexion(){
         Configuration cfg = new Configuration();
         Conexion = cfg.configure().buildSessionFactory();
     }
     
     public static Session getSession(){
        try {
            if (Conexion ==null) {
                new Conexion();
                return Conexion.openSession();
            }else{
                return Conexion.openSession();
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
