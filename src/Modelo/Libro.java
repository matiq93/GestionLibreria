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
public class Libro {
    private int id;
    private String ISBN;
    private double precio;
    private String titulo;
    private Escritor autor;
    private Genero genero;
    private SelloEditorial editorial;

    public Libro(String ISBN, double precio, String titulo, Escritor autor, Genero genero, SelloEditorial editorial) {
        this.ISBN = ISBN;
        this.precio = precio;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.editorial = editorial;
    }

    public Libro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Escritor getAutor() {
        return autor;
    }

    public void setAutor(Escritor autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public SelloEditorial getEditorial() {
        return editorial;
    }

    public void setEditorial(SelloEditorial editorial) {
        this.editorial = editorial;
    }
    
    
}
