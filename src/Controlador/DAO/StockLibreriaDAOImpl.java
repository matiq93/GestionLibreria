/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.DAO;

import Modelo.Conexion;
import Modelo.DetalleRemito;
import Modelo.Libreria;
import Modelo.Libro;
import Modelo.StockXLibreria;
import Modelo.dbDAO;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Matias
 */
public class StockLibreriaDAOImpl implements dbDAO{

    @Override
    public ArrayList listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregar(Object nuevo) {
        DetalleRemito detalle = (DetalleRemito)nuevo;
        StockXLibreria stock = ifexist(detalle.getLibro());
        boolean flag= false;
        try{            
            if (stock == null) {
                StockXLibreria nuevoStock = new StockXLibreria(detalle.getCantidad(), detalle.getLibro(), (Libreria) new LibreriaDAOImpl().cargarPorId(Controlador.GestionLibreria.idUsuario));
                agregarStock(nuevoStock);
            } else {
                stock.setStock(stock.getStock() + detalle.getCantidad());
                actualizarStock(stock);
            }
            flag=true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        } finally {
            return flag;
        }
    }

    @Override
    public Object leer(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object cargarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList listarFiltradoXNombre(String filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private StockXLibreria ifexist(Libro libro) {
        StockXLibreria stock=null;
        Session s =Conexion.getSession();
        try {
            Query q = s.getNamedQuery("Existe?");
            q.setParameter("idLibreria", Controlador.GestionLibreria.idUsuario);
            q.setParameter("idLibro", libro.getId());
            stock = (StockXLibreria) q.uniqueResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            s.close();
            return stock;
        }
    }

    private void agregarStock(StockXLibreria nuevoStock) {
        Session s = Conexion.getSession();
        try {
            s.beginTransaction();
            s.save(nuevoStock);
            s.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            s.close();
        }
        
       
    }

    private void actualizarStock(StockXLibreria stock) {
         Session s = Conexion.getSession();
        try {
            s.beginTransaction();
            s.update(stock);
            s.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            s.close();
        }
    }
    
}
