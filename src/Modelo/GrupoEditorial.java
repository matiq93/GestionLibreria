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
public class GrupoEditorial {
    private int id;
    private String nombre;
    private double descuento;
    private CuentaProveedor Cuenta;

    public GrupoEditorial() {
    }

    public GrupoEditorial(String nombre, double descuento) {
        this.nombre = nombre;
        this.descuento = descuento;
        
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

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public CuentaProveedor getCuenta() {
        return Cuenta;
    }

    public void setCuenta(CuentaProveedor Cuenta) {
        this.Cuenta = Cuenta;
    }
            
}
