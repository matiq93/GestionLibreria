/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.DAO;

import Modelo.Conexion;
import Modelo.DetalleRemito;
import Modelo.Remito;
import Modelo.dbDAO;
import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author Matias
 */
public class RemitoDAOImpl implements dbDAO{

    @Override
    public ArrayList listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregar(Object nuevo) {
        Session s = Conexion.getSession();
        boolean flag= false;
        Remito nuevoremito = (Remito)nuevo;
        try {
            s.beginTransaction();
            s.save(nuevoremito);
            s.getTransaction().commit();
            flag=true;
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
    
    public boolean agregarRemito (Remito remito, ArrayList<DetalleRemito> detalles){
        agregar(remito);
        DetalleRemitoDAOImpl daoDetalle = new DetalleRemitoDAOImpl();
        for (DetalleRemito detalle :detalles) {
            detalle.setRemito(remito);
            daoDetalle.agregar(detalle);
            
        }
        

        
return true;
    }
}
