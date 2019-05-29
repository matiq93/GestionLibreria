/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.DAO;

import Modelo.Conexion;
import Modelo.SelloEditorial;
import Modelo.dbDAO;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Matias
 */
public class SelloEditorialDAOImpl implements dbDAO{

    @Override
    public ArrayList listarTodos() {
        ArrayList <SelloEditorial> lista = new ArrayList();
        Session s = Conexion.getSession();
        try {
            Query q = s.getNamedQuery("Listar sellos");
            lista = (ArrayList<SelloEditorial>) q.list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }finally{
            s.close();
            return lista;
        }
    }

    @Override
    public boolean agregar(Object nuevo) {
        boolean flag =false;
        Session s = Conexion.getSession();
       try {
            SelloEditorial nuevoSello = (SelloEditorial)nuevo;
            s.beginTransaction();
            s.save(nuevoSello);
            s.getTransaction().commit();
            flag=true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
    public Object cargarPorId(int id) {
        SelloEditorial sello = null;
        Session s = Conexion.getSession();
        try {
            Query q = s.getNamedQuery("sello x id");
            q.setParameter("id", id);
            sello = (SelloEditorial) q.uniqueResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }finally{
            s.close();
            return sello;
        } 
    }

    @Override
    public ArrayList listarFiltradoXNombre(String filtro) {
        ArrayList <SelloEditorial> lista = new ArrayList();
        Session s = Conexion.getSession();
        String busqueda = "%"+filtro+"%";
        try {
            Query q = s.getNamedQuery("Listar sellos filtrado");
            q.setParameter("nombre", busqueda);
            lista = (ArrayList<SelloEditorial>) q.list();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }finally{
            s.close();
            return lista;
        }    
        
    }
    
}
