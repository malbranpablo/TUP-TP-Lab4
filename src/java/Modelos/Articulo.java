/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Pablo
 */
public class Articulo {
    
    private int id_articulo;
    private String nombre;
    private int precio;
    private String descripcion;

    public Articulo(int id_articulo, String nombre, int precio, String descripcion) {
        this.id_articulo = id_articulo;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Articulo{" + "id_articulo=" + id_articulo + ", nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
}
