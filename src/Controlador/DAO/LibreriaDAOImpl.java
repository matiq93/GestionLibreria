/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.DAO;

import Modelo.Conexion;
import Modelo.dbDAO;
import java.util.ArrayList;
import Modelo.Libreria;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author Matias
 */
public class LibreriaDAOImpl implements dbDAO{

    @Override
    public ArrayList listarTodos() {
        ArrayList<Libreria> lista= new ArrayList<>();
        Session s =Conexion.getSession();
        try {
            Query q = s.getNamedQuery("Listar Todos");
            lista =(ArrayList) q.list();            
        } catch (Exception e) {
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
        
        ArrayList <Libreria> lista= new ArrayList<>(); 
        
         try {
            lista = this.listarTodos();
        } catch (Exception e) {
            throw e;
        }           
        
        Libreria aux = null;
        for (Libreria lib : lista) {
            if (lib.toString().equals(nombre)) {
                aux= lib;
                break;
            }
        }
        return aux;
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
