package com.ejercicio;

public class Frutas extends Producto {
    
    private String Contenido;
    
    public Frutas(int precio, String descripcion, String contenido){
       super(precio,descripcion);
       this.Contenido = contenido;
    }
    
    @Override
    public String toString(){
        
       return "Nombre: " + this.Descripcion + " /// Precio: $" + this.Precio + " /// Unidad de venta: " + this.Contenido;
    }
    
    
}
