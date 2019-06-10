/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.DAO;

import Modelo.Conexion;
import Modelo.Libro;
import Modelo.dbDAO;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Matias
 */
public class LibroDAOImpl implements dbDAO{

    @Override
    public ArrayList listarTodos() {
        ArrayList<Libro> lista= new ArrayList<>();
        Session s = Conexion.getSession();
        try {
            Query q = s.getNamedQuery("listar libros");
            lista=(ArrayList<Libro>) q.list();
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
        Libro nuevoLibro = (Libro) nuevo;
        Session s= Conexion.getSession();
        boolean flag=false;
        try {
            s.beginTransaction();
            s.save(nuevoLibro);
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
        Libro libro= null;
        Session s =Conexion.getSession();
        try {
            Query q= s.getNamedQuery("libros filtrado por ISBN");
            q.setParameter("aux", nombre);
            libro = (Libro) q.uniqueResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            s.close();
            return libro;
        }
            
    }

    @Override
    public Object cargarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList listarFiltradoXNombre(String filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList listarFiltrado (String aux, int condicion){
         ArrayList<Libro> lista= new ArrayList<>();
        Session s = Conexion.getSession();
        String filtro ="%"+aux+"%";
        try {
              switch (condicion){
            case 1: { 
                Query q= s.getNamedQuery("libros filtrado por ISBN");
                q.setParameter("aux", filtro);
                lista = (ArrayList<Libro>) q.list();
                break;
            }
            case 2: {
                Query q= s.getNamedQuery("libros filtrado por Titulo");
                q.setParameter("aux", filtro);
                lista = (ArrayList<Libro>) q.list();
                break;
            }
        }
        }  catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }finally{
            s.close();
            return lista;
        }
    }
    
    public boolean cambiarPrecio(Libro libro){
        boolean flag=false;
        Session s = Conexion.getSession();
        try {
            s.beginTransaction();
            s.update(libro);
            s.getTransaction().commit();
            flag=true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            s.close();
            return flag;
        }
    }
    
    public ArrayList listarFiltradoPorGrupo(int idGrupo){
       ArrayList<Libro> lista= new ArrayList<>();
        Session s = Conexion.getSession();
        try {
            Query q = s.getNamedQuery("libros filtrado por Grupo");
            q.setParameter("id", idGrupo);
            lista = (ArrayList<Libro>) q.list();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            s.close();
            return lista;
        }
    }
    public ArrayList listarFiltradoPorGrupoeISBN(int idGrupo, String ISBN){
        ArrayList<Libro> lista= new ArrayList<>();
        Session s = Conexion.getSession();
        String filtro="%"+ISBN+"%";
        try {
            Query q = s.getNamedQuery("libros filtrado por Grupo y Por ISBN");
            q.setParameter("id", idGrupo);
            q.setParameter("isbn", filtro);
            lista = (ArrayList<Libro>) q.list();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            s.close();
            return lista;
        }
    }
    
}
