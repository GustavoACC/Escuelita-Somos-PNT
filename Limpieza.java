package com.ejercicio;

public class Limpieza extends Producto {
    
    private int Contenido;
    
    public Limpieza(int precio, String descripcion, int contenido){
       super(precio,descripcion);
       this.Contenido = contenido;
    }
    
    @Override
    public String toString(){
       return "Nombre: " + this.Descripcion + " /// Contenido: " + this.Contenido + "ml /// Precio: $" + this.Precio;
    }
}
