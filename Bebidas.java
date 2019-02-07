package com.ejercicio;

public class Bebidas extends Producto {
    
    private double Contenido;
    
    public Bebidas(int precio, String descripcion, double contenido){
       super(precio,descripcion);
       this.Contenido = contenido;
    }
    
    @Override
    public String toString(){
        
       return "Nombre: " + this.Descripcion + " /// Litros: " + this.Contenido + " /// Precio: $" + this.Precio;
    }
    
}
