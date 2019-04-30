/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public interface dbDAO {
    public ArrayList listarTodos();
    public boolean agregar();
    public Object leer(String nombre);
    public ArrayList listarFiltradoXNombre();
}
