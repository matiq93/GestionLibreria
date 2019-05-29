/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Matias
 */
public class SelloEditorial {
    private int id;
    private String nombre;
    private GrupoEditorial grupo;

    public SelloEditorial(String nombre, GrupoEditorial grupo) {
        this.nombre = nombre;
        this.grupo = grupo;
    }
    
    public SelloEditorial() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GrupoEditorial getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoEditorial grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return nombre;
    }
            
            
}
