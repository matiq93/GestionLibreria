/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Vista.Login;
import org.hibernate.Session;

/**
 *
 * @author Matias
 */
public class GestionLibreria {

    
        public static int idUsuario=0;
    public static void main(String[] args) {
        
        
        new Login().setVisible(true);
    }
    
}
