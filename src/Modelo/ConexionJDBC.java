/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Matias
 */
public class ConexionJDBC {
    private Connection conexion;

     
    public ConexionJDBC() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection("jdbc:mysql://localhost/gestionlibreria","root","adeeme");//172.16.143.15
        } catch (Exception e) {
        }
                
    }

    public Connection getConexion() {
        
        return this.conexion;
    }
     public void cerrarConexion(){
         try {
             this.conexion.close();
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }

     }
    
    
}
