/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Matias
 */
public class Remito {
    private int id;
    private GrupoEditorial grupo;
    private Date fecha;

    public Remito() {
    }

    public Remito(GrupoEditorial grupo, Date fecha) {
        this.grupo = grupo;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GrupoEditorial getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoEditorial grupo) {
        this.grupo = grupo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}


