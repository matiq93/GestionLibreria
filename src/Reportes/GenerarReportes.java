/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import org.jfree.chart.*;
import org.jfree.util.PublicCloneable;
import Controlador.DAO.GrupoEditorialDAOImpl;
import Controlador.DAO.LibreriaDAOImpl;
import Modelo.Conexion;
import Modelo.ConexionJDBC;
import Modelo.GrupoEditorial;
import Modelo.Libreria;
import Modelo.Remito;
import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.commons.collections.ReferenceMap;

/**
 *
 * @author Matias
 */
public class GenerarReportes {
    
    
    public GenerarReportes() {
        
    }
     
    
    public void imprimirRemito(Remito remito){
        
        File archivo = new File("C:\\Users\\Matias\\Documents\\NetBeansProjects\\GestionLibreria\\src\\Reportes\\RemitoProveedor.jasper");
        JasperReport doc=null;
        
        try {
             doc= (JasperReport)JRLoader.loadObject(archivo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if  (doc != null){
            Map parametros = new HashMap();
            Libreria libreria = null;
            GrupoEditorial grupo = null; 
            try {
               libreria = (Libreria)new LibreriaDAOImpl().cargarPorId(Controlador.GestionLibreria.idUsuario);
               grupo = (GrupoEditorial) new GrupoEditorialDAOImpl().cargarPorId(remito.getGrupo().getId());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }            
            //if (libreria !=null && grupo!= null) {
            try {
                parametros.put("idRemito", remito.getId());
                parametros.put("direccionLibreria", libreria.getDireccion());
                parametros.put("cuitLibreria", libreria.getCuit());
                parametros.put("nombreLibreria", libreria.getNombre());
                parametros.put("nombreGrupo", grupo.getNombre());
                parametros.put("fecha", remito.getFecha());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
                ConexionJDBC c  = new ConexionJDBC();
            try {
                JasperPrint j = JasperFillManager.fillReport(doc, parametros, c.getConexion());
                JasperViewer jv = new JasperViewer(j, false);
                jv.setTitle("Reporte");
                jv.setVisible(true);
            } catch (JRException e) {
                System.out.println(e.getMessage());       
            }finally{
                c.cerrarConexion();
            }
        }
    }
    public void reporteLibros(){
         File archivo=null;
         JasperReport doc=null;
        try {
            archivo= new File("C:\\Users\\Matias\\Documents\\NetBeansProjects\\GestionLibreria\\src\\Reportes\\ReporteLibros.jasper");
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
             doc= (JasperReport)JRLoader.loadObject(archivo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         ConexionJDBC c  = new ConexionJDBC();
            try {
                JasperPrint j = JasperFillManager.fillReport(doc, null, c.getConexion());
                JasperViewer jv = new JasperViewer(j, false);
                jv.setTitle("Reporte");
                jv.setVisible(true);
            } catch (JRException e) {
                System.out.println(e.getMessage());       
            }finally{
                c.cerrarConexion();
            }
    }
    
}
