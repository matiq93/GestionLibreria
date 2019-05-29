/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.DAO;

import Modelo.dbDAO;
import Modelo.Conexion;
import Modelo.CuentaProveedor;
import Modelo.GrupoEditorial;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Matias
 */
public class GrupoEditorialDAOImpl implements dbDAO {

    @Override
    public ArrayList listarTodos() {
        ArrayList<GrupoEditorial> lista = new ArrayList();
        Session s = Conexion.getSession();
        try {
            Query q = s.getNamedQuery("listar Grupos Editoriales");
            lista = (ArrayList) q.list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            s.close();
            return lista;
        }
    }

    @Override
    public boolean agregar(Object nuevo) {
        boolean flag = false;
        GrupoEditorial nuevoGrupo= (GrupoEditorial)nuevo;
        Session s = Conexion.getSession();
        try {
            s.beginTransaction();
            CuentaProveedor cuenta = new CuentaProveedor();
            s.save(cuenta);
            s.getTransaction().commit();
            nuevoGrupo.setCuenta(cuenta);
            s.beginTransaction();
            s.save(nuevoGrupo);
            s.getTransaction().commit();
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
    public ArrayList listarFiltradoXNombre(String filtro) {
        ArrayList<GrupoEditorial> lista = new ArrayList();
        Session s = Conexion.getSession();
        String busqueda= "%"+filtro+"%";
        try {
            Query q = s.getNamedQuery("Grupo filtrado");
            q.setParameter("nombre", busqueda);
            lista = (ArrayList) q.list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            s.close();
            return lista;
        }
    }

    @Override
    public Object cargarPorId(int id) {
        GrupoEditorial Grupo = null;
        Session s = Conexion.getSession();
        try {
            Query q = s.getNamedQuery("Grupo x ID");
            q.setParameter("id", id);
            Grupo = (GrupoEditorial) q.uniqueResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            s.close();
            return Grupo;
        }
    }

}
