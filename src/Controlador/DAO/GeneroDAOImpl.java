/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.DAO;

import Modelo.Conexion;
import Modelo.Genero;
import Modelo.dbDAO;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Matias
 */
public class GeneroDAOImpl implements dbDAO{

    @Override
    public ArrayList listarTodos() {
        ArrayList<Genero> lista = new ArrayList();
        Session s= Conexion.getSession();
        try {
            Query q = s.getNamedQuery("listar generos");
            lista = (ArrayList)q.list();
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object leer(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object cargarPorId(int id) {
        Genero genero = null;
        Session s = Conexion.getSession();
        try {
            Query q = s.getNamedQuery("genero x id");
            q.setParameter("id", id);
            genero = (Genero)q.uniqueResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            s.close();
            return genero;
        }
    }

    @Override
    public ArrayList listarFiltradoXNombre(String filtro) {
        ArrayList<Genero> lista = new ArrayList();
        Session s= Conexion.getSession();
        String busqueda = "%"+filtro+"%";
        try {
            Query q = s.getNamedQuery("listar generos filtrado");
            q.setParameter("nombre", busqueda);
            lista = (ArrayList) q.list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }finally{
            s.close();
            return lista;
        }
        
    }
    
}
