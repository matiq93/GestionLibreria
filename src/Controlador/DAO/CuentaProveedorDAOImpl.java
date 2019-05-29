/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.DAO;

import Modelo.Conexion;
import Modelo.CuentaProveedor;
import Modelo.dbDAO;
import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author Matias
 */
public class CuentaProveedorDAOImpl implements dbDAO{

    @Override
    public ArrayList listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregar(Object nuevo) {
        Session s = Conexion.getSession();
        boolean flag = false;
        try {
            s.save(new CuentaProveedor());
            flag= true;            
        } catch (Exception e) {
            throw e;
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
    public ArrayList listarFiltradoXNombre(String filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object cargarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
