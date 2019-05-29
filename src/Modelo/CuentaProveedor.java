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
public class CuentaProveedor {
   private int id ;
   private double saldo;

    public CuentaProveedor() {
        this.saldo = 0;
    }

    @Override
    public String toString() {
        return String.valueOf(saldo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

      
}
