/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.DAO;

import Modelo.Conexion;
import Modelo.DetalleRemito;
import Modelo.dbDAO;
import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author Matias
 */
public class DetalleRemitoDAOImpl implements dbDAO{

    @Override
    public ArrayList listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregar(Object nuevo) {
        boolean flag = false;
        DetalleRemito nuevodetalle = (DetalleRemito) nuevo;
        Session s = Conexion.getSession();
        try {
            s.beginTransaction();
            s.save(nuevodetalle);
            s.getTransaction().commit();            
            flag=new StockLibreriaDAOImpl().agregar(nuevodetalle);
                        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            s.close();
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
    
}
